package com.infotech.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="AD_Attachment")
public class AD_Attachment extends CommonEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id	
	@SequenceGenerator(name="AD_Attachment_Seq",sequenceName="AD_Attachment_Seq", allocationSize=1)	
    @GeneratedValue(strategy = GenerationType.SEQUENCE,  generator="AD_Attachment_Seq")	
	@Column(name = "AD_Attachment_ID", updatable=false)
	private int AD_Attachment_ID;
	
	@Column(name="ISACTIVE")
	private String isactive;
	
	@Column(name="FILE_NAME")
	private String fileName;
	
	@Column(name="BINARY_DATA")
	private byte[] media;
	
	
	public int getAD_Attachment_ID() {
		return AD_Attachment_ID;
	}

	public void setAD_Attachment_ID(int aD_Attachment_ID) {
		AD_Attachment_ID = aD_Attachment_ID;
	}

	@PrePersist
    private void beforeSaveNew() {
       int ad_user_id = 10000;
       this.isactive = "Y";
    }
	
	@PreUpdate
	private void beforeSaveUp() {
	   int ad_user_id = 10000;
    }
	
	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public byte[] getMedia() {
		return media;
	}

	public void setMedia(byte[] media) {
		this.media = media;
	}

}
