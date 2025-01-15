plugins{
//    id("com.android.application") version "8.6.1" apply false
//    id("org.jetbrains.kotlin.android") version "2.0.21" apply false
    id("com.google.devtools.ksp") version "2.1.0-1.0.29"
    kotlin("jvm")
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(Dependencies.dagger2)
//        implementation("com.google.dagger:dagger-compiler:2.52")
//        ksp("com.google.dagger:dagger-compiler:2.52")

    }
}


