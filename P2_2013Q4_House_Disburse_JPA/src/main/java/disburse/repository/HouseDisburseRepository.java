package disburse.repository;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import disburse.vo.HouseDisburseDetail;

public interface HouseDisburseRepository extends JpaRepository<HouseDisburseDetail, String> {
	//Challenge 2
	List<HouseDisburseDetail> findBybioGuideID(String bioGuideID);
	//Challenge 1
	List<HouseDisburseDetail> findAll();
	//Challenge 2.5
	List<HouseDisburseDetail> findByYear(String year);
	//Challenge 4
	@Query(value = "SELECT * from T_2013Q4_HOUSE_DISBURSE where AMOUNT = (SELECT MAX(AMOUNT) from T_2013Q4_HOUSE_DISBURSE)", nativeQuery = true)
	List<HouseDisburseDetail> getHighestAmount();
	
	//Code Challenge 3
	@Query(value = "UPDATE T_2013Q4_HOUSE_DISBURSE SET CATEGORY = 'T'", nativeQuery = true)
	public List<HouseDisburseDetail> updateCategories();
}
