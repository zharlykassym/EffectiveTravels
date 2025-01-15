import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.implementation(dependency: String){
    add("implementation",dependency)
}

fun DependencyHandler.test(dependency: String){
    add("test",dependency)
}

fun DependencyHandler.androidTest(dependency: String){
    add("androidTest",dependency)
}

fun DependencyHandler.ksp(dependency: String){
    add("ksp",dependency)
}