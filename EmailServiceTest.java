package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.matchers.Or;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {
    @Test
    public void testBooleansendEmail_True(){
        Order order = new Order(10,"Apple",500);
        assertEquals(true, com.demo.service.EmailService.getInstance().sendEmail(order,"Apple"));
    }



    @Test
    public void testBooleansendEmail_False(){
        Order order = new Order(10,"Apple",500);
        assertEquals(false, com.demo.service.EmailService.getInstance().sendEmail(order,"Apple"));
    }


    @Test(expected = RuntimeException.class)
    public void testVoidsendEmail(){
        Order order = new Order(20,"Banana",400);
        com.demo.service.EmailService.getInstance().sendEmail(order);

    }

    @Test
    public void testgetInstance_True(){
        com.demo.service.EmailService emailService = com.demo.service.EmailService.getInstance();
        assertEquals(true,emailService instanceof com.demo.service.EmailService);
    }

    @Test
    public void testgetInstance_False(){
        com.demo.service.EmailService emailService = com.demo.service.EmailService.getInstance();
        assertEquals(false,emailService instanceof com.demo.service.EmailService);
    }

}