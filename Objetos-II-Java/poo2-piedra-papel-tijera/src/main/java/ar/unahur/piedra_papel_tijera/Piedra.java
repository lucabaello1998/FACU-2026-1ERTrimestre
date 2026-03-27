package ar.unahur.piedra_papel_tijera;

/**
 * Representa la jugada Piedra.
 * 
 * - Piedra GANA contra Tijera
 * - Piedra PIERDE contra Papel
 * - Piedra EMPATA contra Piedra
 */
public class Piedra implements Jugada {
    
    @Override
    public Resultado jugarContra(Jugada otra) {
        return otra.jugarContraPiedra().invertir();
    }
    
    @Override
    public Resultado jugarContraPiedra() {
        return Resultado.EMPATA;
    }
    
    @Override
    public Resultado jugarContraPapel() {
        return Resultado.PIERDE;
    }
    
    @Override
    public Resultado jugarContraTijera() {
        return Resultado.GANA;
    }
    
    @Override
    public String toString() {
        return "Piedra";
    }
}
