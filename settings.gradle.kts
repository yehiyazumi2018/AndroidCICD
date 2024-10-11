pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        google()
        mavenCentral()
        gradlePluginPortal()
        // Add jcenter if you still need it (note that it is deprecated)
        jcenter()
        maven {
            url = uri("https://maven.google.com/")
            name = "Google"
        }
    }

    // Adding classpath dependencies for the plugins
    plugins {
        id("com.android.application") version "4.0.2"
        id("org.sonarqube") version "2.7.1"
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        // Add jcenter if needed
        jcenter()
        maven {
            url = uri("https://maven.google.com/")
            name = "Google"
        }
    }
}

rootProject.name = "AndroidCICD"
include(":app")
