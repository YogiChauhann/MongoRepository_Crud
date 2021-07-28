package com.entities;

import org.springframework.data.mongodb.core.mapping.Field;

public class Subject {
	
	@Field(name = "subject_name")
	private String subjectName;

	@Field(name = "marks")
	private int marksObtained;

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(int marksObtained) {
		this.marksObtained = marksObtained;
	}

	@Override
	public String toString() {
		return "Subject [subjectName=" + subjectName + ", marksObtained=" + marksObtained + "]";
	}
	
	
	
	

}
