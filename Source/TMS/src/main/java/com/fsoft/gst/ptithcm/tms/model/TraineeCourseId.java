package com.fsoft.gst.ptithcm.tms.model;


import java.io.Serializable;
import java.util.Arrays;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * T@author NVTT May 13, 2017
 */
@Embeddable
public class TraineeCourseId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String trainee;
	private byte[] courseId;

	public TraineeCourseId() {
	}

	public TraineeCourseId(String trainee, byte[] courseId) {
		this.trainee = trainee;
		this.courseId = courseId;
	}

	@Column(name = "Trainee", nullable = false)
	public String getTrainee() {
		return this.trainee;
	}

	public void setTrainee(String trainee) {
		this.trainee = trainee;
	}

	@Column(name = "CourseID", nullable = false)
	public byte[] getCourseId() {
		return this.courseId;
	}

	public void setCourseId(byte[] courseId) {
		this.courseId = courseId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TraineeCourseId))
			return false;
		TraineeCourseId castOther = (TraineeCourseId) other;

		return ((this.getTrainee() == castOther.getTrainee()) || (this.getTrainee() != null
				&& castOther.getTrainee() != null && this.getTrainee().equals(castOther.getTrainee())))
				&& ((this.getCourseId() == castOther.getCourseId())
						|| (this.getCourseId() != null && castOther.getCourseId() != null
								&& Arrays.equals(this.getCourseId(), castOther.getCourseId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTrainee() == null ? 0 : this.getTrainee().hashCode());
		result = 37 * result + (getCourseId() == null ? 0 : Arrays.hashCode(this.getCourseId()));
		return result;
	}

}
