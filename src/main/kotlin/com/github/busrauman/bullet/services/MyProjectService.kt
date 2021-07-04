package com.github.busrauman.bullet.services

import com.github.busrauman.bullet.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
