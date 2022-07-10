package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data // apply getters and setters
@ToString
public class CustomerDTO {
    private String NIC;
    private String passWord;
    private String drivingLicenseNum;
    private String address;
    private String email;
    private String contactNum;
}
