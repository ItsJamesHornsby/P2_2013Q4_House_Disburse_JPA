package disburse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import disburse.vo.HouseDisburseDetail;

public interface HouseDisburseRepository extends JpaRepository<HouseDisburseDetail, Integer> {

}
