package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Personaldetailhospital;

@Repository
public interface PersonaldetailhospitalRepository extends JpaRepository<Personaldetailhospital,String> {

}
