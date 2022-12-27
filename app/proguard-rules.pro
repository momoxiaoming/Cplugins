# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

#ARouter
-keep  class com.alibaba.android.arouter.core.**{*;}
-keep public class com.alibaba.android.arouter.facade.**{*;}
-keep class * implements com.alibaba.android.arouter.facade.template.ISyringe{*;}
# If you use the byType method to obtain Service, add the following rules to protect the interface:
-keepclassmembers interface * implements com.alibaba.android.arouter.facade.template.IProvider{*;}



-keep class xtq.xcl.xbs.**{*;}

-keep class mrf.yfs.zpt.**{*;}

-keep class vtg.qrb.sby.**{*;}
-applymapping D:\zhangjinming\work\git\CPlugins\app\build\aRouterMapping.txt
-keep class ddc.dpq.ywd.**{*;}

-keep class fkg.qsn.yze.**{*;}

-keep class ymk.npi.uga.**{*;}

-keep class xrp.cgv.hiy.**{*;}

-keep class ysz.wmj.qln.**{*;}

-keep class uhx.kdk.qwb.**{*;}

-keep class mpd.ksx.tgn.**{*;}

-keep class gkj.doo.qxx.**{*;}

-keep class xhb.rjh.ler.**{*;}

-keep class sxw.kkw.vpk.**{*;}

-keep class com.lzx.als.**{*;}

-keep class com.hrw.zmp.**{*;}

-keep class com.udx.bpr.**{*;}

-keep class com.krs.uqo.**{*;}

-keep class com.iph.fug.**{*;}

-keep class com.hpy.iba.**{*;}

-keep class com.iqf.uld.**{*;}
