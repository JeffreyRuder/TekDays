package com.tekdays

import grails.transaction.Transactional

@Transactional
class TaskService {

    def serviceMethod() {

    }

    def addDefaultTasks(tekEvent) {
        if (tekEvent.tasks?.size() > 0) return //only populate tasks for new event

        tekEvent.addToTasks new Task(title: "Identify potential venues")
        tekEvent.addToTasks new Task(title: "Get price and availability of venues")
        tekEvent.addToTasks new Task(title: "Identify potential sponsors")
        tekEvent.addToTasks new Task(title: "Design promotional materials")
        tekEvent.addToTasks new Task(title: "Identify advertising outlets")
        tekEvent.addToTasks new Task(title: "Find goodies/swag providers")
        tekEvent.save()

    }
}
