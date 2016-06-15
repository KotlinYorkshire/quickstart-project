package com.leedskug

import org.junit.AfterClass
import org.junit.BeforeClass
import org.junit.Test

class KotlinMeetupApplicationTests {

    companion object {
        init {
            // things that may need to be setup before companion class member variables are instantiated
        }

        private val meetupApp = KotlinMeetupApplication()

        // variables you initialize for the class later in the @BeforeClass method:
        //lateinit var someClassLateVar: SomeResource

        @BeforeClass @JvmStatic fun setup() {
            // things to execute once and keep around for the class
        }

        @AfterClass @JvmStatic fun teardown() {
            // clean up after this class, leave nothing dirty behind
        }
    }

	@Test
    fun testRunMethod() {
        meetupApp.run();
	}

}
