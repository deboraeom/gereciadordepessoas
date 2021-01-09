package one.digitalinnovation.personapi.dto.request;

import one.digitalinnovation.personapi.enums.BloodType;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class HealthInfoDTO {
    private Long id;

    @Enumerated(EnumType.STRING)
    private BloodType type;

    private String alergia;


}
