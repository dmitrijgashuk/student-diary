package com.studentdiary.student_diary.frontend.pojo;


public class Subject {
    private String subjectId;
    private String title;
    private String description;
    private String teacher;

    public Subject() {
    }

    public Subject(String subjectId, String title, String description, String teacher) {
        this.subjectId = subjectId;
        this.title = title;
        this.description = description;
        this.teacher = teacher;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
