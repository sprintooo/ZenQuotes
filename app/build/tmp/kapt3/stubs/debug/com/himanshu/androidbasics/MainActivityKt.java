package com.himanshu.androidbasics;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.CardColors;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.work.WorkManager;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.ViewModelLifecycle;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007\u001a\b\u0010\u0005\u001a\u00020\u0001H\u0007\u001a2\u0010\u0006\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000bH\u0007\u001a\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0004H\u0007\u001a\u001c\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007\u00a8\u0006\u0014"}, d2 = {"AllQuotes", "", "allQuotes", "", "Lcom/himanshu/androidbasics/AppState$SampleQuote;", "GreetingPreview", "HeaderNavigation", "navItems", "Lcom/himanshu/androidbasics/AppState$Page;", "selected", "onClick", "Lkotlin/Function1;", "", "QuoteCard", "quote", "Quotes", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "viewModel", "Lcom/himanshu/androidbasics/MainViewModel;", "app_debug"})
public final class MainActivityKt {
    
    @androidx.compose.runtime.Composable
    public static final void Quotes(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull
    com.himanshu.androidbasics.MainViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void AllQuotes(@org.jetbrains.annotations.NotNull
    java.util.List<com.himanshu.androidbasics.AppState.SampleQuote> allQuotes) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void HeaderNavigation(@org.jetbrains.annotations.NotNull
    java.util.List<com.himanshu.androidbasics.AppState.Page> navItems, @org.jetbrains.annotations.NotNull
    com.himanshu.androidbasics.AppState.Page selected, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void QuoteCard(@org.jetbrains.annotations.NotNull
    com.himanshu.androidbasics.AppState.SampleQuote quote) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true, showSystemUi = true)
    @androidx.compose.runtime.Composable
    public static final void GreetingPreview() {
    }
}