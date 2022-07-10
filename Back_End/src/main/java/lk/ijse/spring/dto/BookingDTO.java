package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class BookingDTO {
    private String bookingId;
    private String vehicleNum;
    private String NIC;
    private String drivingLicense;
    private String location;
    private String leavingDate;
    private String returnDate;
}
