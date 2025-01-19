package api.forohub.domain;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistroUsuario(

        @NotBlank
        String login,

        @NotBlank
        String clave) {
}