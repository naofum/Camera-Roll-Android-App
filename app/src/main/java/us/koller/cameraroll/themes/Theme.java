package us.koller.cameraroll.themes;

import android.content.Context;
import android.support.v4.content.ContextCompat;

public abstract class Theme {

    public static final int BASE_DARK = 0;
    public static final int BASE_LIGHT = 1;

    public abstract int getBaseTheme();

    public boolean isBaseLight() {
        return getBaseTheme() == BASE_LIGHT;
    }

    /*flags*/
    public abstract boolean darkStatusBarIcons();

    public abstract boolean elevatedToolbar();

    public abstract boolean darkStatusBarIconsInSelectorMode();

    /*colors*/
    abstract int getBackgroundColorRes();

    abstract int getToolbarColorRes();

    abstract int getTextColorPrimaryRes();

    abstract int getTextColorSecondaryRes();

    abstract int getAccentColorRes();

    abstract int getAccentTextColorRes();


    public int getBackgroundColor(Context context) {
        return getColor(context, getBackgroundColorRes());
    }

    public int getToolbarColor(Context context) {
        return getColor(context, getToolbarColorRes());
    }

    public int getTextColorPrimary(Context context) {
        return getColor(context, getTextColorPrimaryRes());
    }

    public int getTextColorSecondary(Context context) {
        return getColor(context, getTextColorSecondaryRes());
    }

    public int getAccentColor(Context context) {
        return getColor(context, getAccentColorRes());
    }

    public int getAccentTextColor(Context context) {
        return getColor(context, getAccentTextColorRes());
    }

    private static int getColor(Context context, int res) {
        return ContextCompat.getColor(context, res);
    }


    /*Dialog theme*/
    public abstract int getDialogThemeRes();

    @Override
    public boolean equals(Object obj) {
        Class c = this.getClass();
        return c.isInstance(obj);
    }
}