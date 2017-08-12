package com.guge.android.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/**
 * Created by mike on 2017/8/12.
 */

public final class SystemUtil {

    public static boolean isSystemApp(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo.flags & ApplicationInfo.FLAG_SYSTEM) != 0 &&
                (applicationInfo.flags & ApplicationInfo.FLAG_UPDATED_SYSTEM_APP) == 0;
    }
}
