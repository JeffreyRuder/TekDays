import com.tekdays.TekEvent

class BootStrap {

    def init = { servletContext ->
        def event1 = new TekEvent(name: 'My Code Camp',
                                    city: 'Portland, OR',
                                    organizer: 'Jane Roe',
                                    venue: 'TBD',
                                    startDate: new Date('11/22/2016'),
                                    endDate: new Date('11/25/2016'),
                                    description: 'This camp will bring coders together to explore passionate, functional,' +
                                            'stateless, multithreaded programming.')
        if(!event1.save()) {
            event1.errors.allErrors.each {error ->
                println("An error occurred with event1 + ${error}")
            }
        }

        def event2 = new TekEvent(name: 'Deadly Python',
                                    city: 'Austin, TX',
                                    organizer: 'William Wallace',
                                    venue: 'Foobar Museum',
                                    startDate: new Date('10/2/2016'),
                                    endDate: new Date('10/4/2016'),
                                    description: '''Don't constrict your Python knowledge! Come explore Python with us! It'll be fun!''')
        if(!event2.save()) {
            event2.errors.allErrors.each {error ->
                println("An error occurred with event2 + ${error}")
            }
        }
    }
    def destroy = {
    }
}
