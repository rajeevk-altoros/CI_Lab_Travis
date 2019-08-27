package com.altoros.training.lab.controllers;

import org.junit.Test;

import static org.junit.Assert.*;

public class OverKillServiceTest {

    OverKillService overKillService = new OverKillService();

    @Test
    public void testkHappyPath(){

        String actual = "Hello Inigo";
        String result = overKillService.concatenate2("Inigo");
        assertEquals(actual, result);

    }

    @Test
    public void testNoValue(){

        String actual = "Hello Buttercup";
        String result = overKillService.concatenate2("NotButter");
        assertNotEquals (actual, result);

    }

}