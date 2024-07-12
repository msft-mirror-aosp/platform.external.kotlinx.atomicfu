rootProject.name = "build-settings-logic"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }

    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}

apply(from = "src/main/kotlin/atomicfu-gradle-build-cache.settings.gradle.kts")