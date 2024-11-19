package com.himanshu.androidbasics.di.module;

import com.himanshu.androidbasics.network.QuoteService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
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
public final class NetworkingModule_ProvideQuoteServiceFactory implements Factory<QuoteService> {
  private final NetworkingModule module;

  private final Provider<Retrofit> retrofitProvider;

  public NetworkingModule_ProvideQuoteServiceFactory(NetworkingModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public QuoteService get() {
    return provideQuoteService(module, retrofitProvider.get());
  }

  public static NetworkingModule_ProvideQuoteServiceFactory create(NetworkingModule module,
      Provider<Retrofit> retrofitProvider) {
    return new NetworkingModule_ProvideQuoteServiceFactory(module, retrofitProvider);
  }

  public static QuoteService provideQuoteService(NetworkingModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.provideQuoteService(retrofit));
  }
}
