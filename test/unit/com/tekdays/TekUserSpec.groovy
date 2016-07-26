package com.tekdays

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(TekUser)
class TekUserSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test toString"() {
        when: "a TekUser has a fullName"
            def tekUser = new TekUser(fullName: "Testy McTestface")
        then: "the toString method will return it."
            tekUser.toString() == "Testy McTestface"
    }
}
