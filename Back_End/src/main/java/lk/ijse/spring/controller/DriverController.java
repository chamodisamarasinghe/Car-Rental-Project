package lk.ijse.spring.controller;

import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.service.DriverService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/admin/driver")
@CrossOrigin
public class DriverController {
    @Autowired
    DriverService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllDrivers() {
        return new ResponseUtil(200, "Ok", service.getAllDrivers());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveDriver(DriverDTO dto) {
        service.saveDriver(dto);
        return new ResponseUtil(200, "Saved", null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateCustomer(@RequestBody DriverDTO dto) {
        service.updateDriver(dto);
        return new ResponseUtil(200, "Updated", null);
    }

    @DeleteMapping(params = {"licenseNo "}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteDriver(@RequestParam String licenseNo ) {
        service.deleteDriver(licenseNo );
        return new ResponseUtil(200, "Deleted", null);
    }

    @GetMapping(path = "/{licenseNo }", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchDriver(@PathVariable String licenseNo ) {
        return new ResponseUtil(200, "Ok", service.searchDriver(licenseNo ));
    }

    @GetMapping(path = "/{username}/{password}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchDriverByUsernameAndPassword(@PathVariable String username, @PathVariable String password) {
        if (service.findDriverByUsername(username)) {
            if (service.findDriverByPassword(password)) {
                return new ResponseUtil(200, "Login Successful", null);
            } else {
                return new ResponseUtil(404, "Incorrect Password", null);
            }
        } else {
            return new ResponseUtil(404, "Incorrect Username", null);
        }
    }

    @GetMapping(path = "/set/{username}/{password}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil findDriverByUsernameAndPassword(@PathVariable String username, @PathVariable String password) {
        return new ResponseUtil(200, "Ok", service.findDriverByUsernameAndPassword(username, password));
    }

    @PutMapping(path = "/updateAvailable/{licenseNo }",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateDriverAvailable(@PathVariable String licenseNo ){
        service.updateDriverAvailable(licenseNo );
        return new ResponseUtil(200,"Updated",null);
    }

    @PutMapping(path = "/updateNonAvailable/{licenseNo }",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateDriverNonAvailable(@PathVariable String licenseNo ){
        service.updateDriverNonAvailable(licenseNo );
        return new ResponseUtil(200,"Ok",null);
    }

    @GetMapping(path = "/getAllAvailableDrivers",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllAvailableDrivers(){
        return new ResponseUtil(200,"Ok",service.getAllAvailableDrivers());
    }

    @GetMapping(path = "/getAllNonAvailableDrivers",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllNonAvailableDrivers(){
        return new ResponseUtil(200,"Ok",service.getAllNonAvailableDrivers());
    }

    @GetMapping(path = "/count/{availability}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getCountOfCustomersByAvailability(@PathVariable boolean availability){
        return new ResponseUtil(200,"Ok",service.getCountOfDriversByStatus(availability));
    }
}
