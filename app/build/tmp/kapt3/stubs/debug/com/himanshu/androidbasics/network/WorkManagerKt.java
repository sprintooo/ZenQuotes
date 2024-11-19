package com.himanshu.androidbasics.network;

import android.Manifest;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.WorkRequest;
import androidx.work.WorkerParameters;
import com.himanshu.androidbasics.R;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u00a8\u0006\n"}, d2 = {"fetchDataRequest", "Landroidx/work/WorkRequest;", "getFetchDataRequest", "()Landroidx/work/WorkRequest;", "makeStatusNotification", "", "message", "", "context", "Landroid/content/Context;", "app_debug"})
public final class WorkManagerKt {
    @org.jetbrains.annotations.NotNull
    private static final androidx.work.WorkRequest fetchDataRequest = null;
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.work.WorkRequest getFetchDataRequest() {
        return null;
    }
    
    public static final void makeStatusNotification(@org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
}