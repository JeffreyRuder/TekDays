package com.tekdays

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Sponsor)
class SponsorSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test toString"() {
        when: "a sponsor has a name"
        def sponsor = new Sponsor(name: 'Stark Industries',
                website: "www.ironman.com",
                description: "Advanced weapon and defense technologies.",
                logo: null)
        then: "the toString method will return that name"
            sponsor.toString() == 'Stark Industries'
    }
}
