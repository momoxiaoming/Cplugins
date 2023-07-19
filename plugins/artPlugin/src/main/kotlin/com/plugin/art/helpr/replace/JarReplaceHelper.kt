package com.plugin.art.helpr.replace

import com.android.build.api.transform.Format
import com.android.build.api.transform.TransformInput
import com.android.build.api.transform.TransformOutputProvider
import com.android.utils.FileUtils
import com.plugin.art.log.GLog
import com.plugin.art.utils.ScanUtil
import org.apache.commons.codec.digest.DigestUtils
import java.io.File
import java.io.FileOutputStream
import java.util.jar.JarFile
import java.util.jar.JarOutputStream
import java.util.zip.ZipEntry
import org.apache.commons.io.IOUtils
/**
 * JarScanHelper
 *
 * @author mmxm
 * @date 2022/5/26 17:53
 */
object JarReplaceHelper {

    fun scanJar(transformInput: TransformInput, outputProvider: TransformOutputProvider) {
        // scan all jars
        transformInput.jarInputs.forEach { jarInput ->
            var destName = jarInput.name
            // rename jar files
            val hexName = DigestUtils.md5Hex(jarInput.file.absolutePath)
            if (destName.endsWith(".jar")) {
                destName = destName.substring(0, destName.length - 4)
            }
            // input file
            val src = jarInput.file
            // output file
            val dest = outputProvider.getContentLocation(
                destName + "_" + hexName,
                jarInput.contentTypes,
                jarInput.scopes,
                Format.JAR
            )
            handleJarFile(src)
            FileUtils.copyFile(src, dest)
        }
    }

    private fun handleJarFile(src:File){
        val jarFile = JarFile(src)
        val tempFile = File(src.parent + File.separator + "${src.name}.jar")
        if (tempFile.exists()) {
            tempFile.delete()
        }
        val jarOutputStream = JarOutputStream(FileOutputStream(tempFile))
        val enumeration = jarFile.entries()
        while (enumeration.hasMoreElements()) {
            val jarEntry = enumeration.nextElement()
            val entryName = jarEntry.name
            val zipEntry = ZipEntry(entryName)
            val inputStream = jarFile.getInputStream(zipEntry)
            jarOutputStream.putNextEntry(zipEntry)

            if (ScanUtil.filterClass(entryName)) {
                GLog.i("JarReplaceHelper-->$entryName")
                val codes=ScanUtil.scanClass(inputStream)
                if (codes != null) {
                    jarOutputStream.write(codes)
                }
            } else {
                jarOutputStream.write(IOUtils.toByteArray(inputStream))
            }
        }
        //结束
        jarOutputStream.close()
        jarFile.close()

        if (src.exists()) {
            src.delete()
        }
        tempFile.renameTo(src)
    }
}