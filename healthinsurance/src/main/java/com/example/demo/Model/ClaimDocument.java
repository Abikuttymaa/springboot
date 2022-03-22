package com.example.demo.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="claimdoc")
public class ClaimDocument implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    
	@Id
    @Column(name="policy_id")
    private String PolicyId;
    
	@Column(name="claim_form_duly_signed")
	private String ClaimFormDulySigned;
	
	@Column(name="copy_of_the_claim_intimation")
	private String CopyOfTheClaimIntimation;
	
	@Column(name="hospital_main_bill")
	private String HospitalMainBill;
	
	@Column(name="break_up_bill")
	private String BreakupBill;
	
	@Column(name="bill_payment_receipt")
	private String BillPaymentReceipt;
	
	@Column(name="discharge_summary")
	private String DischargeSummary;
	
	@Column(name="pharmacy_bill")
	private String PharmacyBill;
	
	@Column(name="operation_theater_notes")
	private String OperationTheaterNotes;
	
	@Column(name="eCG")
	private String ECG;
	
	@Column(name="doctors_request_for_investigation")
	private String DoctorsRequestForInvestigation;
	
	@Column(name="investigation_reports")
	private String InvestigationReports;
	
	@Column(name="doctors_prescription")
	private String DoctorsPrescriptions;
	
	@Column(name="other")
	private String Other;
	
	

	public String getPolicyId() {
		return PolicyId;
	}

	public void setPolicyId(String policyId) {
		this.PolicyId = policyId;
	}

	public String getClaimFormDulySigned() {
		return ClaimFormDulySigned;
	}

	public void setClaimFormDulySigned(String claimFormDulySigned) {
		this.ClaimFormDulySigned = claimFormDulySigned;
	}

	public String getCopyOfTheClaimIntimation() {
		return CopyOfTheClaimIntimation;
	}

	public void setCopyOfTheClaimIntimation(String copyOfTheClaimIntimation) {
		this.CopyOfTheClaimIntimation = copyOfTheClaimIntimation;
	}

	public String getHospitalMainBill() {
		return HospitalMainBill;
	}

	public void setHospitalMainBill(String hospitalMainBill) {
		this.HospitalMainBill = hospitalMainBill;
	}

	public String getBreakupBill() {
		return BreakupBill;
	}

	public void setBreakupBill(String breakupBill) {
		this.BreakupBill = breakupBill;
	}

	public String getBillPaymentReceipt() {
		return BillPaymentReceipt;
	}

	public void setBillPaymentReceipt(String billPaymentReceipt) {
		this.BillPaymentReceipt = billPaymentReceipt;
	}

	public String getDischargeSummary() {
		return DischargeSummary;
	}

	public void setDischargeSummary(String dischargeSummary) {
		this.DischargeSummary = dischargeSummary;
	}

	public String getPharmacyBill() {
		return PharmacyBill;
	}

	public void setPharmacyBill(String pharmacyBill) {
		this.PharmacyBill = pharmacyBill;
	}

	public String getOperationTheaterNotes() {
		return OperationTheaterNotes;
	}

	public void setOperationTheaterNotes(String operationTheaterNotes) {
		this.OperationTheaterNotes = operationTheaterNotes;
	}

	public String getECG() {
		return ECG;
	}

	public void setECG(String eCG) {
		this.ECG = eCG;
	}

	public String getDoctorsRequestForInvestigation() {
		return DoctorsRequestForInvestigation;
	}

	public void setDoctorsRequestForInvestigation(String doctorsRequestForInvestigation) {
		this.DoctorsRequestForInvestigation = doctorsRequestForInvestigation;
	}

	public String getInvestigationReports() {
		return InvestigationReports;
	}

	public void setInvestigationReports(String investigationReports) {
		this.InvestigationReports = investigationReports;
	}

	public String getDoctorsPrescriptions() {
		return DoctorsPrescriptions;
	}

	public void setDoctorsPrescriptions(String doctorsPrescriptions) {
		this.DoctorsPrescriptions = doctorsPrescriptions;
	}

	public String getOther() {
		return Other;
	}

	public void setOther(String other) {
		this.Other = other;
	}

	public ClaimDocument(String policyId,String claimFormDulySigned, String copyOfTheClaimIntimation, String hospitalMainBill,
			String breakupBill, String billPaymentReceipt, String dischargeSummary, String pharmacyBill,
			String operationTheaterNotes, String eCG, String doctorsRequestForInvestigation,
			String investigationReports, String doctorsPrescriptions, String other) {
		super();
		PolicyId=policyId;
		ClaimFormDulySigned = claimFormDulySigned;
		CopyOfTheClaimIntimation = copyOfTheClaimIntimation;
		HospitalMainBill = hospitalMainBill;
		BreakupBill = breakupBill;
		BillPaymentReceipt = billPaymentReceipt;
		DischargeSummary = dischargeSummary;
		PharmacyBill = pharmacyBill;
		OperationTheaterNotes = operationTheaterNotes;
		ECG = eCG;
		DoctorsRequestForInvestigation = doctorsRequestForInvestigation;
		InvestigationReports = investigationReports;
		DoctorsPrescriptions = doctorsPrescriptions;
		Other = other;
	}
	
	
	

}
