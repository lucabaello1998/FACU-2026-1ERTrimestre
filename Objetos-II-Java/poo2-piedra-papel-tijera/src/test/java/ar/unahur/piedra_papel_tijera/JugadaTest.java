package ar.unahur.piedra_papel_tijera;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * Tests unitarios para validar la lógica de cada jugada.
 */
class JugadaTest {
    
    @Test
    void testPiedraGanaContraTijera() {
        Jugada piedra = new Piedra();
        Jugada tijera = new Tijera();
        
        Resultado resultado = piedra.jugarContra(tijera);
        
        assertThat(resultado).isEqualTo(Resultado.GANA);
    }
    
    @Test
    void testPiedraEmpataContraPiedra() {
        Jugada piedra1 = new Piedra();
        Jugada piedra2 = new Piedra();
        
        Resultado resultado = piedra1.jugarContra(piedra2);
        
        assertThat(resultado).isEqualTo(Resultado.EMPATA);
    }
    
    @Test
    void testPiedrapierdeCContraPapel() {
        Jugada piedra = new Piedra();
        Jugada papel = new Papel();
        
        Resultado resultado = piedra.jugarContra(papel);
        
        assertThat(resultado).isEqualTo(Resultado.PIERDE);
    }
    
    @Test
    void testPapelGanaContraPiedra() {
        Jugada papel = new Papel();
        Jugada piedra = new Piedra();
        
        Resultado resultado = papel.jugarContra(piedra);
        
        assertThat(resultado).isEqualTo(Resultado.GANA);
    }
    
    @Test
    void testPapelEmpataContraPapel() {
        Jugada papel1 = new Papel();
        Jugada papel2 = new Papel();
        
        Resultado resultado = papel1.jugarContra(papel2);
        
        assertThat(resultado).isEqualTo(Resultado.EMPATA);
    }
    
    @Test
    void testPapelPierdeContraTijera() {
        Jugada papel = new Papel();
        Jugada tijera = new Tijera();
        
        Resultado resultado = papel.jugarContra(tijera);
        
        assertThat(resultado).isEqualTo(Resultado.PIERDE);
    }
    
    @Test
    void testTijeraGanaContraPapel() {
        Jugada tijera = new Tijera();
        Jugada papel = new Papel();
        
        Resultado resultado = tijera.jugarContra(papel);
        
        assertThat(resultado).isEqualTo(Resultado.GANA);
    }
    
    @Test
    void testTijeraEmpataContraTijera() {
        Jugada tijera1 = new Tijera();
        Jugada tijera2 = new Tijera();
        
        Resultado resultado = tijera1.jugarContra(tijera2);
        
        assertThat(resultado).isEqualTo(Resultado.EMPATA);
    }
    
    @Test
    void testTijeraPierdeContraPiedra() {
        Jugada tijera = new Tijera();
        Jugada piedra = new Piedra();
        
        Resultado resultado = tijera.jugarContra(piedra);
        
        assertThat(resultado).isEqualTo(Resultado.PIERDE);
    }
}
