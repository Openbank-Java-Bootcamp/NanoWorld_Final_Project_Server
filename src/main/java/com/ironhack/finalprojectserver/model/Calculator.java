package com.ironhack.finalprojectserver.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Calculator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String xc;
    private boolean lreal;
    @ElementCollection
    private List<Integer> kpts;
   /* private Collection<Integer> kpts = new ArrayList<>();*/
    /*private String kpts;*/
    private int ibrion;
    private double encut;
    private double ediffg;
    private int nsw;
    private int ispin;
    private int ncore;
    private String command;

    @OneToMany(mappedBy = "calculator", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Project> projects;
}