package ar.unahur.piedra_papel_tijera;

/**
 * Interfaz que representa una jugada en el juego Piedra, Papel o Tijera.
 * 
 * Define el contrato para implementar el patrón Visitor y lograr double dispatch.
 * Cada implementación concreta (Piedra, Papel, Tijera) define cómo se comporta
 * cuando juega contra otra jugada.
 */
public interface Jugada {
    
    /**
     * Determina el resultado cuando esta jugada se enfrenta contra otra.
     * 
     * @param otra la jugada del oponente
     * @return el resultado desde la perspectiva de esta jugada
     */
    Resultado jugarContra(Jugada otra);
    
    /**
     * Determina el resultado cuando esta jugada (visitante) se enfrenta contra Piedra.
     * Implementa el patrón Visitor.
     */
    Resultado jugarContraPiedra();
    
    /**
     * Determina el resultado cuando esta jugada (visitante) se enfrenta contra Papel.
     */
    Resultado jugarContraPapel();
    
    /**
     * Determina el resultado cuando esta jugada (visitante) se enfrenta contra Tijera.
     */
    Resultado jugarContraTijera();
}
