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
public class Car {
    @Id
    private String vehicleNum;
    private String brand;
    private int numOfPassengers;
    private String transmissionType;
    private String fuelType;
    private String colour;
    private String type;
    private double monthlyRate;
    private double dailyRate;
    private String freeMileageDuration;
    private double freeMileageForThePrice;
    private double priceForTheExtraKm;
}
