package com.example.localeexamplewithmargins;

import android.app.Activity;
import android.content.Intent;

public class Utils
{
    private static int sTheme;

    public final static int THEME_WITHSMALLMARGIN = 0;
    public final static int THEME_WITHMEDIUMMARGIN = 1;
    public final static int THEME_WITHLARGEMARGIN = 2;

    /**
     * Set the theme of the Activity, and restart it by creating a new Activity of the same type.
     */
    public static void changeToTheme(Activity activity, int theme)
    {
        sTheme = theme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));

    }

    /** Set the theme of the activity, according to the configuration. */
    public static void onActivityCreateSetTheme(Activity activity)
    {
        switch (sTheme)
        {
            default:
            case THEME_WITHSMALLMARGIN:
                activity.setTheme(R.style.AppThemeWithMargin1dp);
                break;
            case THEME_WITHMEDIUMMARGIN:
                activity.setTheme(R.style.AppThemeWithMargin3dp);
                break;
            case THEME_WITHLARGEMARGIN:
                activity.setTheme(R.style.AppThemeWithMargin10dp);
                break;
        }
    }
}
