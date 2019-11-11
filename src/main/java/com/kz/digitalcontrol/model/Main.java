package com.kz.digitalcontrol.model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "main")
public class Main {
    @Id
    private int id;

    @Column(name = "surname")
    private String surname;

    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "organization_name")
    private String organizationName;

    @Column(name = "bin")
    private String bin;

    @Column(name = "address")
    private String address;

    @Column(name = "file_ustav")
    private String file_ustav;

    @Column(name = "file_rekvis")
    private String file_rekvis;

    @Column(name = "file_uch_doc")
    private String file_uch_doc;

    @Column(name = "project_vmest")
    private String project_vmest;

    @Column(name = "specialization")
    private String specialization;

    @Column(name = "start_time")
    private String start_time;

    @Column(name = "end_time")
    private String end_time;

    @Column(name = "language")
    private String language;

    @Column(name = "form")
    private String form;

    @Column(name = "groups")
    private String groups;
}
