package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    void saveCustomer(CustomerDTO dto);

    void updateCustomer(CustomerDTO dto);

    CustomerDTO searchCustomer(String customerId);

    void deleteCustomer(String customerId);

    List<CustomerDTO> getAllCustomers();

    List<CustomerDTO> getAllPendingCustomers();

    List<CustomerDTO> getAllAcceptedCustomers();

    void uploadCustomerImages(String nicfPath, String nicbPath, String licenceImgPath, String id);

    int getCountOfCustomersRegistered();
}
