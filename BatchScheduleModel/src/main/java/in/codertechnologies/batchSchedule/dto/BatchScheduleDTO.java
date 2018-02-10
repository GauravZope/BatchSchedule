package in.codertechnologies.batchSchedule.dto;

import java.util.Date;



public class BatchScheduleDTO {

	private long id;
	private TrainerDetailsDTO trainerDetailsDTO;
	private String center;
	private String lab;
	private String timing;
	private Date startDate;
	private Date endDate;	
	private char completed;
	private String duration;	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public TrainerDetailsDTO getTrainerDetailsDTO() {
		return trainerDetailsDTO;
	}
	public void setTrainerDetailsDTO(TrainerDetailsDTO trainerDetailsDTO) {
		this.trainerDetailsDTO = trainerDetailsDTO;
	}
	public String getCenter() {
		return center;
	}
	public void setCenter(String center) {
		this.center = center;
	}
	public String getLab() {
		return lab;
	}
	public void setLab(String lab) {
		this.lab = lab;
	}
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public char getCompleted() {
		return completed;
	}
	public void setCompleted(char completed) {
		this.completed = completed;
	}
	@Override
	public String toString() {
		return "BatchScheduleDTO [id=" + id + ", trainerFirstName=" + "" + ", trainerLastName="
				+ "" + ", center=" + center + ", lab=" + lab + ", timing=" + timing + ", startDate="
				+ startDate + ", endDate=" + endDate + ", completed=" + completed + "]";
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
	
	
	
}
