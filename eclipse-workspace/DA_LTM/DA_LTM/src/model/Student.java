package model;

import java.io.Serializable;
import java.sql.Date;

public class Student implements Serializable {
	private int id;
	private String name;
	private String address;
	private Date dateOfBirth;
	private int idKhoi;
	private String khoi;
	private String firstSubject;
	private String secondSubject;
	private String thirdSubject;
	private float firstScore;
	private float secondScore;
	private float thirdScore;

	public Student() {
	}

	public Student(int id, String name, String address, Date dateOfBirth, int idKhoi, String khoi, String firstSubject,
			String secondSubject, String thirdSubject, float firstScore, float secondScore, float thirdScore) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.idKhoi = idKhoi;
		this.khoi = khoi;
		this.firstSubject = firstSubject;
		this.secondSubject = secondSubject;
		this.thirdSubject = thirdSubject;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
		this.thirdScore = thirdScore;
	}

	public int getIdKhoi() {
		return idKhoi;
	}

	public void setIdKhoi(int idKhoi) {
		this.idKhoi = idKhoi;
	}

	public String getKhoi() {
		return khoi;
	}

	public void setKhoi(String khoi) {
		this.khoi = khoi;
	}

	public String getFirstSubject() {
		return firstSubject;
	}

	public void setFirstSubject(String firstSubject) {
		this.firstSubject = firstSubject;
	}

	public String getSecondSubject() {
		return secondSubject;
	}

	public void setSecondSubject(String secondSubject) {
		this.secondSubject = secondSubject;
	}

	public String getThirdSubject() {
		return thirdSubject;
	}

	public void setThirdSubject(String thirdSubject) {
		this.thirdSubject = thirdSubject;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public float getFirstScore() {
		return firstScore;
	}

	public void setFirstScore(float firstScore) {
		this.firstScore = firstScore;
	}

	public float getSecondScore() {
		return secondScore;
	}

	public void setSecondScore(float secondScore) {
		this.secondScore = secondScore;
	}

	public float getThirdScore() {
		return thirdScore;
	}

	public void setThirdScore(float thirdScore) {
		this.thirdScore = thirdScore;
	}

	public float getTotalScores() {
		return this.firstScore + this.secondScore + this.thirdScore;
	}

}
