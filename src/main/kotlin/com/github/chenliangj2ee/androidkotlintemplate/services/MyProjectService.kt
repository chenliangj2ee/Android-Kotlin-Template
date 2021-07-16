package com.github.chenliangj2ee.androidkotlintemplate.services

import com.github.chenliangj2ee.androidkotlintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
