package com.example.demo.dto;

public class PersonalForm {
    private Long id;
    private String product_type;
    private String email;
    private String ssn;
    private String name_kor;
    private String name_eng;
    private String phone;
    private String brandname;
    private String type;
    private String document;
    private String description;
    private String category;
    private String classification;
    private String password;
    private String domestic_status;
    private String foreign_status;
    private String answer_status;
    private String created_at;
    private String approval;

    public PersonalForm(Long id, String product_type, String email, String ssn, String name_kor, String name_eng, String phone, String brandname, String type, String description, String category, String classification, String password, String domestic_status, String foreign_status, String answer_status, String created_at, String approval) {
        this.id = id;
        this.product_type = product_type;
        this.email = email;
        this.ssn = ssn;
        this.name_kor = name_kor;
        this.name_eng = name_eng;
        this.phone = phone;
        this.brandname = brandname;
        this.type = type;
        this.description = description;
        this.category = category;
        this.classification = classification;
        this.password = password;
        this.domestic_status = domestic_status;
        this.foreign_status = foreign_status;
        this.answer_status = answer_status;
        this.created_at = created_at;
        this.approval = approval;
    }

    public PersonalForm toEntity() {
        return new PersonalForm(id, product_type, email, ssn, name_kor, name_eng, phone, brandname, type, description, category, classification, password, domestic_status, foreign_status, answer_status, created_at, approval);
    }
}
