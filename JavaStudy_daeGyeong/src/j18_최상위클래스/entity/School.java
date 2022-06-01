package j18_최상위클래스.entity;

import java.time.LocalDate;
import java.util.Objects;

public class School {
	private String schoolName;
	private LocalDate establishmentDate;
	private int studentNumber;
	private int teacherNumber;
	private boolean FemaleSchool;
	
	
	public School() {}


	public School(String schoolName, LocalDate establishmentDate, int studentNumber, int teacherNumber,
			boolean femaleSchool) {
		super();
		this.schoolName = schoolName;
		this.establishmentDate = establishmentDate;
		this.studentNumber = studentNumber;
		this.teacherNumber = teacherNumber;
		this.FemaleSchool = femaleSchool;
	}


	public String getSchoolName() {
		return schoolName;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	public LocalDate getEstablishmentDate() {
		return establishmentDate;
	}


	public void setEstablishmentDate(LocalDate establishmentDate) {
		this.establishmentDate = establishmentDate;
	}


	public int getStudentNumber() {
		return studentNumber;
	}


	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}


	public int getTeacherNumber() {
		return teacherNumber;
	}


	public void setTeacherNumber(int teacherNumber) {
		this.teacherNumber = teacherNumber;
	}


	public boolean isFemaleSchool() {
		return FemaleSchool;
	}


	public void setFemaleSchool(boolean femaleSchool) {
		FemaleSchool = femaleSchool;
	}


	@Override
	public int hashCode() {
		return Objects.hash(FemaleSchool, establishmentDate, schoolName, studentNumber, teacherNumber);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		return FemaleSchool == other.FemaleSchool && Objects.equals(establishmentDate, other.establishmentDate)
				&& Objects.equals(schoolName, other.schoolName) && studentNumber == other.studentNumber
				&& teacherNumber == other.teacherNumber;
	}


	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", establishmentDate=" + establishmentDate + ", studentNumber="
				+ studentNumber + ", teacherNumber=" + teacherNumber + ", FemaleSchool=" + FemaleSchool + "]";
	}
	
	
	
	
}