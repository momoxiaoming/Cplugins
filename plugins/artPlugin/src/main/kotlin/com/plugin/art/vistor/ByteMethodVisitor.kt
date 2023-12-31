package com.plugin.art.vistor


import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes

/**
 * 自定义方法访问模式
 *
 * @author mmxm
 * @date 2022/2/14 10:12
 */
class ByteMethodVisitor(
    val asmField: ByteClassVisitor.ASMField,
    val methodName: String,
    val owner: String,
    mv: MethodVisitor
) : MethodVisitor(Opcodes.ASM9, mv) {

    override fun visitInsn(opcode: Int) {
        if (opcode == Opcodes.RETURN && methodName == "<clinit>") {
            for (item in asmField.mStaticFinalField) {
                val value = item.value
                val name = item.name
                if(value==null|| value.isEmpty()){
                    super.visitInsn(opcode)
                    return
                }
                ReplaceVisitor.stringProguardAndReplace(value, mv)
                super.visitFieldInsn(179, this.owner, name, "Ljava/lang/String;");
                return
            }
        }
        super.visitInsn(opcode)

    }

    override fun visitFieldInsn(opcode: Int, owner: String?, name: String?, desc: String?) {
        super.visitFieldInsn(opcode, owner, name, desc)

    }

    /**
     * ldc操作指令
     * 将一个常量加载到操作栈用 作者：Nickid2018 https://www.bilibili.com/read/cv10794772 出处：bilibili
     * @param cst Any
     */
    override fun visitLdcInsn(cst: Any?) {
        if (cst != null && cst is String && cst.length != 0) {
            ReplaceVisitor.stringProguardAndReplace(cst, mv)
            return
        }
        super.visitLdcInsn(cst)
    }

}

