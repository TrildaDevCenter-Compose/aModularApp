# aModularAppTwo-build-crash
a sample tiny android compose modular app to show a kotlin generator task crash in build 
with IR Lowering error


Good News in this project the IR Lowering error is fixed :
subproject involing comose weere missing :

    buildFeatures {
        compose = true
        aidl = false
        buildConfig = false
        renderScript = false
        shaders = false
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.androidxComposeCompiler.get()
    }

and I also set a better toml file
better dependencies
better plugin usgae (applied) in each sub project

the application plugin can only be used in and app module 
the library plug in can only be used in a library module
and so on ...depending on module type

at the end once the Sync was correct 
I was   able to fix import that were missing

and eventielly , at the end 
Ta Da : it builds !



that project does not add build logic or buildsrc  subproject to build Convention Gradle plugins to 
share several plugin  and dependencies sync with gadle among all sub module