package com.tekdays

import grails.transaction.Transactional

@Transactional
class TaskService {

    def serviceMethod() {

    }

    def addDefaultTasks(tekEvent) {
        if (tekEvent.tasks?.size() > 0) return //only populate tasks for new event

        tekEvent.addToTasks new Task(title: "Identify potential venues", dueDate: tekEvent.startDate, completed: false)
        tekEvent.addToTasks new Task(title: "Get price and availability of venues", dueDate: tekEvent.startDate, completed: false)
        tekEvent.addToTasks new Task(title: "Identify potential sponsors", dueDate: tekEvent.startDate, completed: false)
        tekEvent.addToTasks new Task(title: "Design promotional materials", dueDate: tekEvent.startDate, completed: false)
        tekEvent.addToTasks new Task(title: "Identify advertising outlets", dueDate: tekEvent.startDate, completed: false)
        tekEvent.addToTasks new Task(title: "Find goodies/swag providers", dueDate: tekEvent.startDate, completed: false)
        tekEvent.save()

    }
}
