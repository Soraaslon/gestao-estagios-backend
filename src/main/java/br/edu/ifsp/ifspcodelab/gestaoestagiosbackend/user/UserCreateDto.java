package br.edu.ifsp.ifspcodelab.gestaoestagiosbackend.user;

import lombok.Value;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Value
public class UserCreateDto {
    @NotNull
    @NotBlank
    @Email
    String email;

    @NotNull
    @NotBlank
    @Size(min = 6, max = 22)
    String password;
}
