plugins {
    id("com.rtm516.mcxboxbroadcast.java-conventions")
}

dependencies {
    api(libs.gson)
    api(libs.bundles.jackson)
    api(libs.nimbus.jose.jwt)
    api(libs.java.websocket)
    api(libs.methanol)
    api(libs.minecraftauth)

    implementation("dev.onvoid.webrtc:webrtc-java:0.8.0")
    implementation("dev.onvoid.webrtc", "webrtc-java", "0.8.0", classifier = "windows-x86_64")
    implementation("dev.onvoid.webrtc", "webrtc-java", "0.8.0", classifier = "macos-x86_64")
    implementation("dev.onvoid.webrtc", "webrtc-java", "0.8.0", classifier = "macos-aarch64")
    implementation("dev.onvoid.webrtc", "webrtc-java", "0.8.0", classifier = "linux-x86_64")
    implementation("dev.onvoid.webrtc", "webrtc-java", "0.8.0", classifier = "linux-aarch64")
    implementation("dev.onvoid.webrtc", "webrtc-java", "0.8.0", classifier = "linux-aarch32")
}

sourceSets {
    main {
        blossom {
            val info = GitInfo(indraGit)
            javaSources {
                property("version", info.version)
                property("gitVersion", info.gitVersion)
                property("buildNumber", info.buildNumber.toString())
                property("branch", info.branch)
                property("commit", info.commit)
                property("repository", info.repository)
            }
        }
    }
}

description = "core"
