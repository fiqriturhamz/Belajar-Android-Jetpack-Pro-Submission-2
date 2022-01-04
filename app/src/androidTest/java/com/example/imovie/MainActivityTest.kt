package com.example.imovie

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import com.example.imovie.activity.MainActivity
import com.example.imovie.data.local.DataDummy
import com.example.imovie.utils.EspressoIdlingResource
import org.junit.After
import org.junit.Before
import org.junit.Test


class MainActivityTest {

    private val dummyMovies = DataDummy.generateDummyMovies()
    private val dummyTvShows = DataDummy.generateDummyTvShows()

    @Before
    fun setUp() {
        ActivityScenario.launch(MainActivity::class.java)
        IdlingRegistry.getInstance().register(EspressoIdlingResource.idlingResouce)
    }

    @After
    fun tearDown() {
        IdlingRegistry.getInstance().unregister(EspressoIdlingResource.idlingResouce)
    }

    @Test
    fun loadMovies() {
        Espresso.onView(withId(R.id.rv_movie))
            .check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.rv_movie))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovies.size))
    }

    @Test
    fun loadDetailMovie() {
        Espresso.onView(withId(R.id.rv_movie)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                ViewActions.click()
            )
        )
        Espresso.onView(withId(R.id.tv_movie)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.tv_release_date)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.tv_rating)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.tv_des)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.iv_poster)).check(ViewAssertions.matches(isDisplayed()))
    }

    @Test
    fun loadTvShows() {
        Espresso.onView(withText("Tv Show")).perform(ViewActions.click())
        Espresso.onView(withId(R.id.rv_tv_show))
            .check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.rv_tv_show))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvShows.size))
    }


    @Test
    fun loadDetailTvShow() {
        Espresso.onView(withText("Tv Show")).perform(ViewActions.click())
        Espresso.onView(withId(R.id.rv_tv_show)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                ViewActions.click()
            )
        )
        Espresso.onView(withId(R.id.tv_tvshows)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.tv_release_date_tv_show)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.tv_rating_tv_shows)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.tv_des_tvshows)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.iv_tvshows)).check(ViewAssertions.matches(isDisplayed()))
    }
}