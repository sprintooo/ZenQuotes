package com.himanshu.androidbasics.network;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class QuoteRepository_Factory implements Factory<QuoteRepository> {
  private final Provider<QuoteService> quoteServiceProvider;

  public QuoteRepository_Factory(Provider<QuoteService> quoteServiceProvider) {
    this.quoteServiceProvider = quoteServiceProvider;
  }

  @Override
  public QuoteRepository get() {
    return newInstance(quoteServiceProvider.get());
  }

  public static QuoteRepository_Factory create(Provider<QuoteService> quoteServiceProvider) {
    return new QuoteRepository_Factory(quoteServiceProvider);
  }

  public static QuoteRepository newInstance(QuoteService quoteService) {
    return new QuoteRepository(quoteService);
  }
}
