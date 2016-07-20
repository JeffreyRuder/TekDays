package com.tekdays

import grails.test.spock.IntegrationSpec

class TaskServiceIntegrationSpec extends IntegrationSpec {

    def taskService

    def setup() {
        new TekUser(fullName: "Test User", userName: "tester", email: 'test@email.com', website: 'test.com', bio: 'A test person.').save()
    }

    def cleanup() {
    }

    void "test addDefaultTasks"() {
        when: "we pass an event to taskService.addDefaultTasks"

            def event = new TekEvent(name: 'Test Event', city: 'Test City', description: 'Test Description', organizer: TekUser.findByUserName('tester'),
                venue: 'Test Center', startDate: new Date(), endDate: new Date() + 1)
            taskService.addDefaultTasks(event)

        then: "the event will have default tasks"
            event.tasks.size() > 1
    }
}
