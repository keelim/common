package com.keelim.common.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001aN\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042.\u0010\u0005\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00070\u0006\"\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0086\b\u00a2\u0006\u0002\u0010\n\u001a\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0014\u0010\u000f\u001a\u00020\u0010*\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u001a\u0014\u0010\u0012\u001a\u00020\f*\u00020\u00042\b\b\u0001\u0010\u0013\u001a\u00020\f\u001a\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0015*\u00020\u00042\b\b\u0001\u0010\u0013\u001a\u00020\f\u001a\u0014\u0010\u0016\u001a\u00020\u0017*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0004H\u0002\u001aN\u0010\u0019\u001a\u00020\u0010\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042.\u0010\u0005\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00070\u0006\"\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0086\b\u00a2\u0006\u0002\u0010\u001a\u001a\u0012\u0010\u001b\u001a\u00020\u0010*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0001\u001a\u0014\u0010\u001d\u001a\u00020\u0010*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\bH\u0002\u001a\"\u0010\u001e\u001a\u00020\u0010*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100 H\u0002\u001a\u001e\u0010!\u001a\u00020\u0010*\u00020\u00042\b\b\u0001\u0010\"\u001a\u00020\f2\b\b\u0002\u0010#\u001a\u00020\f\u001a\u001c\u0010!\u001a\u00020\u0010*\u00020\u00042\u0006\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\f\u001a\u001e\u0010!\u001a\u00020\u0010*\u00020$2\b\b\u0001\u0010\"\u001a\u00020\f2\b\b\u0002\u0010#\u001a\u00020\f\u001a\u001c\u0010!\u001a\u00020\u0010*\u00020$2\u0006\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\f\u00a8\u0006%"}, d2 = {"buildIntent", "Landroid/content/Intent;", "T", "Landroid/app/Activity;", "Landroid/content/Context;", "argument", "", "Lkotlin/Pair;", "", "", "(Landroid/content/Context;[Lkotlin/Pair;)Landroid/content/Intent;", "dip", "", "dipValue", "", "executeWeb", "", "url", "getColorCompat", "colorResId", "getColorStateListCompat", "Landroid/content/res/ColorStateList;", "isValid", "", "ctx", "startActivity", "(Landroid/content/Context;[Lkotlin/Pair;)V", "startActivitySafely", "intent", "startBrowserActivity", "startNonBrowserActivity", "fallback", "Lkotlin/Function0;", "toast", "message", "duration", "Landroidx/fragment/app/Fragment;", "common_debug"})
public final class ContextExtKt {
    
    public static final void toast(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$toast, @org.jetbrains.annotations.NotNull()
    java.lang.String message, int duration) {
    }
    
    public static final void toast(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$toast, @androidx.annotation.StringRes()
    int message, int duration) {
    }
    
    public static final void toast(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$toast, @org.jetbrains.annotations.NotNull()
    java.lang.String message, int duration) {
    }
    
    public static final void toast(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$toast, @androidx.annotation.StringRes()
    int message, int duration) {
    }
    
    @androidx.annotation.Px()
    public static final int dip(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$dip, float dipValue) {
        return 0;
    }
    
    public static final int getColorCompat(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getColorCompat, @androidx.annotation.ColorRes()
    int colorResId) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.content.res.ColorStateList getColorStateListCompat(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getColorStateListCompat, @androidx.annotation.ColorRes()
    int colorResId) {
        return null;
    }
    
    public static final void startActivitySafely(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$startActivitySafely, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    private static final boolean isValid(android.content.Intent $this$isValid, android.content.Context ctx) {
        return false;
    }
    
    public static final void executeWeb(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$executeWeb, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    private static final void startBrowserActivity(android.content.Context $this$startBrowserActivity, java.lang.String url) {
    }
    
    private static final void startNonBrowserActivity(android.content.Context $this$startNonBrowserActivity, java.lang.String url, kotlin.jvm.functions.Function0<kotlin.Unit> fallback) {
    }
}