/**
 * 版本信息
 */
interface Versions {
    def minSdk = 21
    def targetSdk = 31
    def compileSdk = 31
    def versionCode = 1
    def versionName = "1.0"
}

/**
 * 依赖库路径
 */
interface Deps {
    /*
     * AndroidX
     */
    //coreKtx
    String coreKtx = "androidx.core:core-ktx:1.6.0"
    //appcompat
    String appcompat = "androidx.appcompat:appcompat:1.3.1"
    //pagingCommon
    String pagingCommon = "androidx.paging:paging-common:3.0.1"
    //pagingRuntime
    String pagingRuntime = "androidx.paging:paging-runtime:3.0.1"
    //pagingGuava
    String pagingGuava = "androidx.paging:paging-guava:3.0.1"
    //pagingCompose
    String pagingCompose = "androidx.paging:paging-compose:1.0.0-alpha14"
    //fragmentKtx
    String fragmentKtx = "androidx.fragment:fragment-ktx:1.3.6"
    //annotations
    String annotations = "androidx.annotation:annotation:1.2.0"
    //recyclerView
    String recyclerView = "androidx.recyclerview:recyclerview:1.2.1"
    //collectionKtx
    String collectionKtx =("androidx.collection:collection-ktx:1.1.0")
    //constraintLayout
    String constraintLayout = "androidx.constraintlayout:constraintlayout:2.1.1"

    /*
     * Room
     */
    //room
    String room = "androidx.room:room-ktx:2.3.0"
    //roomRuntime
    String roomRuntime = "androidx.room:room-runtime:2.3.0"
    //roomCompiler
    String roomCompiler = "androidx.room:room-compiler:2.3.0"

    /*
     * Lifecycle
     */
    //lifecycleRuntimeTtx
    String lifecycleRuntimeTtx =("androidx.lifecycle:lifecycle-runtime-ktx:2.4.0")
    //liveDataKtx :alternatively - just LiveData
    String liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:2.4.0"
    //viewModelKtx :alternatively - just ViewModel
    String viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.0"
    //lifecycleViewModelSavedState :ViewModel新出的状态保存库
    String lifecycleViewModelSavedState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:2.4.0"


    /*
     * Navigation
     */
    //navigationUIKtx
    String navigationUIKtx = "androidx.navigation:navigation-ui-ktx:2.3.5"
    //navigationRuntimeKtx
    String navigationRuntimeKtx = "androidx.navigation:navigation-runtime-ktx:2.3.5"
    //navigationFragmentKtx
    String navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:2.3.5"
    //navigationSafeArgsGradlePlugin : classpath
    String navigationSafeArgsGradlePlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:2.3.5"

    /*
     * Google
     */
    //design
    String design = "com.google.android.material:material:1.4.0"

    /*
     * Hilt
     */
    //hiltAndroid
    String hiltAndroid = "com.google.dagger:hilt-android:2.40.5"
    //hiltAndroidCompiler
    String hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:2.40.5"
    //hiltCompiler
    String hiltCompiler = "androidx.hilt:hilt-compiler:1.0.0-alpha01"
    //hiltViewModel
    String hiltViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha01"

    /*
     * Kotlin
     */
    //kotlinStdlib
    String kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:1.5.31"
    //kotlinXCoroutinesAndroid
    String kotlinXCoroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9"
    //kotlinXCoroutinesCore
    String kotlinXCoroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9"

    /*
     * 网络
     */
    //okHttp3
    String okHttp3 = "com.squareup.okhttp3:okhttp:4.9.1"
    //okHttp3LoggingInterceptor
    String okHttp3LoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:4.9.1"
    //retrofit2
    String retrofit2 = "com.squareup.retrofit2:retrofit:2.9.0"
    //retrofit2AdapterRxJava2
    String retrofit2AdapterRxJava2 = "com.squareup.retrofit2:adapter-rxjava2:2.9.0"

    /*
     * 路由
     */
    //aRouter
    String aRouter = "com.alibaba:arouter-api:1.5.2"
    //aRouterCompiler
    String aRouterCompiler = "com.alibaba:arouter-compiler:1.5.2"

    /*
     * 图片加载
     */
    //coil
    String coil = "io.coil-kt:coil:1.4.0"
    //coilGif
    String coilGif = "io.coil-kt:coil-gif:1.4.0"
    //coilSvg
    String coilSvg = "io.coil-kt:coil-svg:1.4.0"

    /*
     * 权限
     */
    //permissionsDispatcher
    String permissionsDispatcher = "com.github.permissions-dispatcher:permissionsdispatcher:4.9.1"
    //permissionsDispatcherProcessor
    String permissionsDispatcherProcessor = "com.github.permissions-dispatcher:permissionsdispatcher-processor:4.9.1"

    //moshi
    String moshi = "com.squareup.moshi:moshi-kotlin:1.12.0"
    //moshiCodegen
    String moshiCodegen = "com.squareup.moshi:moshi-kotlin-codegen:1.12.0"
    //moshiConverter
    String moshiConverter = "com.squareup.retrofit2:converter-moshi:2.9.0"

    //mmkv
    String mmkv = 'com.tencent:mmkv-static:1.2.11'

    //LeanCloud
    String LeanCloud = 'cn.leancloud:storage-android:8.1.1'
    //RxAndroid
    String RxAndroid = 'io.reactivex.rxjava2:rxandroid:2.1.1'
}
