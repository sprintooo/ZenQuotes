package com.himanshu.androidbasics.network;

import com.himanshu.androidbasics.AppState;
import retrofit2.Response;
import retrofit2.http.GET;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/himanshu/androidbasics/network/QuoteService;", "", "getAllTheQuotes", "", "Lcom/himanshu/androidbasics/AppState$SampleQuote;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQuoteOfTheDay", "app_debug"})
public abstract interface QuoteService {
    
    @retrofit2.http.GET(value = "today")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getQuoteOfTheDay(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.himanshu.androidbasics.AppState.SampleQuote>> $completion);
    
    @retrofit2.http.GET(value = "quotes")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAllTheQuotes(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.himanshu.androidbasics.AppState.SampleQuote>> $completion);
}