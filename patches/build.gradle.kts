group = "app.mix"

patches {
    about {
        name = "Mix Patches"
        description = "Mix Patches for Morphe"
        source = "git@github.com:IMXEren/mix-patches.git"
        author = "IMXEren"
        contact = "vickrey_readings@simplelogin.com"
        website = "https://github.com/IMXEren/mix-patches"
        license = "Additional conditions under GPL section 7 apply: attribution and project name restrictions. See LICENSE file."
    }
}

kotlin {
    compilerOptions {
        freeCompilerArgs = listOf("-Xcontext-receivers")
    }
}
