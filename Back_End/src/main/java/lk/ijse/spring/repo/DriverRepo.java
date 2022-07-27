package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface DriverRepo extends JpaRepository<Driver, String> {
    Optional<Driver> findDriverByUsername(String username);

    Optional<Driver> findDriverByPassword(String password);

    Optional<Driver> findDriverByUsernameAndPassword(String username, String password);


    boolean existsByLicenseNo(String licenseNo );

    @Modifying
    @Transactional
    @Query("delete from Driver d where d.licenseNo = ?1")
    void deleteByLicenseNo(String firstName);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Driver SET availability = false WHERE licenseNo =:licenseNo ", nativeQuery = true)
    void updateDriverNonAvailable(@Param("licenseNo ") String licenseNo );

    @Modifying
    @Transactional
    @Query(value = "UPDATE Driver SET availability = true WHERE licenseNo =:licenseNo ", nativeQuery = true)
    void updateDriverAvailable(@Param("licenseNo ") String licenseNo );

    @Query(value = "SELECT * FROM Driver WHERE availability=true", nativeQuery = true)
    List<Driver> getAllAvailableDrivers();

    @Query(value = "SELECT * FROM Driver WHERE availability=false", nativeQuery = true)
    List<Driver> getAllNonAvailableDrivers();

    @Query(value = "SELECT COUNT(licenceNo) FROM Driver WHERE availability=:availability", nativeQuery = true)
    int getCountOfDriversByStatus(@Param("availability") boolean availability);
}