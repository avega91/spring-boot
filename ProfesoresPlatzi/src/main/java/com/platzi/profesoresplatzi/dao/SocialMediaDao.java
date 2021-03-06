package com.platzi.profesoresplatzi.dao;

import java.util.List;

import com.platzi.profesoresplatzi.model.SocialMedia;
import com.platzi.profesoresplatzi.model.TeacherSocialMedia;


public interface SocialMediaDao {

	void saveSocialMedia(SocialMedia socialMedia);
	
	List<SocialMedia> findAllSocialMedias();
	
	void deleteSocialMedia(Long idSocialMedia);
	
	void updateSocialMedia(SocialMedia socialMedia);
	
	SocialMedia findSocialMediaById(Long idSocialMedia);
	
	SocialMedia findSocialMediaByName(String name);
	
	TeacherSocialMedia findSocialMediaByIdAndName(Long idSocialMedia, String nickname);
}
