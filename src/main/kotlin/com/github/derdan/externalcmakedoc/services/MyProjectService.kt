package com.github.derdan.externalcmakedoc.services

import com.intellij.openapi.project.Project
import com.github.derdan.externalcmakedoc.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
