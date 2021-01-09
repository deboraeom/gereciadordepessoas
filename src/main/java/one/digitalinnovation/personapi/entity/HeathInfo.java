package one.digitalinnovation.personapi.entity;

import one.digitalinnovation.personapi.enums.BloodType;


import javax.persistence.*;

public class HeathInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BloodType type;


    private String alergia;
}
