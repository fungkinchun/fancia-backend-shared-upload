rootProject.name = "shared-upload"

val sharedCommonDir = file("../shared-common")
if (sharedCommonDir.isDirectory) {
    includeBuild(sharedCommonDir) {
        dependencySubstitution {
            substitute(module("com.fancia.backend.shared:common"))
                .using(project(":"))
        }
    }
}
