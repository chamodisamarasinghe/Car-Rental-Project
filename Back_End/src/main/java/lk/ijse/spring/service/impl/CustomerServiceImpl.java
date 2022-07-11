package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Override
    public void saveCustomer(CustomerDTO dto) {

    }

    @Override
    public void deleteCustomer(String NIC) {

    }

    @Override
    public void updateCustomer(CustomerDTO dto) {

    }

    @Override
    public CustomerDTO searchCustomer(String id) {
        return null;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return null;
    }

    @Override
    public boolean findCustomerByUsername(String username) {
        return false;
    }

    @Override
    public boolean findCustomerByPassword(String password) {
        return false;
    }

    @Override
    public CustomerDTO findCustomerByUsernameAndPassword(String username, String password) {
        return null;
    }

    @Override
    public String generateCustomerId() {
        return null;
    }

    @Override
    public void updateCustomerStatus(String id) {

    }

    @Override
    public List<CustomerDTO> getAllPendingCustomers() {
        return null;
    }

    @Override
    public List<CustomerDTO> getAllAcceptedCustomers() {
        return null;
    }

    @Override
    public void uploadCustomerImages(String nicfPath, String nicbPath, String licenceImgPath, String id) {

    }

    @Override
    public int getCountOfCustomersRegistered() {
        return 0;
    }
}
