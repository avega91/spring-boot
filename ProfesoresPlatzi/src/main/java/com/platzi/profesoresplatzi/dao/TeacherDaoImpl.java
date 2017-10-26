package com.platzi.profesoresplatzi.dao;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.platzi.profesoresplatzi.model.Teacher;
import com.platzi.profesoresplatzi.model.TeacherSocialMedia;

@Repository
@Transactional
public class TeacherDaoImpl extends AbstractSession implements TeacherDao {

	public void saveTeacher(Teacher teacher) {
		getSession().persist(teacher);
	}

	public List<Teacher> findAllTeachers() {
		return getSession().createQuery("from Teacher").list();
	}

	public void deleteTeacher(Long idTeacher) {
		Teacher teacher = findTeacherById(idTeacher);
		if (teacher != null) {
			Iterator<TeacherSocialMedia> i = teacher.getTeacherSocialMedia().iterator();
			while (i.hasNext()) {
				TeacherSocialMedia teacherSocialMedia = i.next();
				i.remove();
				getSession().delete(teacherSocialMedia);
			}
			teacher.getTeacherSocialMedia().clear();
			getSession().delete(teacher);
		}
	}

	public void updateTeacher(Teacher teacher) {
		getSession().update(teacher);
	}

	public Teacher findTeacherById(Long idTeacher) {
		return (Teacher) getSession().get(Teacher.class, idTeacher);
	}

	public Teacher findTeacherByName(String name) {
		return (Teacher) getSession().createQuery("from Teacher where name = :name").setParameter("name", name)
				.uniqueResult();
	}

}
