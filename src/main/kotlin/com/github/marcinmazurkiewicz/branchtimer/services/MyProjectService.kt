package com.github.marcinmazurkiewicz.branchtimer.services

import com.intellij.openapi.project.Project
import com.github.marcinmazurkiewicz.branchtimer.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
