package ar.unahur.piedra_papel_tijera;

/**
 * Representa la jugada Papel.
 * 
 * - Papel GANA contra Piedra
 * - Papel PIERDE contra Tijera
 * - Papel EMPATA contra Papel
 */
public class Papel implements Jugada {
    
    @Override
    public Resultado jugarContra(Jugada otra) {
        return otra.jugarContraPapel().invertir();
    }
    
    @Override
    public Resultado jugarContraPiedra() {
        return Resultado.GANA;
    }
    
    @Override
    public Resultado jugarContraPapel() {
        return Resultado.EMPATA;
    }
    
    @Override
    public Resultado jugarContraTijera() {
        return Resultado.PIERDE;
    }
    
    @Override
    public String toString() {
        return "Papel";
    }
}
