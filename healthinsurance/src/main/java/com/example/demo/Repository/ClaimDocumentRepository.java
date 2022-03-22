package com.example.demo.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.ClaimDocument;

@Repository
public interface ClaimDocumentRepository extends JpaRepository<ClaimDocument,String> {



	

}
