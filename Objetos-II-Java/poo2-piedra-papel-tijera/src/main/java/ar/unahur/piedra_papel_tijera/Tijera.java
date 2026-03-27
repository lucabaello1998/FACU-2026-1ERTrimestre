package ar.unahur.piedra_papel_tijera;

/**
 * Representa la jugada Tijera.
 * 
 * - Tijera GANA contra Papel
 * - Tijera PIERDE contra Piedra
 * - Tijera EMPATA contra Tijera
 */
public class Tijera implements Jugada {
    
    @Override
    public Resultado jugarContra(Jugada otra) {
        return otra.jugarContraTijera().invertir();
    }
    
    @Override
    public Resultado jugarContraPiedra() {
        return Resultado.PIERDE;
    }
    
    @Override
    public Resultado jugarContraPapel() {
        return Resultado.GANA;
    }
    
    @Override
    public Resultado jugarContraTijera() {
        return Resultado.EMPATA;
    }
    
    @Override
    public String toString() {
        return "Tijera";
    }
}
