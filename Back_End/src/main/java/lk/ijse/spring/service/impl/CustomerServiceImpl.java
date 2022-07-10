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
    public CustomerDTO searchCustomer(String NIC) {
        return null;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return null;
    }
}
