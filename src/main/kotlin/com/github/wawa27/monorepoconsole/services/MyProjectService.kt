package com.github.wawa27.monorepoconsole.services

import com.intellij.openapi.project.Project
import com.github.wawa27.monorepoconsole.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
