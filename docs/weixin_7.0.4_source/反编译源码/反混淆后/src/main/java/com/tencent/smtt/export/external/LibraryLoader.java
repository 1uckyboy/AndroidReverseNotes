package com.tencent.smtt.export.external;

import android.content.Context;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.ArrayList;

public class LibraryLoader {
    private static String[] sLibrarySearchPaths = null;

    public static String[] getLibrarySearchPaths(Context context) {
        AppMethodBeat.m2504i(63770);
        String[] strArr;
        if (sLibrarySearchPaths != null) {
            strArr = sLibrarySearchPaths;
            AppMethodBeat.m2505o(63770);
            return strArr;
        } else if (context == null) {
            strArr = new String[]{"/system/lib"};
            AppMethodBeat.m2505o(63770);
            return strArr;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(getNativeLibraryDir(context));
            arrayList.add("/system/lib");
            strArr = new String[arrayList.size()];
            arrayList.toArray(strArr);
            sLibrarySearchPaths = strArr;
            AppMethodBeat.m2505o(63770);
            return strArr;
        }
    }

    public static String getNativeLibraryDir(Context context) {
        AppMethodBeat.m2504i(63771);
        int i = VERSION.SDK_INT;
        String str;
        if (i >= 9) {
            str = context.getApplicationInfo().nativeLibraryDir;
            AppMethodBeat.m2505o(63771);
            return str;
        } else if (i >= 4) {
            str = context.getApplicationInfo().dataDir + "/lib";
            AppMethodBeat.m2505o(63771);
            return str;
        } else {
            str = "/data/data/" + context.getPackageName() + "/lib";
            AppMethodBeat.m2505o(63771);
            return str;
        }
    }

    public static void loadLibrary(Context context, String str) {
        AppMethodBeat.m2504i(63772);
        String[] librarySearchPaths = getLibrarySearchPaths(context);
        String mapLibraryName = System.mapLibraryName(str);
        for (String str2 : librarySearchPaths) {
            String str22 = str22 + "/" + mapLibraryName;
            if (new File(str22).exists()) {
                try {
                    System.load(str22);
                    AppMethodBeat.m2505o(63772);
                    return;
                } catch (Exception e) {
                    AppMethodBeat.m2505o(63772);
                    return;
                }
            }
        }
        try {
            System.loadLibrary(str);
            AppMethodBeat.m2505o(63772);
        } catch (Exception e2) {
            AppMethodBeat.m2505o(63772);
        }
    }
}
