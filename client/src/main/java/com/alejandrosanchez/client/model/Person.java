package com.alejandrosanchez.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
public class Person extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre es obligatorio")
    @Size(max = 100, message = "El nombre no puede tener más de 100 caracteres")
    @Column(nullable = false)
    @JsonProperty("nombre")
    private String name;

    @JsonProperty("genero")
    private String gender;

    @NotNull(message = "La fecha de nacimiento es obligatoria")
    @Past(message = "La fecha de nacimiento debe ser en el pasado")
    @Column(nullable = false)
    @JsonProperty("fechaNacimiento")
    private LocalDate birthDate;

    @NotBlank(message = "La identificación es obligatoria")
    @Column(nullable = false)
    @JsonProperty("identificacion")
    private String identification;

    @JsonProperty("direccion")
    private String address;

    @JsonProperty("telefono")
    private String phone;
}