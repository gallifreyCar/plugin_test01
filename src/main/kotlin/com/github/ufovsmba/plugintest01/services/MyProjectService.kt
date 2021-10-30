package com.github.ufovsmba.plugintest01.services

import com.intellij.openapi.project.Project
import com.github.ufovsmba.plugintest01.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
