package com.himanshu.androidbasics.di.module;

import com.himanshu.androidbasics.network.QuoteService;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import retrofit2.Retrofit;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/himanshu/androidbasics/di/module/NetworkingModule;", "", "()V", "contentType", "Lokhttp3/MediaType;", "json", "Lkotlinx/serialization/json/Json;", "provideQuoteService", "Lcom/himanshu/androidbasics/network/QuoteService;", "retrofit", "Lretrofit2/Retrofit;", "provideRetrofit", "app_release"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class NetworkingModule {
    @org.jetbrains.annotations.NotNull
    private final okhttp3.MediaType contentType = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.serialization.json.Json json = null;
    
    public NetworkingModule() {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Retrofit provideRetrofit() {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.himanshu.androidbasics.network.QuoteService provideQuoteService(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
}