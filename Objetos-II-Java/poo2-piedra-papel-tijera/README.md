# Piedra, Papel o Tijera - Double Dispatch

Ejercicio de Objetos II sobre el patrón de diseño **Double Dispatch** implementado con el patrón **Visitor**.

## Objetivos

- Comprender cómo funciona el **dispatch simple** vs **double dispatch**
- Implementar el patrón **Visitor** para simular double dispatch en Java
- Modelar el juego Piedra, Papel o Tijera con reglas claras
- Escribir código escalable y mantenible

## Conceptos Clave

### Double Dispatch
El "doble dispatch" permite que la ejecución de un método dependa del tipo dinámico de **dos objetos**, no solo uno.

En el ejemplo de Piedra, Papel o Tijera:
- La decisión de quién gana depende de **la elección del jugador A Y la elección del jugador B**
- Un simple `if-else` o `switch` en una jerarquía no es suficiente

### Patrón Visitor
En Java, que tiene dispatch simple, usamos el patrón **Visitor** para lograr el comportamiento de double dispatch:

```
Visitor: Jugada
  ├── visitarPiedra(Piedra)
  ├── visitarPapel(Papel)
  └── visitarTijera(Tijera)
```

## Estructura Base

```
src/main/java/ar/unahur/piedra_papel_tijera/
  ├── Jugada (interfaz)
  ├── Piedra (implements Jugada)
  ├── Papel (implements Jugada)
  ├── Tijera (implements Jugada)
  ├── Resultado (enum: GANA, PIERDE, EMPATA)
  └── Juego (orquesta la lógica del partido)
```

## Paso a Paso

### 1. Definir la jerarquía de Jugadas
Cada Jugada puede recibir un "visitor" (otra Jugada) para determinar el resultado.

### 2. Implementar el Visitor
Cada Jugada define cómo interactúa con las otras Jugadas:
- `Piedra.jugarContra(Papel)` → PIERDE
- `Piedra.jugarContra(Scissors)` → GANA
- `Piedra.jugarContra(Piedra)` → EMPATA

### 3. Escribir tests
Tests unitarios con JUnit 5 para validar todas las combinaciones.

## Dependencias

- **JUnit 5**: Para testing
- **Mockito**: Para mocks (si los necesitas)
- **AssertJ**: Para assertions fluidas

## Referencias

- Repositorio de ejemplo: https://github.com/unahur-obj2-2025c1/piedra_papel_tijera
- Pattern: Visitor (Gang of Four)
- Pattern: Double Dispatch
