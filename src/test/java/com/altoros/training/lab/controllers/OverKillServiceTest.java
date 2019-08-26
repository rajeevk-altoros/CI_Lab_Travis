package com.altoros.training.lab.controllers;

import org.junit.Test;

import static org.junit.Assert.*;

public class OverKillServiceTest {

    @Test
    public void testConcatenate2(){

        OverKillService overKillService = new OverKillService();
        String actual = "Hello Inigo";
        String result = overKillService.concatenate2("Inigo");
        assertEquals(actual, result);

    }

}