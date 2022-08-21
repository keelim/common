package com.keelim.common.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/keelim/common/di/DispatchersModule;", "", "()V", "providesDefaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "providesIODispatcher", "providesMainDispatcher", "common_debug"})
@dagger.Module()
public final class DispatchersModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.keelim.common.di.DispatchersModule INSTANCE = null;
    
    private DispatchersModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.keelim.common.Dispatcher(dispatcher = com.keelim.common.KeelimDispatchers.IO)
    @dagger.Provides()
    public final kotlinx.coroutines.CoroutineDispatcher providesIODispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.keelim.common.Dispatcher(dispatcher = com.keelim.common.KeelimDispatchers.MAIN)
    @dagger.Provides()
    public final kotlinx.coroutines.CoroutineDispatcher providesMainDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.keelim.common.Dispatcher(dispatcher = com.keelim.common.KeelimDispatchers.DEFAULT)
    @dagger.Provides()
    public final kotlinx.coroutines.CoroutineDispatcher providesDefaultDispatcher() {
        return null;
    }
}