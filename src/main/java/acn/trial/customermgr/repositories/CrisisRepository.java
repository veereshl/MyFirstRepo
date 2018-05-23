package acn.trial.customermgr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import acn.trial.customermgr.entities.Crisis;

public interface CrisisRepository extends JpaRepository<Crisis, Integer> {

}
