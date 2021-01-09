package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BloodType {
    A("+A"),
    B("+B"),
    AB("+AB"),
    O("+o"),
    An("-A"),
    Bn("-B"),
    ABn("-AB"),
    On("-o"),

    private final String description;
}
