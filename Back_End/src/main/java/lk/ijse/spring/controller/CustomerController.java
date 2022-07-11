package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.CustomerService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllCustomers() {
        return new ResponseUtil(200,"Ok",customerService.getAllCustomers());
    }

    @ResponseStatus(HttpStatus.CREATED) //201
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveCustomer(@ModelAttribute CustomerDTO customer) {
        customerService.saveCustomer(customer);
        return new ResponseUtil(200,"Save",null);
    }


    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO customer) {
        customerService.updateCustomer(customer);
        return new ResponseUtil(200,"Updated",null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteCustomer(@RequestParam String id) {
        customerService.deleteCustomer(id);
        return new ResponseUtil(200,"Deleted",null);
    }

    @GetMapping(path = "/id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchCustomer(@PathVariable String id) {
        return new ResponseUtil(200,"Ok",customerService.searchCustomer(id));
    }


    @GetMapping(path = "/{username}/{password}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchCustomerByUsernameAndPassword(@PathVariable String username, @PathVariable String password) {
        if (customerService.findCustomerByUsername(username)) {
            if (customerService.findCustomerByPassword(password)) {
                return new ResponseUtil(200, "Login Successful", null);
            } else {
                return new ResponseUtil(404, "Incorrect Password", null);
            }
        } else {
            return new ResponseUtil(404, "Incorrect Username", null);
        }
    }


    @GetMapping(path = "/generateCustomerId", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil generateCustomerId() {
        return new ResponseUtil(200, "Ok", customerService.generateCustomerId());
    }


    @PutMapping(path = "/updateStatus/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateCustomerStatus(@PathVariable String id) {
        customerService.updateCustomerStatus(id);
        return new ResponseUtil(200, "Updated Status", null);
    }

    @GetMapping(path = "/accepted", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllAcceptedCustomers() {
        return new ResponseUtil(200, "Ok", customerService.getAllAcceptedCustomers());
    }



    @GetMapping(path = "/count",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getCountOfRegisteredCustomers(){
        return new ResponseUtil(200,"Ok",customerService.getCountOfCustomersRegistered());
    }
}
