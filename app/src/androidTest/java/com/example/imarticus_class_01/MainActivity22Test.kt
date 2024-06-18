package com.example.imarticus_class_01


    import androidx.test.espresso.Espresso.onView
    import androidx.test.espresso.action.ViewActions.click
    import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
    import androidx.test.espresso.action.ViewActions.typeText
    import androidx.test.espresso.assertion.ViewAssertions.matches
    import androidx.test.espresso.matcher.ViewMatchers.withId
    import androidx.test.espresso.matcher.ViewMatchers.withText
    import androidx.test.ext.junit.rules.ActivityScenarioRule
    import androidx.test.ext.junit.runners.AndroidJUnit4
    import androidx.test.filters.LargeTest
    import org.junit.Rule
    import org.junit.Test
    import org.junit.runner.RunWith

    @LargeTest
    @RunWith(AndroidJUnit4::class)
    class MainActivity22Test{

        @Rule
        @JvmField
        var mActivityScenarioRule = ActivityScenarioRule(MainActivity2::class.java)

        @Test
        fun loginTest() {
            //select the etui
            onView(withId(R.id.edit))
                //type intto etui -- androidworkshops@gmail.com
                .perform(typeText("androidworkshops@gmail.com"), closeSoftKeyboard());
            //click the button btnui
            onView(withId(R.id.button)).perform(click());
            //assert that the tvui has anndroidworkshops@gmail.com
            onView(withId(R.id.textView8))
                .check(matches(withText("androidworkshops@gmail.com")));
        }
    }
