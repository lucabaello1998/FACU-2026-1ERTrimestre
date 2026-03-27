package ar.unahur.piedra_papel_tijera;

/**
 * Representa el resultado de una jugada contra otra.
 */
public enum Resultado {
    GANA,
    PIERDE,
    EMPATA;

    /**
     * Invierte el resultado desde la perspectiva del otro jugador.
     */
    public Resultado invertir() {
        return switch (this) {
            case GANA -> PIERDE;
            case PIERDE -> GANA;
            case EMPATA -> EMPATA;
        };
    }
}
