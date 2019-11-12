package com.kz.digitalcontrol.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "main")
public class Main extends BaseAuditable {
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
    private int file_ustav;

    @Column(name = "file_rekvis")
    private int file_rekvis;

    @Column(name = "file_uch_doc")
    private int file_uch_doc;

    @Column(name = "project_vmest")
    private int project_vmest;

    @Column(name = "specialization")
    private String specialization;

    @Column(name = "start_time")
    private int start_time;

    @Column(name = "end_time")
    private int end_time;

    @Column(name = "language")
    private String language;

    @Column(name = "form")
    private String form;

    @Column(name = "groups")
    private int groups;

    @JsonIgnore
    @Column(name = "state")
    private int state;
}
