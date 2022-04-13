package disburse.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import disburse.vo.HouseDisburseDetail;

public interface HouseDisburseRepository extends JpaRepository<HouseDisburseDetail, String> {
	List<HouseDisburseDetail> findBybioGuideID(String bioGuideID);
	
	List<HouseDisburseDetail> findAll();
	
	List<HouseDisburseDetail> findByYear(String year);
	
	@Query(value = "SELECT * from T_2013Q4_HOUSE_DISBURSE where AMOUNT = (SELECT MAX(AMOUNT) from T_2013Q4_HOUSE_DISBURSE)", nativeQuery = true)
	List<HouseDisburseDetail> getHighestAmount();
}
