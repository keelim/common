// Generated by Dagger (https://dagger.dev).
package com.keelim.common.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata
@QualifierMetadata("com.keelim.common.Dispatcher")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DispatchersModule_ProvidesIODispatcherFactory implements Factory<CoroutineDispatcher> {
  @Override
  public CoroutineDispatcher get() {
    return providesIODispatcher();
  }

  public static DispatchersModule_ProvidesIODispatcherFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineDispatcher providesIODispatcher() {
    return Preconditions.checkNotNullFromProvides(DispatchersModule.INSTANCE.providesIODispatcher());
  }

  private static final class InstanceHolder {
    private static final DispatchersModule_ProvidesIODispatcherFactory INSTANCE = new DispatchersModule_ProvidesIODispatcherFactory();
  }
}
