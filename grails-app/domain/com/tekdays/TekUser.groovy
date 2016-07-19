package com.tekdays

class TekUser {
    String fullName
    String userName
    String password
    String email
    String website
    String bio

    String toString() { fullName }

    static constraints = {
        fullName()
        userName()
        email email: true
        website nullable: true, url: true
        bio maxSize: 5000
    }
}
