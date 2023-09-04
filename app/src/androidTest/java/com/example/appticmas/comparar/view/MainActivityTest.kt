package com.example.appticmas.comparar.view

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    var rule : ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)
    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }
}