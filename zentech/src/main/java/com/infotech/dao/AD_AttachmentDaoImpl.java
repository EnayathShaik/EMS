package com.infotech.dao;

import javax.annotation.PostConstruct;

import com.infotech.entity.AD_Attachment;


public class AD_AttachmentDaoImpl extends AbstractJpaDAO<AD_Attachment> implements AD_AttachmentDao{

	@PostConstruct
	public void postConstruct() {
		setClazz(AD_Attachment.class);
	}
}
