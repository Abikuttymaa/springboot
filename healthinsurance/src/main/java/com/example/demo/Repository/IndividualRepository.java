package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Individual;
@Repository
public interface IndividualRepository extends JpaRepository<Individual,String> {

	
}
