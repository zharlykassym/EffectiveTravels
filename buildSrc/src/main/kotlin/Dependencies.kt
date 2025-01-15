import org.gradle.api.artifacts.dsl.DependencyHandler

object Dependencies {
    const val gson = "com.google.code.gson:gson:2.8.7"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"

    const val dagger2 = "com.google.dagger:dagger:${Versions.dagger2}"
    const val dagger2Compiler = "com.google.dagger:dagger-compiler:${Versions.dagger2}"
    const val dagger2AndroidProcessor = "com.google.dagger:dagger-android-processor:${Versions.dagger2}"

}

fun DependencyHandler.retrofit() {
    implementation(Dependencies.retrofit)
    implementation(Dependencies.gson)
    implementation(Dependencies.retrofitConverter)
}

fun DependencyHandler.dagger2() {
    implementation(Dependencies.dagger2)
    ksp(Dependencies.dagger2Compiler)
    ksp(Dependencies.dagger2AndroidProcessor)
}