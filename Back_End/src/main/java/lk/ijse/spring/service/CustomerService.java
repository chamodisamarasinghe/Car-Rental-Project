package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    void saveCustomer(CustomerDTO dto);
    void deleteCustomer(String NIC);
    void updateCustomer(CustomerDTO dto);
    CustomerDTO searchCustomer(String NIC);
    List<CustomerDTO> getAllCustomers();
}
