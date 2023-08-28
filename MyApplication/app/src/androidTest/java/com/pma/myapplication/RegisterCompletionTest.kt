package com.pma.myapplication


import androidx.test.espresso.DataInteraction
import androidx.test.espresso.ViewInteraction
import androidx.test.filters.LargeTest
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent

import androidx.test.InstrumentationRegistry.getInstrumentation
import androidx.test.espresso.Espresso.onData
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*

import com.pma.myapplication.R

import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher
import org.hamcrest.core.IsInstanceOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.anything
import org.hamcrest.Matchers.`is`

@LargeTest
@RunWith(AndroidJUnit4::class)
class RegisterCompletionTest {

    @Rule
    @JvmField
    var mActivityScenarioRule = ActivityScenarioRule(SignInActivity::class.java)

    @Test
    fun registerCompletionTest() {
        val materialTextView = onView(
allOf(withId(R.id.textView), withText("Don't have an account? Register."),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
4),
isDisplayed()))
        materialTextView.perform(click())
        
        val appCompatEditText = onView(
allOf(withId(R.id.editTextTextEmailAddress),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
0),
isDisplayed()))
        appCompatEditText.perform(replaceText("a1@gmail.com"), closeSoftKeyboard())
        
        val appCompatEditText2 = onView(
allOf(withId(R.id.editTextTextPassword),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
1),
isDisplayed()))
        appCompatEditText2.perform(replaceText("a123456789"), closeSoftKeyboard())
        
        val appCompatEditText3 = onView(
allOf(withId(R.id.editTextTextPassword), withText("a123456789"),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
1),
isDisplayed()))
        appCompatEditText3.perform(pressImeActionButton())
        
        val appCompatEditText4 = onView(
allOf(withId(R.id.editTextTextPassword2),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
2),
isDisplayed()))
        appCompatEditText4.perform(replaceText("a123456789"), closeSoftKeyboard())
        
        val appCompatEditText5 = onView(
allOf(withId(R.id.editTextTextPassword2), withText("a123456789"),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
2),
isDisplayed()))
        appCompatEditText5.perform(pressImeActionButton())
        
        val materialButton = onView(
allOf(withId(R.id.button), withText("REGISTER"),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
4),
isDisplayed()))
        materialButton.perform(click())
        
        val appCompatEditText6 = onView(
allOf(withId(R.id.editTextTextEmailAddress),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
0),
isDisplayed()))
        appCompatEditText6.perform(replaceText("a1@gmail.com"), closeSoftKeyboard())
        
        val appCompatEditText7 = onView(
allOf(withId(R.id.editTextTextPassword),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
1),
isDisplayed()))
        appCompatEditText7.perform(replaceText("a123456789"), closeSoftKeyboard())
        
        val appCompatEditText8 = onView(
allOf(withId(R.id.editTextTextPassword), withText("a123456789"),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
1),
isDisplayed()))
        appCompatEditText8.perform(pressImeActionButton())
        
        val materialButton2 = onView(
allOf(withId(R.id.button), withText("SIGN IN"),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
2),
isDisplayed()))
        materialButton2.perform(click())
        
        val bottomNavigationItemView = onView(
allOf(withId(R.id.profile), withContentDescription("App Info"),
childAtPosition(
childAtPosition(
withId(R.id.bottomNavigationView),
0),
1),
isDisplayed()))
        bottomNavigationItemView.perform(click())
        
        val bottomNavigationItemView2 = onView(
allOf(withId(R.id.home), withContentDescription("Mountains"),
childAtPosition(
childAtPosition(
withId(R.id.bottomNavigationView),
0),
0),
isDisplayed()))
        bottomNavigationItemView2.perform(click())
        
        val bottomNavigationItemView3 = onView(
allOf(withId(R.id.logout), withContentDescription("Log Out"),
childAtPosition(
childAtPosition(
withId(R.id.bottomNavigationView),
0),
2),
isDisplayed()))
        bottomNavigationItemView3.perform(click())
        }
    
    private fun childAtPosition(
            parentMatcher: Matcher<View>, position: Int): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position)
            }
        }
    }
    }
