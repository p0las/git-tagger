package com.github.p0las.gittagger.services

import com.intellij.openapi.project.Project
import com.github.p0las.gittagger.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
