package com.diegobfarias.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegobfarias.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

	
}
