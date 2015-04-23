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
when: " A Library has Location, openingHours and book"

def library = new Library( Location: " ??",
openingHours: " ???",
book: " ????")

then: "the to String method will merge them."

Library.toString()=='??,???,????'

}

def cleanup(){

}

void "test toString"() {
}

}


class Library {

    static constraints = {
    }
}
