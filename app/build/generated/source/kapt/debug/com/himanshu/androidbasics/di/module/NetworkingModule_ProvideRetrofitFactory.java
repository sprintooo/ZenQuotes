package com.himanshu.androidbasics.di.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import retrofit2.Retrofit;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class NetworkingModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final NetworkingModule module;

  public NetworkingModule_ProvideRetrofitFactory(NetworkingModule module) {
    this.module = module;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(module);
  }

  public static NetworkingModule_ProvideRetrofitFactory create(NetworkingModule module) {
    return new NetworkingModule_ProvideRetrofitFactory(module);
  }

  public static Retrofit provideRetrofit(NetworkingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideRetrofit());
  }
}
