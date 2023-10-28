package org.anudip.onlineFoodDeliveryApp.controller;

import java.util.List;
import org.anudip.onlineFoodDeliveryApp.dao.CustomerDao;
import org.anudip.onlineFoodDeliveryApp.bean.Customer;
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

    @GetMapping("/customer")
    public ModelAndView showCustomerEntryPage() {
        ModelAndView mv = new ModelAndView("customerEntry");
        Integer newId = customerDao.generateNewCustomerId();
        Customer customer = new Customer(newId);
        mv.addObject("customerRecord", customer);
        return mv;
    }

    @PostMapping("/customer")
    public ModelAndView saveUpdateCustomer(@ModelAttribute("customerRecord") Customer customer) {
        //Customer newCustomer = service.gstAndTotalFeeCalculation(customer);
        //customerDao.saveCustomer(newCustomer);
        return new ModelAndView("redirect:/index");
    }
    /*
    
    @GetMapping("/customer-report") // Changed from "/customer" to avoid conflicts
    public ModelAndView showAllCustomerPage() {
        ModelAndView mv = new ModelAndView("courseReportPage");
        List<Customer> customerList = customerDao.displayAllCustomer();
        mv.addObject("customerReport", customerList);
        return mv;
    }

    @GetMapping("/customer-find")
    public ModelAndView openCustomerFindPage() {
        ModelAndView mv = new ModelAndView("customerFindPage");
        List<Integer> customerIdList = customerDao.getAllCustomerIds();
        mv.addObject("customerIdList", customerIdList);
        return mv;
    }

    @PostMapping("/customer-find")
    public ModelAndView openCustomerShowUpdatePage(
        @RequestParam("customer-id") Integer customerId,
        @RequestParam(required = false, value = "details") String str,
        @RequestParam(required = false, value = "update") String stg) {
        
        String fname = "";
        if (stg == null)
            fname = "customerShowPage";
        else if (str == null)
            fname = "customerUpdatePage";
        ModelAndView mv = new ModelAndView(fname);
        Customer customer = customerDao.findACustomerById(customerId);
        mv.addObject("customerRecord", customer);
        return mv;
    }*/
}
