plugins {
    kotlin("multiplatform") version "1.8.21"
}

group = "ndk.banee"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    val hostOs = System.getProperty("os.name")
    val isArm64 = System.getProperty("os.arch") == "aarch64"
    val isMingwX64 = hostOs.startsWith("Windows")
    val mingwX64Target = when {
        hostOs == "Mac OS X" && isArm64 -> macosArm64("mingwX64")
        hostOs == "Mac OS X" && !isArm64 -> macosX64("mingwX64")
        hostOs == "Linux" && isArm64 -> linuxArm64("mingwX64")
        hostOs == "Linux" && !isArm64 -> linuxX64("mingwX64")
        isMingwX64 -> mingwX64("mingwX64")
        else -> throw GradleException("Host OS is not supported in Kotlin/Native.")
    }

    mingwX64Target.apply {
        binaries {
            executable {
                entryPoint = "main"
            }
        }
    }
    sourceSets {
        val mingwX64Main by getting
        val mingwX64Test by getting
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(20))
    }
}
