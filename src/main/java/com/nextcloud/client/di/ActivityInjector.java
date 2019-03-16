package com.nextcloud.client.di;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import dagger.android.AndroidInjection;

public class ActivityInjector implements Application.ActivityLifecycleCallbacks {

    @Override
    public final void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        if(activity instanceof Injectable) {
            AndroidInjection.inject(activity);
        }

        if(activity instanceof FragmentActivity) {
            final FragmentManager fm = ((FragmentActivity) activity).getSupportFragmentManager();
            fm.registerFragmentLifecycleCallbacks(new FragmentInjector(), true);
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        // not needed
    }

    @Override
    public final void onActivityResumed(Activity activity) {
        // not needed
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        // not needed
    }

    @Override
    public final void onActivityStopped(Activity activity) {
        // not needed
    }

    @Override
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        // not needed
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        // not needed
    }
}

