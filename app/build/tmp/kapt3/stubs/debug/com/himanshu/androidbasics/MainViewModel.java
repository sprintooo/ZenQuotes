package com.himanshu.androidbasics;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.himanshu.androidbasics.network.QuoteRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/himanshu/androidbasics/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "quoteRepository", "Lcom/himanshu/androidbasics/network/QuoteRepository;", "(Lcom/himanshu/androidbasics/network/QuoteRepository;)V", "_appState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/himanshu/androidbasics/AppState;", "appState", "Lkotlinx/coroutines/flow/StateFlow;", "getAppState", "()Lkotlinx/coroutines/flow/StateFlow;", "fetchData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectPage", "page", "Lcom/himanshu/androidbasics/AppState$Page;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.himanshu.androidbasics.network.QuoteRepository quoteRepository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.himanshu.androidbasics.AppState> _appState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.himanshu.androidbasics.AppState> appState = null;
    
    @javax.inject.Inject
    public MainViewModel(@org.jetbrains.annotations.NotNull
    com.himanshu.androidbasics.network.QuoteRepository quoteRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.himanshu.androidbasics.AppState> getAppState() {
        return null;
    }
    
    public final void selectPage(@org.jetbrains.annotations.NotNull
    com.himanshu.androidbasics.AppState.Page page) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}