package com.mckj.junkCode.templates.add

import org.objectweb.asm.Label
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes

/**
 * Template7
 *
 * @author mmxm
 * @date 2023/7/11 15:43
 */
object Template7 {
    fun fillfromCode(methodVisitor: MethodVisitor) {
        methodVisitor.visitCode()
        val label0 = Label()
        methodVisitor.visitLabel(label0)
        methodVisitor.visitLineNumber(1283, label0)
        methodVisitor.visitLdcInsn("abcd")
        methodVisitor.visitMethodInsn(
            Opcodes.INVOKEVIRTUAL,
            "java/lang/String",
            "getBytes",
            "()[B",
            false
        )
        methodVisitor.visitVarInsn(Opcodes.ASTORE, 0)
        val label1 = Label()
        methodVisitor.visitLabel(label1)
        methodVisitor.visitLineNumber(1284, label1)
        methodVisitor.visitInsn(Opcodes.ICONST_0)
        methodVisitor.visitVarInsn(Opcodes.ISTORE, 1)
        val label2 = Label()
        methodVisitor.visitLabel(label2)
        methodVisitor.visitLineNumber(1285, label2)
        methodVisitor.visitVarInsn(Opcodes.ALOAD, 0)
        methodVisitor.visitInsn(Opcodes.ARRAYLENGTH)
        methodVisitor.visitVarInsn(Opcodes.ISTORE, 2)
        val label3 = Label()
        methodVisitor.visitLabel(label3)
        methodVisitor.visitLineNumber(1286, label3)
        methodVisitor.visitInsn(Opcodes.ICONST_0)
        methodVisitor.visitVarInsn(Opcodes.ISTORE, 3)
        val label4 = Label()
        methodVisitor.visitLabel(label4)
        methodVisitor.visitLineNumber(1287, label4)
        methodVisitor.visitInsn(Opcodes.ICONST_0)
        methodVisitor.visitVarInsn(Opcodes.ISTORE, 4)
        val label5 = Label()
        methodVisitor.visitLabel(label5)
        methodVisitor.visitLineNumber(1288, label5)
        methodVisitor.visitInsn(Opcodes.ICONST_0)
        methodVisitor.visitVarInsn(Opcodes.ISTORE, 5)
        val label6 = Label()
        methodVisitor.visitLabel(label6)
        methodVisitor.visitLineNumber(1289, label6)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 33)
        methodVisitor.visitIntInsn(Opcodes.NEWARRAY, Opcodes.T_INT)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitInsn(Opcodes.ICONST_0)
        methodVisitor.visitInsn(Opcodes.ICONST_0)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitInsn(Opcodes.ICONST_1)
        methodVisitor.visitInsn(Opcodes.ICONST_1)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitInsn(Opcodes.ICONST_2)
        methodVisitor.visitInsn(Opcodes.ICONST_3)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitInsn(Opcodes.ICONST_3)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 7)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitInsn(Opcodes.ICONST_4)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 15)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitInsn(Opcodes.ICONST_5)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 31)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 6)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 63)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 7)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 127)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 8)
        methodVisitor.visitIntInsn(Opcodes.SIPUSH, 255)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 9)
        methodVisitor.visitIntInsn(Opcodes.SIPUSH, 511)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 10)
        methodVisitor.visitIntInsn(Opcodes.SIPUSH, 1023)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 11)
        methodVisitor.visitIntInsn(Opcodes.SIPUSH, 2047)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 12)
        methodVisitor.visitIntInsn(Opcodes.SIPUSH, 4095)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 13)
        methodVisitor.visitIntInsn(Opcodes.SIPUSH, 8191)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 14)
        methodVisitor.visitIntInsn(Opcodes.SIPUSH, 16383)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 15)
        methodVisitor.visitIntInsn(Opcodes.SIPUSH, 32767)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 16)
        methodVisitor.visitLdcInsn(65535)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 17)
        methodVisitor.visitLdcInsn(131071)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 18)
        methodVisitor.visitLdcInsn(262143)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 19)
        methodVisitor.visitLdcInsn(524287)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 20)
        methodVisitor.visitLdcInsn(1048575)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 21)
        methodVisitor.visitLdcInsn(2097151)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 22)
        methodVisitor.visitLdcInsn(4194303)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 23)
        methodVisitor.visitLdcInsn(8388607)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 24)
        methodVisitor.visitLdcInsn(16777215)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 25)
        methodVisitor.visitLdcInsn(33554431)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 26)
        methodVisitor.visitLdcInsn(67108863)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 27)
        methodVisitor.visitLdcInsn(134217727)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 28)
        methodVisitor.visitLdcInsn(268435455)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 29)
        methodVisitor.visitLdcInsn(536870911)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 30)
        methodVisitor.visitLdcInsn(1073741823)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 31)
        methodVisitor.visitLdcInsn(2147483647)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitInsn(Opcodes.DUP)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 32)
        methodVisitor.visitInsn(Opcodes.ICONST_M1)
        methodVisitor.visitInsn(Opcodes.IASTORE)
        methodVisitor.visitVarInsn(Opcodes.ASTORE, 6)
        val label7 = Label()
        methodVisitor.visitLabel(label7)
        methodVisitor.visitLineNumber(1299, label7)
        methodVisitor.visitLdcInsn(10L)
        methodVisitor.visitVarInsn(Opcodes.LSTORE, 7)
        val label8 = Label()
        methodVisitor.visitLabel(label8)
        methodVisitor.visitLineNumber(1300, label8)
        methodVisitor.visitInsn(Opcodes.ICONST_2)
        methodVisitor.visitVarInsn(Opcodes.ISTORE, 9)
        val label9 = Label()
        methodVisitor.visitLabel(label9)
        methodVisitor.visitLineNumber(1301, label9)
        methodVisitor.visitInsn(Opcodes.LCONST_0)
        methodVisitor.visitVarInsn(Opcodes.LSTORE, 10)
        val label10 = Label()
        methodVisitor.visitLabel(label10)
        methodVisitor.visitLineNumber(1302, label10)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 8)
        methodVisitor.visitVarInsn(Opcodes.ISTORE, 12)
        val label11 = Label()
        methodVisitor.visitLabel(label11)
        methodVisitor.visitLineNumber(1304, label11)
        methodVisitor.visitVarInsn(Opcodes.ALOAD, 0)
        methodVisitor.visitInsn(Opcodes.ARRAYLENGTH)
        methodVisitor.visitIntInsn(Opcodes.NEWARRAY, Opcodes.T_BYTE)
        methodVisitor.visitVarInsn(Opcodes.ASTORE, 13)
        val label12 = Label()
        methodVisitor.visitLabel(label12)
        methodVisitor.visitLineNumber(1306, label12)
        methodVisitor.visitInsn(Opcodes.ICONST_0)
        methodVisitor.visitVarInsn(Opcodes.ISTORE, 14)
        val label13 = Label()
        methodVisitor.visitLabel(label13)
        methodVisitor.visitLineNumber(1308, label13)
        methodVisitor.visitVarInsn(Opcodes.ILOAD, 1)
        methodVisitor.visitVarInsn(Opcodes.ILOAD, 2)
        methodVisitor.visitInsn(Opcodes.IADD)
        methodVisitor.visitVarInsn(Opcodes.ISTORE, 15)
        val label14 = Label()
        methodVisitor.visitLabel(label14)
        methodVisitor.visitLineNumber(1309, label14)
        methodVisitor.visitInsn(Opcodes.ICONST_0)
        methodVisitor.visitVarInsn(Opcodes.ISTORE, 16)
        val label15 = Label()
        methodVisitor.visitLabel(label15)
        methodVisitor.visitLineNumber(1311, label15)
        methodVisitor.visitVarInsn(Opcodes.ILOAD, 3)
        methodVisitor.visitVarInsn(Opcodes.ISTORE, 17)
        val label16 = Label()
        methodVisitor.visitLabel(label16)
        methodVisitor.visitLineNumber(1313, label16)
        methodVisitor.visitFrame(
            Opcodes.F_NEW,
            16,
            arrayOf<Any>(
                "[B",
                Opcodes.INTEGER,
                Opcodes.INTEGER,
                Opcodes.INTEGER,
                Opcodes.INTEGER,
                Opcodes.INTEGER,
                "[I",
                Opcodes.LONG,
                Opcodes.INTEGER,
                Opcodes.LONG,
                Opcodes.INTEGER,
                "[B",
                Opcodes.INTEGER,
                Opcodes.INTEGER,
                Opcodes.INTEGER,
                Opcodes.INTEGER
            ),
            0,
            arrayOf()
        )
        methodVisitor.visitVarInsn(Opcodes.ILOAD, 1)
        methodVisitor.visitVarInsn(Opcodes.ILOAD, 15)
        val label17 = Label()
        methodVisitor.visitJumpInsn(Opcodes.IF_ICMPGE, label17)
        val label18 = Label()
        methodVisitor.visitLabel(label18)
        methodVisitor.visitLineNumber(1316, label18)
        methodVisitor.visitVarInsn(Opcodes.ALOAD, 0)
        methodVisitor.visitVarInsn(Opcodes.ILOAD, 1)
        methodVisitor.visitIincInsn(1, 1)
        methodVisitor.visitInsn(Opcodes.BALOAD)
        methodVisitor.visitIntInsn(Opcodes.SIPUSH, 255)
        methodVisitor.visitInsn(Opcodes.IAND)
        methodVisitor.visitInsn(Opcodes.I2L)
        methodVisitor.visitVarInsn(Opcodes.LSTORE, 10)
        val label19 = Label()
        methodVisitor.visitLabel(label19)
        methodVisitor.visitLineNumber(1318, label19)
        methodVisitor.visitVarInsn(Opcodes.LLOAD, 7)
        methodVisitor.visitVarInsn(Opcodes.LLOAD, 10)
        methodVisitor.visitVarInsn(Opcodes.ILOAD, 9)
        methodVisitor.visitInsn(Opcodes.LSHL)
        methodVisitor.visitInsn(Opcodes.LOR)
        methodVisitor.visitVarInsn(Opcodes.LSTORE, 7)
        val label20 = Label()
        methodVisitor.visitLabel(label20)
        methodVisitor.visitLineNumber(1320, label20)
        methodVisitor.visitIincInsn(9, 8)
        val label21 = Label()
        methodVisitor.visitLabel(label21)
        methodVisitor.visitLineNumber(1322, label21)
        methodVisitor.visitVarInsn(Opcodes.ILOAD, 3)
        methodVisitor.visitVarInsn(Opcodes.ILOAD, 12)
        methodVisitor.visitInsn(Opcodes.ISUB)
        methodVisitor.visitVarInsn(Opcodes.ISTORE, 17)
        val label22 = Label()
        methodVisitor.visitLabel(label22)
        methodVisitor.visitLineNumber(1323, label22)
        methodVisitor.visitVarInsn(Opcodes.ALOAD, 13)
        methodVisitor.visitVarInsn(Opcodes.ILOAD, 16)
        methodVisitor.visitInsn(Opcodes.DUP2)
        methodVisitor.visitInsn(Opcodes.BALOAD)
        methodVisitor.visitInsn(Opcodes.ICONST_0)
        methodVisitor.visitInsn(Opcodes.IOR)
        methodVisitor.visitInsn(Opcodes.I2B)
        methodVisitor.visitInsn(Opcodes.BASTORE)
        val label23 = Label()
        methodVisitor.visitLabel(label23)
        methodVisitor.visitLineNumber(1325, label23)
        methodVisitor.visitFrame(
            Opcodes.F_NEW,
            16,
            arrayOf<Any>(
                "[B",
                Opcodes.INTEGER,
                Opcodes.INTEGER,
                Opcodes.INTEGER,
                Opcodes.INTEGER,
                Opcodes.INTEGER,
                "[I",
                Opcodes.LONG,
                Opcodes.INTEGER,
                Opcodes.LONG,
                Opcodes.INTEGER,
                "[B",
                Opcodes.INTEGER,
                Opcodes.INTEGER,
                Opcodes.INTEGER,
                Opcodes.INTEGER
            ),
            0,
            arrayOf()
        )
        methodVisitor.visitVarInsn(Opcodes.ILOAD, 17)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 8)
        val label24 = Label()
        methodVisitor.visitJumpInsn(Opcodes.IF_ICMPGE, label24)
        val label25 = Label()
        methodVisitor.visitLabel(label25)
        methodVisitor.visitLineNumber(1326, label25)
        methodVisitor.visitVarInsn(Opcodes.ALOAD, 13)
        methodVisitor.visitIincInsn(16, 1)
        methodVisitor.visitVarInsn(Opcodes.ILOAD, 16)
        methodVisitor.visitInsn(Opcodes.DUP2)
        methodVisitor.visitInsn(Opcodes.BALOAD)
        methodVisitor.visitInsn(Opcodes.I2L)
        methodVisitor.visitVarInsn(Opcodes.LLOAD, 7)
        methodVisitor.visitVarInsn(Opcodes.ILOAD, 17)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 8)
        methodVisitor.visitInsn(Opcodes.ISUB)
        methodVisitor.visitInsn(Opcodes.LSHR)
        methodVisitor.visitVarInsn(Opcodes.ALOAD, 6)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 8)
        methodVisitor.visitInsn(Opcodes.IALOAD)
        methodVisitor.visitInsn(Opcodes.I2L)
        methodVisitor.visitInsn(Opcodes.LAND)
        methodVisitor.visitInsn(Opcodes.LOR)
        methodVisitor.visitInsn(Opcodes.L2I)
        methodVisitor.visitInsn(Opcodes.I2B)
        methodVisitor.visitInsn(Opcodes.BASTORE)
        val label26 = Label()
        methodVisitor.visitLabel(label26)
        methodVisitor.visitLineNumber(1327, label26)
        methodVisitor.visitIincInsn(17, 8)
        methodVisitor.visitJumpInsn(Opcodes.GOTO, label23)
        methodVisitor.visitLabel(label24)
        methodVisitor.visitLineNumber(1330, label24)
        methodVisitor.visitFrame(
            Opcodes.F_NEW,
            16,
            arrayOf<Any>(
                "[B",
                Opcodes.INTEGER,
                Opcodes.INTEGER,
                Opcodes.INTEGER,
                Opcodes.INTEGER,
                Opcodes.INTEGER,
                "[I",
                Opcodes.LONG,
                Opcodes.INTEGER,
                Opcodes.LONG,
                Opcodes.INTEGER,
                "[B",
                Opcodes.INTEGER,
                Opcodes.INTEGER,
                Opcodes.INTEGER,
                Opcodes.INTEGER
            ),
            0,
            arrayOf()
        )
        methodVisitor.visitVarInsn(Opcodes.ALOAD, 13)
        methodVisitor.visitIincInsn(16, 1)
        methodVisitor.visitVarInsn(Opcodes.ILOAD, 16)
        methodVisitor.visitInsn(Opcodes.DUP2)
        methodVisitor.visitInsn(Opcodes.BALOAD)
        methodVisitor.visitInsn(Opcodes.I2L)
        methodVisitor.visitVarInsn(Opcodes.LLOAD, 7)
        methodVisitor.visitVarInsn(Opcodes.ALOAD, 6)
        methodVisitor.visitVarInsn(Opcodes.ILOAD, 17)
        methodVisitor.visitInsn(Opcodes.IALOAD)
        methodVisitor.visitInsn(Opcodes.I2L)
        methodVisitor.visitInsn(Opcodes.LAND)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 8)
        methodVisitor.visitVarInsn(Opcodes.ILOAD, 17)
        methodVisitor.visitInsn(Opcodes.ISUB)
        methodVisitor.visitInsn(Opcodes.LSHL)
        methodVisitor.visitInsn(Opcodes.LOR)
        methodVisitor.visitInsn(Opcodes.L2I)
        methodVisitor.visitInsn(Opcodes.I2B)
        methodVisitor.visitInsn(Opcodes.BASTORE)
        val label27 = Label()
        methodVisitor.visitLabel(label27)
        methodVisitor.visitLineNumber(1331, label27)
        methodVisitor.visitIincInsn(17, -8)
        val label28 = Label()
        methodVisitor.visitLabel(label28)
        methodVisitor.visitLineNumber(1333, label28)
        methodVisitor.visitVarInsn(Opcodes.ILOAD, 3)
        methodVisitor.visitVarInsn(Opcodes.ISTORE, 17)
        val label29 = Label()
        methodVisitor.visitLabel(label29)
        methodVisitor.visitLineNumber(1334, label29)
        methodVisitor.visitVarInsn(Opcodes.ALOAD, 13)
        methodVisitor.visitVarInsn(Opcodes.ILOAD, 16)
        methodVisitor.visitInsn(Opcodes.DUP2)
        methodVisitor.visitInsn(Opcodes.BALOAD)
        methodVisitor.visitInsn(Opcodes.I2L)
        methodVisitor.visitVarInsn(Opcodes.LLOAD, 7)
        methodVisitor.visitVarInsn(Opcodes.ALOAD, 6)
        methodVisitor.visitVarInsn(Opcodes.ILOAD, 12)
        methodVisitor.visitInsn(Opcodes.IALOAD)
        methodVisitor.visitInsn(Opcodes.I2L)
        methodVisitor.visitInsn(Opcodes.LAND)
        methodVisitor.visitInsn(Opcodes.ICONST_1)
        methodVisitor.visitInsn(Opcodes.LSHL)
        methodVisitor.visitInsn(Opcodes.LOR)
        methodVisitor.visitInsn(Opcodes.L2I)
        methodVisitor.visitInsn(Opcodes.I2B)
        methodVisitor.visitInsn(Opcodes.BASTORE)
        val label30 = Label()
        methodVisitor.visitLabel(label30)
        methodVisitor.visitLineNumber(1335, label30)
        methodVisitor.visitVarInsn(Opcodes.LLOAD, 7)
        methodVisitor.visitVarInsn(Opcodes.ILOAD, 12)
        methodVisitor.visitInsn(Opcodes.LSHR)
        methodVisitor.visitVarInsn(Opcodes.LSTORE, 7)
        val label31 = Label()
        methodVisitor.visitLabel(label31)
        methodVisitor.visitLineNumber(1336, label31)
        methodVisitor.visitVarInsn(Opcodes.ILOAD, 17)
        methodVisitor.visitVarInsn(Opcodes.ILOAD, 12)
        methodVisitor.visitInsn(Opcodes.ISUB)
        methodVisitor.visitVarInsn(Opcodes.ISTORE, 17)
        val label32 = Label()
        methodVisitor.visitLabel(label32)
        methodVisitor.visitLineNumber(1339, label32)
        methodVisitor.visitVarInsn(Opcodes.ALOAD, 13)
        methodVisitor.visitIincInsn(16, 1)
        methodVisitor.visitVarInsn(Opcodes.ILOAD, 16)
        methodVisitor.visitInsn(Opcodes.DUP2)
        methodVisitor.visitInsn(Opcodes.BALOAD)
        methodVisitor.visitInsn(Opcodes.I2L)
        methodVisitor.visitVarInsn(Opcodes.LLOAD, 7)
        methodVisitor.visitLdcInsn(255L)
        methodVisitor.visitInsn(Opcodes.LAND)
        methodVisitor.visitInsn(Opcodes.LOR)
        methodVisitor.visitInsn(Opcodes.L2I)
        methodVisitor.visitInsn(Opcodes.I2B)
        methodVisitor.visitInsn(Opcodes.BASTORE)
        val label33 = Label()
        methodVisitor.visitLabel(label33)
        methodVisitor.visitLineNumber(1340, label33)
        methodVisitor.visitVarInsn(Opcodes.LLOAD, 7)
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, 8)
        methodVisitor.visitInsn(Opcodes.LSHR)
        methodVisitor.visitVarInsn(Opcodes.LSTORE, 7)
        val label34 = Label()
        methodVisitor.visitLabel(label34)
        methodVisitor.visitLineNumber(1341, label34)
        methodVisitor.visitIincInsn(17, -8)
        val label35 = Label()
        methodVisitor.visitLabel(label35)
        methodVisitor.visitLineNumber(1344, label35)
        methodVisitor.visitVarInsn(Opcodes.ALOAD, 13)
        methodVisitor.visitIincInsn(16, 1)
        methodVisitor.visitVarInsn(Opcodes.ILOAD, 16)
        methodVisitor.visitInsn(Opcodes.DUP2)
        methodVisitor.visitInsn(Opcodes.BALOAD)
        methodVisitor.visitInsn(Opcodes.I2L)
        methodVisitor.visitVarInsn(Opcodes.LLOAD, 7)
        methodVisitor.visitVarInsn(Opcodes.ALOAD, 6)
        methodVisitor.visitVarInsn(Opcodes.ILOAD, 17)
        methodVisitor.visitInsn(Opcodes.IALOAD)
        methodVisitor.visitInsn(Opcodes.I2L)
        methodVisitor.visitInsn(Opcodes.LAND)
        methodVisitor.visitInsn(Opcodes.LOR)
        methodVisitor.visitInsn(Opcodes.L2I)
        methodVisitor.visitInsn(Opcodes.I2B)
        methodVisitor.visitInsn(Opcodes.BASTORE)
        val label36 = Label()
        methodVisitor.visitLabel(label36)
        methodVisitor.visitLineNumber(1345, label36)
        methodVisitor.visitIincInsn(17, -8)
        val label37 = Label()
        methodVisitor.visitLabel(label37)
        methodVisitor.visitLineNumber(1348, label37)
        methodVisitor.visitVarInsn(Opcodes.ILOAD, 17)
        methodVisitor.visitInsn(Opcodes.INEG)
        methodVisitor.visitVarInsn(Opcodes.ISTORE, 12)
        val label38 = Label()
        methodVisitor.visitLabel(label38)
        methodVisitor.visitLineNumber(1350, label38)
        methodVisitor.visitIincInsn(14, 1)
        methodVisitor.visitVarInsn(Opcodes.ILOAD, 14)
        methodVisitor.visitVarInsn(Opcodes.ILOAD, 4)
        methodVisitor.visitInsn(Opcodes.IREM)
        methodVisitor.visitJumpInsn(Opcodes.IFNE, label16)
        val label39 = Label()
        methodVisitor.visitLabel(label39)
        methodVisitor.visitLineNumber(1351, label39)
        methodVisitor.visitInsn(Opcodes.ICONST_0)
        methodVisitor.visitVarInsn(Opcodes.ISTORE, 12)
        val label40 = Label()
        methodVisitor.visitLabel(label40)
        methodVisitor.visitLineNumber(1352, label40)
        methodVisitor.visitInsn(Opcodes.ICONST_0)
        methodVisitor.visitVarInsn(Opcodes.ISTORE, 9)
        methodVisitor.visitJumpInsn(Opcodes.GOTO, label16)
        methodVisitor.visitLabel(label17)
        methodVisitor.visitLineNumber(1357, label17)
        methodVisitor.visitFrame(
            Opcodes.F_NEW,
            16,
            arrayOf<Any>(
                "[B",
                Opcodes.INTEGER,
                Opcodes.INTEGER,
                Opcodes.INTEGER,
                Opcodes.INTEGER,
                Opcodes.INTEGER,
                "[I",
                Opcodes.LONG,
                Opcodes.INTEGER,
                Opcodes.LONG,
                Opcodes.INTEGER,
                "[B",
                Opcodes.INTEGER,
                Opcodes.INTEGER,
                Opcodes.INTEGER,
                Opcodes.INTEGER
            ),
            0,
            arrayOf()
        )
        methodVisitor.visitInsn(Opcodes.RETURN)
        val label41 = Label()
        methodVisitor.visitLabel(label41)
        methodVisitor.visitLocalVariable("input", "[B", null, label1, label41, 0)
        methodVisitor.visitLocalVariable("offset", "I", null, label2, label41, 1)
        methodVisitor.visitLocalVariable("len", "I", null, label3, label41, 2)
        methodVisitor.visitLocalVariable("bits", "I", null, label4, label41, 3)
        methodVisitor.visitLocalVariable("scanLineStride", "I", null, label5, label41, 4)
        methodVisitor.visitLocalVariable("bigEndian", "Z", null, label6, label41, 5)
        methodVisitor.visitLocalVariable("MASK", "[I", null, label7, label41, 6)
        methodVisitor.visitLocalVariable("value", "J", null, label8, label41, 7)
        methodVisitor.visitLocalVariable("bits_remain", "I", null, label9, label41, 9)
        methodVisitor.visitLocalVariable("temp_byte", "J", null, label10, label41, 10)
        methodVisitor.visitLocalVariable("empty_bits", "I", null, label11, label41, 12)
        methodVisitor.visitLocalVariable("output", "[B", null, label12, label41, 13)
        methodVisitor.visitLocalVariable("strideCounter", "I", null, label13, label41, 14)
        methodVisitor.visitLocalVariable("end", "I", null, label14, label41, 15)
        methodVisitor.visitLocalVariable("bufIndex", "I", null, label15, label41, 16)
        methodVisitor.visitLocalVariable("temp", "I", null, label16, label41, 17)
        methodVisitor.visitMaxs(8, 18)
        methodVisitor.visitEnd()
    }

}