package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class CarDTO {
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
