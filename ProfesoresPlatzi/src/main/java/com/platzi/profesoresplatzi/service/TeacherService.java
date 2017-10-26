package com.platzi.profesoresplatzi.service;

import java.util.List;

import com.platzi.profesoresplatzi.model.Teacher;

public interface TeacherService {

	void saveTeacher(Teacher teacher);
	
	List<Teacher> findAllTeachers();
	
	void deleteTeacher(Long idTeacher);
	
	void updateTeacher(Teacher teacher);
	
	Teacher findTeacherById(Long idTeacher);
	
	Teacher findTeacherByName(String name);
}
