package com.example.demo.Service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.demo.Model.ClaimDocument;
import com.example.demo.Repository.ClaimDocumentRepository;
@Validated
@Service
public class ClaimDocumentService {
	
	@Autowired
	private ClaimDocumentRepository claimDocumentRepository;


	public ClaimDocument saveClaimDoucment(ClaimDocument claimDocument) {
		 return claimDocumentRepository.save(claimDocument);
	}

	public String deleteClaimDocument(String Policyid) {
		
		claimDocumentRepository.deleteById(Policyid);
        return "Deleted!";
	}

	public Optional<ClaimDocument> findById(String policyid) {
		
		return claimDocumentRepository.findById(policyid);
	}

	public List<ClaimDocument> getClaimDocuments() {
		return (List<ClaimDocument>) claimDocumentRepository.findAll();
	}

	
	

}
