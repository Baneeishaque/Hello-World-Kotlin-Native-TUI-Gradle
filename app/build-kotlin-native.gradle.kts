plugins {
    kotlin("multiplatform") version "1.7.21"
}

repositories {
    jcenter()
}

kotlin {
  androidNativeArm32("androidNativeArm32") {
    binaries {
      executable()
    }
  }
  androidNativeArm64("androidNativeArm64") {
    binaries {
      executable()
    }
  }
  androidNativeX86("androidNativeX86") {
    binaries {
      executable()
    }
  }
  androidNativeX64("androidNativeX64") {
    binaries {
      executable()
    }
  }
  iosArm32("iosArm32") {
    binaries {
      executable()
    }
  }
  iosArm64("iosArm64") {
    binaries {
      executable()
    }
  }
  iosX64("iosX64") {
    binaries {
      executable()
    }
  }
  watchosArm32("watchosArm32") {
    binaries {
      executable()
    }
  }
  watchosArm64("watchosArm64") {
    binaries {
      executable()
    }
  }
  watchosX86("watchosX86") {
    binaries {
      executable()
    }
  }
  tvosArm64("tvosArm64") {
    binaries {
      executable()
    }
  }
  tvosX64("tvosX64") {
    binaries {
      executable()
    }
  }
  linuxArm64("linuxArm64") {
    binaries {
      executable()
    }
  }
  linuxArm32Hfp("linuxArm32Hfp") {
    binaries {
      executable()
    }
  }
  linuxMips32("linuxMips32") {
    binaries {
      executable()
    }
  }
  linuxMipsel32("linuxMipsel32") {
    binaries {
      executable()
    }
  }
  linuxX64("linuxX64") {
    binaries {
      executable()
    }
  }
  macosX64("macosX64") {
    binaries {
      executable()
    }
  }
  mingwX64("mingwX64") {
    binaries {
      executable()
    }
  }
  mingwX86("mingwX86") {
    binaries {
      executable()
    }
  }
  wasm32("wasm32") {
    binaries {
      executable()
    }
  }
  sourceSets {
    val commonMain by getting {
        kotlin.srcDir("src/main")
        dependencies {
            api ("org.jetbrains.kotlin:kotlin-stdlib-common")
        }
    }
  }
}
