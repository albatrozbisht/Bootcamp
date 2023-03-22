package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OrderServiceTest {

    @Test
    public void testgetInstance_True(){
        com.demo.service.OrderService orderService = com.demo.service.OrderService.getInstance();
        assertEquals(true,orderService instanceof com.demo.service.OrderService);
    }



    @Test
    public void testgetInstance_False(){
        com.demo.service.OrderService orderService = com.demo.service.OrderService.getInstance();
        assertEquals(false,orderService instanceof com.demo.service.OrderService);
    }



    @Test
    public void testBooleanPlaceOrder_True(){
        Order order = new Order(10,"Cherry",400);
        assertEquals(true, com.demo.service.OrderService.getInstance().placeOrder(order,"Cherry"));
    }


    @Test
    public void testBooleanPlaceOrder_False(){
        Order order = new Order(10,"Cherry",400);
        assertEquals(false, com.demo.service.OrderService.getInstance().placeOrder(order,"Cherry"));
    }
}
