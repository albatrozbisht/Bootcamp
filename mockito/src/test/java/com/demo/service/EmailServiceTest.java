package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {

    @Mock
    Order order = new Order(10,"Apple",2000d);

    @InjectMocks
    EmailService emailService;

    @Test(expected = RuntimeException.class)
    public void testVoidSendEmail(){
        emailService.sendEmail(order);
    }

    @Test
    public void testBooleanSendEmail(){
        assertTrue(emailService.sendEmail(order,"Apple"));
    }
}