package com.lalita.book.auth;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class RegistrationRequest {

    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty(message = "First Name is Required")
    @NotBlank(message = "First Name is Required")
    private String firstName;
    @NotEmpty(message = "Last Name is Required")
    @NotBlank(message = "Last Name is Required")
    private String lastName;
    @Column(unique = true)
    @NotEmpty(message = "Email is Required")
    @NotBlank(message = "Email is Required")
    @Email(message = "Email is not formatted")
    private String email;
    @NotEmpty(message = "Password is Required")
    @NotBlank(message = "Password is Required")
    @Size(min = 8, message = "Password should be 8 characters long minimum")
    private String password;
}
