package com.example.demo.Model;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hosdetail")
public class Personaldetailhospital implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="hospital_name")
	private String HospitalName;
	
	@Column(name="room_category_occupied")
	private String RoomCategoryOccupied;
	
	@Column(name="date_of_admission")
	private Date DateOfAdmission;
	
	@Column(name="date_of_discharge")
	private Date DateOfDischarge;
	
	@Column(name="hospitalization_due_to")
	private String HospitalizatonDueTo;
	
	@Column(name="if_injury_give_cause_self_inflicted")
	private String IfInjuryGiveCauseSelfInflicted;
	
	@Column(name="road_trafic_accident")
	private String RoadTraficAccident;
	
	@Column(name="substance_abouse_aldohol_consumption")
	private String SubstanceAbouseAldoholConsumption;
	
	@Column(name="if_medico_legal")
	private String IfMedicoLegal;
	
	@Column(name="reported_to_police")
	private String ReportedToPolice;
	
	@Column(name="police_fIR_attached")
	private String PoliceFIRAttached;
	
	@Column(name="system_of_medicine")
	private String SystemOFMedicine;
	
	
	

	public String getHospitalName() {
		return HospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.HospitalName = hospitalName;
	}

	public String getRoomCategoryOccupied() {
		return RoomCategoryOccupied;
	}

	public void setRoomCategoryOccupied(String roomCategoryOccupied) {
		this.RoomCategoryOccupied = roomCategoryOccupied;
	}

	public Date getDateOfAdmission() {
		return DateOfAdmission;
	}

	public void setDateOfAdmission(Date dateOfAdmission) {
		this.DateOfAdmission = dateOfAdmission;
	}

	public Date getDateOfDischarge() {
		return DateOfDischarge;
	}

	public void setDateOfDischarge(Date dateOfDischarge) {
		this.DateOfDischarge = dateOfDischarge;
	}

	public String getHospitalizatonDueTo() {
		return HospitalizatonDueTo;
	}

	public void setHospitalizatonDueTo(String hospitalizatonDueTo) {
		this.HospitalizatonDueTo = hospitalizatonDueTo;
	}

	public String getIfInjuryGiveCauseSelfInflicted() {
		return IfInjuryGiveCauseSelfInflicted;
	}

	public void setIfInjuryGiveCauseSelfInflicted(String ifInjuryGiveCauseSelfInflicted) {
		this.IfInjuryGiveCauseSelfInflicted = ifInjuryGiveCauseSelfInflicted;
	}

	public String getRoadTraficAccident() {
		return RoadTraficAccident;
	}

	public void setRoadTraficAccident(String roadTraficAccident) {
		this.RoadTraficAccident = roadTraficAccident;
	}

	public String getSubstanceAbouseAldoholConsumption() {
		return SubstanceAbouseAldoholConsumption;
	}

	public void setSubstanceAbouseAldoholConsumption(String substanceAbouseAldoholConsumption) {
		this.SubstanceAbouseAldoholConsumption = substanceAbouseAldoholConsumption;
	}

	public String getIfMedicoLegal() {
		return IfMedicoLegal;
	}

	public void setIfMedicoLegal(String ifMedicoLegal) {
		this.IfMedicoLegal = ifMedicoLegal;
	}

	public String getReportedToPolice() {
		return ReportedToPolice;
	}

	public void setReportedToPolice(String reportedToPolice) {
		this.ReportedToPolice = reportedToPolice;
	}

	public String getPoliceFIRAttached() {
		return PoliceFIRAttached;
	}

	public void setPoliceFIRAttached(String policeFIRAttached) {
		this.PoliceFIRAttached = policeFIRAttached;
	}

	public String getSystemOFMedicine() {
		return SystemOFMedicine;
	}

	public void setSystemOFMedicine(String systemOFMedicine) {
		this.SystemOFMedicine = systemOFMedicine;
	}
	
	public Personaldetailhospital() {
		
	}

	public Personaldetailhospital(String hospitalName, String roomCategoryOccupied, Date dateOfAdmission,
			Date dateOfDischarge, String hospitalizatonDueTo, String ifInjuryGiveCauseSelfInflicted,
			String roadTraficAccident, String substanceAbouseAldoholConsumption, String ifMedicoLegal,
			String reportedToPolice, String policeFIRAttached, String systemOFMedicine) {
		super();
		HospitalName = hospitalName;
		RoomCategoryOccupied = roomCategoryOccupied;
		DateOfAdmission = dateOfAdmission;
		DateOfDischarge = dateOfDischarge;
		HospitalizatonDueTo = hospitalizatonDueTo;
		IfInjuryGiveCauseSelfInflicted = ifInjuryGiveCauseSelfInflicted;
		RoadTraficAccident = roadTraficAccident;
		SubstanceAbouseAldoholConsumption = substanceAbouseAldoholConsumption;
		IfMedicoLegal = ifMedicoLegal;
		ReportedToPolice = reportedToPolice;
		PoliceFIRAttached = policeFIRAttached;
		SystemOFMedicine = systemOFMedicine;
	}
	
	
	

}
