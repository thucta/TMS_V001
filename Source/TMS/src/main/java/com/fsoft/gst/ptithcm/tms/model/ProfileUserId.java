package com.fsoft.gst.ptithcm.tms.model;
// Generated May 13, 2017 5:20:16 PM by Hibernate Tools 4.3.1.Final

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * The Class ProfileUserId.
 *
 * @author NVTT May 13, 2017
 */
@Embeddable
public class ProfileUserId implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The profile id. */
	private int profileId;
	
	/** The user id. */
	private String userId;

	/**
	 * Instantiates a new profile user id.
	 */
	public ProfileUserId() {
	}

	/**
	 * Instantiates a new profile user id.
	 *
	 * @param profileId the profile id
	 * @param userId the user id
	 */
	public ProfileUserId(int profileId, String userId) {
		this.profileId = profileId;
		this.userId = userId;
	}

	/**
	 * Gets the profile id.
	 *
	 * @return the profile id
	 */
	@Column(name = "ProfileID", nullable = false)
	public int getProfileId() {
		return this.profileId;
	}

	/**
	 * Sets the profile id.
	 *
	 * @param profileId the new profile id
	 */
	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	@Column(name = "UserID", nullable = false)
	public String getUserId() {
		return this.userId;
	}

	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object other) {
		
		if ((this == other)){

			return true;
			
		}
		if ((other == null)){
			return false;
			
		}
		if (!(other instanceof ProfileUserId)){
			
			return false;
		}
		ProfileUserId castOther = (ProfileUserId) other;

		return (this.getProfileId() == castOther.getProfileId())
				&& ((this.getUserId() == castOther.getUserId()) || (this.getUserId() != null
						&& castOther.getUserId() != null && this.getUserId().equals(castOther.getUserId())));
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getProfileId();
		result = 37 * result + (getUserId() == null ? 0 : this.getUserId().hashCode());
		return result;
	}

}
