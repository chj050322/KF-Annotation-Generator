package com.github.chj050322.kfannotationgenerator.services

import com.github.chj050322.kfannotationgenerator.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
