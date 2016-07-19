import com.tekdays.Sponsor
import com.tekdays.Sponsorship
import com.tekdays.TekEvent
import com.tekdays.TekUser

class BootStrap {

    def init = { servletContext ->

        new TekUser(fullName: 'Jane Roe',
                userName: 'jroe',
                password: 'hashmepls',
                email: 'jroe@mcc.com',
                website: 'blog.mcc.com',
                bio: '''Jane has been programming for over 40 years. She has worked with every programming language known and achieved
             rockstar ninja pirate status in all of them.''').save()

        new TekUser(fullName: 'William Wallace',
                userName: 'br4veh34rt',
                password: 'l337h4ckz',
                email: 'w.wallace@atx.com',
                website: 'www.pythonatx.com',
                bio: '''William is a top notch Python programmer and a pretty good swordsman.''').save()

        def event1 = new TekEvent(name: 'My Code Camp',
                city: 'Portland, OR',
                organizer: TekUser.findByFullName('Jane Roe'),
                venue: 'TBD',
                startDate: new Date('11/22/2016'),
                endDate: new Date('11/25/2016'),
                description: '''This camp will bring coders together to explore passionate, functional,
                        stateless, multithreaded programming.''')
        if(!event1.save()) {
            event1.errors.allErrors.each {error ->
                println("An error occurred with event1 + ${error}")
            }
        }

        def event2 = new TekEvent(name: 'Deadly Python',
                city: 'Austin, TX',
                organizer: TekUser.findByFullName('William Wallace'),
                venue: 'Foobar Museum',
                startDate: new Date('10/2/2016'),
                endDate: new Date('10/4/2016'),
                description: '''Don't constrict your Python knowledge! Come explore Python with us! It'll be fun!''')
        if(!event2.save()) {
            event2.errors.allErrors.each {error ->
                println("An error occurred with event2 + ${error}")
            }
        }

        event1.addToVolunteers(new TekUser(fullName: 'Sarah Martin',
                userName: 'sarahOne',
                password: 'taco',
                email: 'sarah@martinsworld.com',
                website: 'martinsworld.com',
                bio: 'Web designer.'))
        event1.addToVolunteers(new TekUser(fullName: 'Bill Smith',
                userName: 'Mr_Bill',
                password: '12345',
                email: 'mrbill@email.com',
                website: 'www.mrbillswebsite.com',
                bio: 'Into code and claymation.'))
        event1.addToRespondents('hello@world.com')
        event1.addToRespondents('hello@squirrels.com')
        event1.addToRespondents('mydummy@email.com')
        event1.save()

        def sponsor1 = new Sponsor(name: 'Cyberdyne Systems',
                website: 'http://cyberdyne.com',
                description: 'Defense, security, and consumer innovations.').save()
        def sponsor2 = new Sponsor(name: 'Weyland-Yutani',
                website: 'http://weyland-yutani.com',
                description: 'Building better worlds.').save()

        def sponsorship1 = new Sponsorship(event: event1, sponsor: sponsor1, contributionType: 'Other', description: "T-Shirts").save()
        def sponsorship2 = new Sponsorship(event: event2, sponsor: sponsor2, contributionType: 'Cash', description: '$5000').save()
    }

    def destroy = {
    }
}
