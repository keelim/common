package com.keelim.common.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u001a&\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u001a&\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u001a\u0014\u0010\f\u001a\u00020\u0001*\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u001a\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u0002H\u0007\u00a2\u0006\u0002\u0010\u0012\u001a\f\u0010\u0013\u001a\u00020\u0011*\u00020\u0002H\u0007\u001a\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0011*\u00020\u0002H\u0003\u00a2\u0006\u0002\u0010\u0012\u001a\u0014\u0010\u0015\u001a\u00020\u0016*\u00020\u00022\b\b\u0003\u0010\u0017\u001a\u00020\u0011\u001a\u0014\u0010\u0018\u001a\u00020\u0002*\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u0011\u001a\n\u0010\u001a\u001a\u00020\u0001*\u00020\u001b\u001a\u001f\u0010\u001c\u001a\u0004\u0018\u00010\u0016*\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 \u001a\"\u0010\u001c\u001a\u00020\u0001*\u00020!2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010#\u001a%\u0010\u001c\u001a\u00020\u0001*\u00020!2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010%\u001a\u0012\u0010&\u001a\u00020\u0001*\u00020!2\u0006\u0010\'\u001a\u00020\u0004\u001a\n\u0010(\u001a\u00020\u0001*\u00020\u001b\u001a\u001c\u0010)\u001a\u00020\u0001*\u00020\u001d2\u0006\u0010*\u001a\u00020\u00022\b\b\u0001\u0010+\u001a\u00020\u0011\u001a\u001a\u0010)\u001a\u00020\u0001*\u00020\u001d2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u001f\u001a\u0016\u0010,\u001a\u00020\u0011*\u00020\u001d2\b\b\u0001\u0010-\u001a\u00020\u0011H\u0007\u001a&\u0010.\u001a\u00020/*\u00020\u00162\u0006\u00100\u001a\u00020\u001d2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u001f2\u0006\u00102\u001a\u00020\u001f\u001a\u001e\u0010.\u001a\u00020/*\u00020\u00022\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u001f2\u0006\u00102\u001a\u00020\u001f\u001a\n\u00103\u001a\u00020\u0001*\u00020\u0002\u001a\n\u00104\u001a\u00020\u0001*\u00020\u0002\u001a\n\u00105\u001a\u00020\u0001*\u00020\u0002\u001a\n\u00106\u001a\u00020\u0001*\u00020\u0002\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00067"}, d2 = {"animateGone", "", "Landroid/view/View;", "isGone", "", "startDelay", "", "duration", "animateInvisible", "isInvisible", "animateVisible", "isVisible", "asyncText", "Landroid/widget/TextView;", "text", "", "backgroundColor", "", "(Landroid/view/View;)Ljava/lang/Integer;", "descendantBackgroundColor", "descendantBackgroundColorOrNull", "drawToBitmap", "Landroid/graphics/Bitmap;", "extraPaddingBottom", "findAncestorById", "ancestorId", "hide", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "loadAsync", "Landroid/content/Context;", "url", "", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/widget/ImageView;", "doOnEnd", "Lkotlin/Function0;", "placeholder", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Integer;)V", "setGrayscale", "enable", "show", "snack", "view", "message", "themeColor", "themeAttrId", "toCacheFile", "Ljava/io/File;", "context", "folderName", "fileName", "toGone", "toInvisible", "toVisible", "toggleVisibility", "common_debug"})
public final class ViewExtKt {
    
    public static final void toVisible(@org.jetbrains.annotations.NotNull()
    android.view.View $this$toVisible) {
    }
    
    public static final void toGone(@org.jetbrains.annotations.NotNull()
    android.view.View $this$toGone) {
    }
    
    public static final void toInvisible(@org.jetbrains.annotations.NotNull()
    android.view.View $this$toInvisible) {
    }
    
    public static final void toggleVisibility(@org.jetbrains.annotations.NotNull()
    android.view.View $this$toggleVisibility) {
    }
    
    public static final void snack(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$snack, @org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public static final void snack(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$snack, @org.jetbrains.annotations.NotNull()
    android.view.View view, @androidx.annotation.StringRes()
    int message) {
    }
    
    public static final void loadAsync(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadAsync, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.DrawableRes()
    java.lang.Integer placeholder) {
    }
    
    public static final void loadAsync(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadAsync, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> doOnEnd) {
    }
    
    public static final void setGrayscale(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$setGrayscale, boolean enable) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object loadAsync(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$loadAsync, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super android.graphics.Bitmap> p2) {
        return null;
    }
    
    public static final void asyncText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$asyncText, @org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text) {
    }
    
    public static final void animateVisible(@org.jetbrains.annotations.NotNull()
    android.view.View $this$animateVisible, boolean isVisible, long startDelay, long duration) {
    }
    
    public static final void animateInvisible(@org.jetbrains.annotations.NotNull()
    android.view.View $this$animateInvisible, boolean isInvisible, long startDelay, long duration) {
    }
    
    public static final void animateGone(@org.jetbrains.annotations.NotNull()
    android.view.View $this$animateGone, boolean isGone, long startDelay, long duration) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.io.File toCacheFile(@org.jetbrains.annotations.NotNull()
    android.view.View $this$toCacheFile, @org.jetbrains.annotations.Nullable()
    java.lang.String folderName, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.io.File toCacheFile(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap $this$toCacheFile, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String folderName, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return null;
    }
    
    /**
     * Retrieve a color from the current [android.content.res.Resources.Theme].
     */
    @androidx.annotation.ColorInt()
    public static final int themeColor(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$themeColor, @androidx.annotation.AttrRes()
    int themeAttrId) {
        return 0;
    }
    
    /**
     * Search this view and any children for a [ColorDrawable] `background` and return it's `color`,
     * else return `colorSurface`.
     */
    @androidx.annotation.ColorInt()
    public static final int descendantBackgroundColor(@org.jetbrains.annotations.NotNull()
    android.view.View $this$descendantBackgroundColor) {
        return 0;
    }
    
    @androidx.annotation.ColorInt()
    private static final java.lang.Integer descendantBackgroundColorOrNull(android.view.View $this$descendantBackgroundColorOrNull) {
        return null;
    }
    
    /**
     * Check if this [View]'s `background` is a [ColorDrawable] and if so, return it's `color`,
     * otherwise `null`.
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.ColorInt()
    public static final java.lang.Integer backgroundColor(@org.jetbrains.annotations.NotNull()
    android.view.View $this$backgroundColor) {
        return null;
    }
    
    /**
     * Walk up from a [View] looking for an ancestor with a given `id`.
     */
    @org.jetbrains.annotations.NotNull()
    public static final android.view.View findAncestorById(@org.jetbrains.annotations.NotNull()
    android.view.View $this$findAncestorById, @androidx.annotation.IdRes()
    int ancestorId) {
        return null;
    }
    
    /**
     * Potentially animate showing a [BottomNavigationView].
     *
     * Abruptly changing the visibility leads to a re-layout of main content, animating
     * `translationY` leaves a gap where the view was that content does not fill.
     *
     * Instead, take a snapshot of the view, and animate this in, only changing the visibility (and
     * thus layout) when the animation completes.
     */
    public static final void show(@org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomnavigation.BottomNavigationView $this$show) {
    }
    
    /**
     * Potentially animate hiding a [BottomNavigationView].
     *
     * Abruptly changing the visibility leads to a re-layout of main content, animating
     * `translationY` leaves a gap where the view was that content does not fill.
     *
     * Instead, take a snapshot, instantly hide the view (so content lays out to fill), then animate
     * out the snapshot.
     */
    public static final void hide(@org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomnavigation.BottomNavigationView $this$hide) {
    }
    
    /**
     * A copy of the KTX method, adding the ability to add extra padding the bottom of the [Bitmap];
     * useful when it will be used in a [android.graphics.BitmapShader][BitmapShader] with
     * a [android.graphics.Shader.TileMode.CLAMP][CLAMP tile mode].
     */
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.Bitmap drawToBitmap(@org.jetbrains.annotations.NotNull()
    android.view.View $this$drawToBitmap, @androidx.annotation.Px()
    int extraPaddingBottom) {
        return null;
    }
}