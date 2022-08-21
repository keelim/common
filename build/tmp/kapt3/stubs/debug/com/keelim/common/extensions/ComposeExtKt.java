package com.keelim.common.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\u0002\b\tH\u0003\u001a!\u0010\n\u001a\u00020\u00012\u0013\b\b\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\tH\u0087\b\u00f8\u0001\u0000\u001a/\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00032\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\u0002\b\tH\u0002\u001a%\u0010\r\u001a\u00020\u0001*\u00020\u000e2\u0013\b\b\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\tH\u0086\b\u00f8\u0001\u0000\u001a1\u0010\u000f\u001a\u00020\u0005*\u00020\u00102\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00112\u0013\b\b\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\tH\u0086\b\u00f8\u0001\u0000\u001a3\u0010\u0012\u001a\u00020\u0001*\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00152\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\u0002\b\t\u001a3\u0010\u0012\u001a\u00020\u0001*\u00020\u00102\b\b\u0001\u0010\u0014\u001a\u00020\u00152\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\u0002\b\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0016"}, d2 = {"BottomSheetWrapper", "", "parent", "Landroid/view/ViewGroup;", "composeView", "Landroidx/compose/ui/platform/ComposeView;", "content", "Lkotlin/Function1;", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "SetUp", "addContentToView", "viewGroup", "activityComposeView", "Landroidx/activity/ComponentActivity;", "fragmentComposeView", "Landroidx/fragment/app/Fragment;", "Landroidx/compose/runtime/CompositionContext;", "showAsBottomSheet", "Landroid/app/Activity;", "id", "", "common_debug"})
public final class ComposeExtKt {
    
    public static final void showAsBottomSheet(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$showAsBottomSheet, @androidx.annotation.IdRes()
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> content) {
    }
    
    public static final void showAsBottomSheet(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$showAsBottomSheet, @androidx.annotation.IdRes()
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> content) {
    }
    
    private static final void addContentToView(android.view.ViewGroup viewGroup, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void BottomSheetWrapper(android.view.ViewGroup parent, androidx.compose.ui.platform.ComposeView composeView, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable()
    @kotlin.Suppress(names = {"NOTHING_TO_INLINE"})
    public static final void SetUp(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> content) {
    }
    
    @kotlin.Suppress(names = {"NOTHING_TO_INLINE"})
    public static final void activityComposeView(@org.jetbrains.annotations.NotNull()
    androidx.activity.ComponentActivity $this$activityComposeView, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> content) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"NOTHING_TO_INLINE"})
    public static final androidx.compose.ui.platform.ComposeView fragmentComposeView(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$fragmentComposeView, @org.jetbrains.annotations.Nullable()
    androidx.compose.runtime.CompositionContext parent, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> content) {
        return null;
    }
}