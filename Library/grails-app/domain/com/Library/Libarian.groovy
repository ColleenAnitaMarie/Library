package com.Library
import grails.test.mixin.TestFor
import spock.lang.Specification
/**
* see the API for {@link grails.test.mixin.Domain.Class.Unit.TestMixin}
* for usage instructions
*/
@TestFor(Library)
class LibrarySpec extends Specification{
def setup() {
when: " A Libarian has Name, email and userName"

def library = new Libarian( Name: " ??",
email: " ??@gmail.com",
userName: " ????")

then: "the to String method will merge them."

Libarian.toString()=='??,??@gmail.com,????'

}

def cleanup(){

}

void "test toString"() {
}

}


class Libarian {

    static constraints = {
name()
email()
userName()
    }
}
