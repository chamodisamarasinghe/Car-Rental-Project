package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
public class Booking {
    @Id
    private String bookingId;
    private String vehicleNum;
    private String NIC;
    private String drivingLicense;
    private String location;
    private String leavingDate;
    private String returnDate;
}
