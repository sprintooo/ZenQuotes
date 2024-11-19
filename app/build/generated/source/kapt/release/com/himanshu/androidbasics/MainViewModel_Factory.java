package com.himanshu.androidbasics;

import com.himanshu.androidbasics.network.QuoteRepository;
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
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<QuoteRepository> quoteRepositoryProvider;

  public MainViewModel_Factory(Provider<QuoteRepository> quoteRepositoryProvider) {
    this.quoteRepositoryProvider = quoteRepositoryProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(quoteRepositoryProvider.get());
  }

  public static MainViewModel_Factory create(Provider<QuoteRepository> quoteRepositoryProvider) {
    return new MainViewModel_Factory(quoteRepositoryProvider);
  }

  public static MainViewModel newInstance(QuoteRepository quoteRepository) {
    return new MainViewModel(quoteRepository);
  }
}
