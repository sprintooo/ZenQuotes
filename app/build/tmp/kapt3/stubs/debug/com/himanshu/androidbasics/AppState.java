package com.himanshu.androidbasics;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.himanshu.androidbasics.network.QuoteRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0004\u001a\u001b\u001c\u001dB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u00c6\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001e"}, d2 = {"Lcom/himanshu/androidbasics/AppState;", "", "navigation", "Lcom/himanshu/androidbasics/AppState$Navigation;", "quoteOfTheDay", "Lcom/himanshu/androidbasics/AppState$SampleQuote;", "allQuotes", "", "(Lcom/himanshu/androidbasics/AppState$Navigation;Lcom/himanshu/androidbasics/AppState$SampleQuote;Ljava/util/List;)V", "getAllQuotes", "()Ljava/util/List;", "getNavigation", "()Lcom/himanshu/androidbasics/AppState$Navigation;", "getQuoteOfTheDay", "()Lcom/himanshu/androidbasics/AppState$SampleQuote;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "Navigation", "Page", "SampleQuote", "app_debug"})
public final class AppState {
    @org.jetbrains.annotations.NotNull
    private final com.himanshu.androidbasics.AppState.Navigation navigation = null;
    @org.jetbrains.annotations.NotNull
    private final com.himanshu.androidbasics.AppState.SampleQuote quoteOfTheDay = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.himanshu.androidbasics.AppState.SampleQuote> allQuotes = null;
    @org.jetbrains.annotations.NotNull
    public static final com.himanshu.androidbasics.AppState.Companion Companion = null;
    
    public AppState(@org.jetbrains.annotations.NotNull
    com.himanshu.androidbasics.AppState.Navigation navigation, @org.jetbrains.annotations.NotNull
    com.himanshu.androidbasics.AppState.SampleQuote quoteOfTheDay, @org.jetbrains.annotations.NotNull
    java.util.List<com.himanshu.androidbasics.AppState.SampleQuote> allQuotes) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.himanshu.androidbasics.AppState.Navigation getNavigation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.himanshu.androidbasics.AppState.SampleQuote getQuoteOfTheDay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.himanshu.androidbasics.AppState.SampleQuote> getAllQuotes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.himanshu.androidbasics.AppState.Navigation component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.himanshu.androidbasics.AppState.SampleQuote component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.himanshu.androidbasics.AppState.SampleQuote> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.himanshu.androidbasics.AppState copy(@org.jetbrains.annotations.NotNull
    com.himanshu.androidbasics.AppState.Navigation navigation, @org.jetbrains.annotations.NotNull
    com.himanshu.androidbasics.AppState.SampleQuote quoteOfTheDay, @org.jetbrains.annotations.NotNull
    java.util.List<com.himanshu.androidbasics.AppState.SampleQuote> allQuotes) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/himanshu/androidbasics/AppState$Companion;", "", "()V", "initial", "Lcom/himanshu/androidbasics/AppState;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.himanshu.androidbasics.AppState initial() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0004H\u00c6\u0003J#\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/himanshu/androidbasics/AppState$Navigation;", "", "navItems", "", "Lcom/himanshu/androidbasics/AppState$Page;", "selected", "(Ljava/util/List;Lcom/himanshu/androidbasics/AppState$Page;)V", "getNavItems", "()Ljava/util/List;", "getSelected", "()Lcom/himanshu/androidbasics/AppState$Page;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Navigation {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.himanshu.androidbasics.AppState.Page> navItems = null;
        @org.jetbrains.annotations.NotNull
        private final com.himanshu.androidbasics.AppState.Page selected = null;
        
        public Navigation(@org.jetbrains.annotations.NotNull
        java.util.List<com.himanshu.androidbasics.AppState.Page> navItems, @org.jetbrains.annotations.NotNull
        com.himanshu.androidbasics.AppState.Page selected) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.himanshu.androidbasics.AppState.Page> getNavItems() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.himanshu.androidbasics.AppState.Page getSelected() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.himanshu.androidbasics.AppState.Page> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.himanshu.androidbasics.AppState.Page component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.himanshu.androidbasics.AppState.Navigation copy(@org.jetbrains.annotations.NotNull
        java.util.List<com.himanshu.androidbasics.AppState.Page> navItems, @org.jetbrains.annotations.NotNull
        com.himanshu.androidbasics.AppState.Page selected) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u0019\u0010\r\u001a\u00020\u0005H\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u000e\u0010\bJ*\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0004\u001a\u00020\u0005\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006\u0018"}, d2 = {"Lcom/himanshu/androidbasics/AppState$Page;", "", "title", "", "color", "Landroidx/compose/ui/graphics/Color;", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColor-0d7_KjU", "()J", "J", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component2-0d7_KjU", "copy", "copy-4WTKRHQ", "(Ljava/lang/String;J)Lcom/himanshu/androidbasics/AppState$Page;", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Page {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String title = null;
        private final long color = 0L;
        
        private Page(java.lang.String title, long color) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B1\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001J!\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u00c7\u0001R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006\""}, d2 = {"Lcom/himanshu/androidbasics/AppState$SampleQuote;", "", "seen1", "", "quote", "", "author", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getAuthor$annotations", "()V", "getAuthor", "()Ljava/lang/String;", "getQuote$annotations", "getQuote", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "app_debug"})
    public static final class SampleQuote {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String quote = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String author = null;
        @org.jetbrains.annotations.NotNull
        public static final com.himanshu.androidbasics.AppState.SampleQuote.Companion Companion = null;
        
        public SampleQuote(@org.jetbrains.annotations.NotNull
        java.lang.String quote, @org.jetbrains.annotations.NotNull
        java.lang.String author) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getQuote() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "q")
        @java.lang.Deprecated
        public static void getQuote$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getAuthor() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "a")
        @java.lang.Deprecated
        public static void getAuthor$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.himanshu.androidbasics.AppState.SampleQuote copy(@org.jetbrains.annotations.NotNull
        java.lang.String quote, @org.jetbrains.annotations.NotNull
        java.lang.String author) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.jvm.JvmStatic
        public static final void write$Self(@org.jetbrains.annotations.NotNull
        com.himanshu.androidbasics.AppState.SampleQuote self, @org.jetbrains.annotations.NotNull
        kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull
        kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"com/himanshu/androidbasics/AppState.SampleQuote.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/himanshu/androidbasics/AppState$SampleQuote;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_debug"})
        @java.lang.Deprecated
        public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.himanshu.androidbasics.AppState.SampleQuote> {
            @org.jetbrains.annotations.NotNull
            public static final com.himanshu.androidbasics.AppState.SampleQuote.$serializer INSTANCE = null;
            
            private $serializer() {
                super();
            }
            
            @java.lang.Override
            @org.jetbrains.annotations.NotNull
            public kotlinx.serialization.KSerializer<?>[] childSerializers() {
                return null;
            }
            
            @java.lang.Override
            @org.jetbrains.annotations.NotNull
            public com.himanshu.androidbasics.AppState.SampleQuote deserialize(@org.jetbrains.annotations.NotNull
            kotlinx.serialization.encoding.Decoder decoder) {
                return null;
            }
            
            @java.lang.Override
            @org.jetbrains.annotations.NotNull
            public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
                return null;
            }
            
            @java.lang.Override
            public void serialize(@org.jetbrains.annotations.NotNull
            kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull
            com.himanshu.androidbasics.AppState.SampleQuote value) {
            }
            
            @java.lang.Override
            @org.jetbrains.annotations.NotNull
            public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/himanshu/androidbasics/AppState$SampleQuote$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/himanshu/androidbasics/AppState$SampleQuote;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlinx.serialization.KSerializer<com.himanshu.androidbasics.AppState.SampleQuote> serializer() {
                return null;
            }
        }
    }
}