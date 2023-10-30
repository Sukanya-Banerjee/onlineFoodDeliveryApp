package org.anudip.onlineFoodDeliveryApp.controller;

import java.util.List;
import org.anudip.onlineFoodDeliveryApp.dao.CustomerDao;
import org.anudip.onlineFoodDeliveryApp.dao.RestaurantDao;
import org.anudip.onlineFoodDeliveryApp.bean.Customer;
import org.anudip.onlineFoodDeliveryApp.bean.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class FoodOrderController {

    @Autowired
    private CustomerDao customerDao;

    @GetMapping("/index")
    public ModelAndView showIndexPage() {
        return new ModelAndView("index");
    }

    @GetMapping("/customerEntry")
    public ModelAndView showCustomerEntry() {
        ModelAndView mv = new ModelAndView("customerEntry");
        Integer newId = customerDao.generateNewCustomerId();
        Customer customer = new Customer(newId);
        mv.addObject("customerRecord", customer);
        return mv;
    }

    @PostMapping("/customerEntry")
    public ModelAndView saveUpdateCustomer(@ModelAttribute("customerRecord") Customer customer) {
        //customerDao.saveCustomer(newCustomer);
        return new ModelAndView("redirect:/index");
    }
    // Code for "Restaurant List" page
    @GetMapping("/restaurantEntry")
    public ModelAndView showRestaurantEntry() {
        ModelAndView mv = new ModelAndView("restaurantEntry");
      // String newId = RestaurantDao.generateNewRestaurantId();
       // Restaurant restaurant = new Restaurant(newId);
      //  mv.addObject("restaurantRecord", restaurant);
        // Adding Of Logic still pending
        return mv;
    }
  /*  @PostMapping("/restaurantEntry")
    public ModelAndView saveUpdateRestaurant(@ModelAttribute("restaurantRecord") Restaurant restaurant) {
        //restaurantDao.saveRestaurant(newRestaurant);
        return new ModelAndView("redirect:/index");
    }*/
    
    // Code for "Restaurant List" page
    @GetMapping("/restaurantList")
    public ModelAndView showRestaurantList() {
        ModelAndView mv = new ModelAndView("restaurantList");
        // Adding Of Logic still pending
        return mv;
    }
    
    // Code for "Customer List" page
    @GetMapping("/customerList")
    public ModelAndView showCustomerList() {
        ModelAndView mv = new ModelAndView("customerList");
        // Adding Of Logic still pending
        return mv;
    }
    
    // Code for "Bill Paid" page
    @GetMapping("/billPaid")
    public ModelAndView showbillPaid() {
        ModelAndView mv = new ModelAndView("billPaid");
        // Adding Of Logic still pending
        return mv;
    }
    
    // Code for "Order Booking" page
    @GetMapping("/orderBooking")
    public ModelAndView showorderBooking() {
        ModelAndView mv = new ModelAndView("orderBooking");
     // Adding Of Logic still pending
        return mv;
    }
}