package domain;

import lombok.*;

@NoArgsConstructor @RequiredArgsConstructor @ToString
public class Animal {
    @Getter @Setter @NonNull
    private String nombre;

    @Getter @Setter @NonNull
    private String tipo;
}
