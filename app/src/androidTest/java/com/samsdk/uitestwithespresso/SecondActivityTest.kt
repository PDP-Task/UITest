package com.samsdk.uitestwithespresso

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class SecondActivityTest {

    @get: Rule
    val secondActivityRule = ActivityScenarioRule(SecondActivity::class.java)

    @Test
    fun isActivityView() {
        onView(withId(R.id.secondLayout))
            .check(matches(isDisplayed()))
    }
    @Test
    fun isVisibilityTitleBackBtn() {
        onView(withId(R.id.activity_secondary_title))
            .check(matches(isDisplayed()))

        onView(withId(R.id.button_back))
            .check(matches(isDisplayed()))
    }
    @Test
    fun isTitleTextDisplayed() {
        onView(withId(R.id.activity_secondary_title))
            .check(matches(withText(R.string.text_secondaryactivity)))
    }
}