plugins {
    kotlin("multiplatform") version "1.8.10"
}
group = "llesha"
version = "1.0-SNAPSHOT"
repositories {
    mavenCentral()
    mavenLocal()
}
kotlin {
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"
        }
        testRuns["test"].executionTask.configure {
            useJUnit()
        }
    }
    js(IR) {
        browser()
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("com.github.h0tk3y.betterParse:better-parse:0.4.4")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jvmMain by getting {
            dependencies {
                implementation("com.github.h0tk3y.betterParse:better-parse-jvm:0.4.4")
            }
        }
        val jvmTest by getting
        val jsMain by getting {
            dependencies {
                implementation("com.github.h0tk3y.betterParse:better-parse-js:0.4.4")
            }
        }
        val jsTest by getting
    }
}