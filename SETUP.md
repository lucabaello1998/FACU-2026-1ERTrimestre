# Setup - Instalación de herramientas - UNAHUR 2026 C1

Guía para instalar todas las herramientas necesarias para el cuatrimestre en Windows.

---

## 1. Java Development Kit (JDK) 17+

**¿Para qué:** Objetos II, todas las prácticas en Maven.

### Descargar
- **Opción oficial:** https://www.oracle.com/java/technologies/downloads/
- **Opción libre (recomendado):** https://adoptium.net/ (Eclipse Adoptium)

### Instalación Windows
1. Descargar JDK 17 o superior
2. Ejecutar el instalador `.exe`
3. Elegir ruta (ej: `C:\Program Files\Java\jdk-17`)
4. Dejar opciones por defecto

### Verificar instalación
```powershell
java -version
javac -version
```

---

## 2. Apache Maven 3.9+

**¿Para qué:** Build tool, gestión de dependencias y tests en Objetos II.

### Descargar
https://maven.apache.org/download.cgi

### Instalación Windows (manual)
1. Descargar `apache-maven-3.9.x-bin.zip`
2. Descomprimir en `C:\maven\` (crear la carpeta)
3. Agregar Maven al PATH:
   - Win+X → Sistema
   - Variables de entorno → Nueva variable de sistema
   - Variable: `MAVEN_HOME` → Valor: `C:\maven\apache-maven-3.9.x`
   - Editar PATH y agregar: `%MAVEN_HOME%\bin`
4. Reiniciar terminal

O mejor aún, tenés una instalación ya en:
```
C:\Users\lucac\.maven\maven-3.9.14\bin
```

### Verificar instalación
```powershell
mvn -version
```

---

## 3. Python 3.14+

**¿Para qué:** Análisis en Matemática II, SIG.

### Descargar
https://www.python.org/downloads/

### Instalación Windows
1. Ejecutar instalador `.exe`
2. **IMPORTANTE:** Marcar ✓ "Add Python to PATH"
3. Elegir "Install Now"

### Verificar instalación
```powershell
python --version
python -m pip --version
```

### Librerías necesarias (ejecutar una sola vez)
```powershell
python -m pip install matplotlib numpy scipy networkx openpyxl
```

---

## 4. R + RStudio

**¿Para qué:** Análisis espacial, teledetección en SIG.

### Descargar R
https://cran.r-project.org/

### Instalación R (Windows)
1. Descargar "Download R for Windows"
2. Ejecutar instalador `.exe`
3. Dejar opciones por defecto

### Descargar RStudio
https://posit.co/download/rstudio-desktop/

### Instalación RStudio
1. Descargar la versión Windows
2. Ejecutar instalador `.exe`
3. Dejar opciones por defecto

### Verificar instalación
- Abrir RStudio (se abrirá con R integrado)

---

## 5. QGIS 3.44 (LTR)

**¿Para qué:** Mapas, capas, visualización en SIG.

### Descargar
https://www.qgis.org/es/site/

### Instalación Windows
1. Descargar "LTR 3.44" (Long Term Release)
2. Ejecutar instalador `.exe`
3. Aceptar términos y dejar opciones por defecto

### Primera vez
- Abrir QGIS
- Explorar interfaz (capas, proyecto, herramientas)

---

## 6. Git + Sincronización

**¿Para qué:** Versionado, sincronización entre PC y facu.

### Descargar
https://git-scm.com/download/win

### Instalación
1. Ejecutar instalador `.exe`
2. Dejar opciones por defecto (permite usar `git` en PowerShell)

### Configuración inicial (solo una vez)
```powershell
git config --global user.name "Tu Nombre"
git config --global user.email "tu.email@unahur.edu.ar"
```

### Clonar el repo en la facu
```powershell
cd Desktop
git clone https://github.com/lucabaello1998/FACU-2026-1ERTrimestre.git
cd FACU-2026-1ERTrimestre
```

### Actualizar en la facu (antes de cada clase)
```powershell
git pull
```

### Guardar cambios en la facu (después de trabajar)
```powershell
git add .
git commit -m "Descripción breve"
git push
```

---

## 7. VS Code + Extensiones

**¿Para qué:** Editor, debugging, notas.

### Descargar
https://code.visualstudio.com/

### Instalación
1. Ejecutar instalador `.exe`
2. Dejar opciones por defecto

### Extensiones recomendadas (ya instaladas en tu perfil)
- GitHub Copilot (AI)
- Language Support for Java (Red Hat)
- R (REditorSupport)
- R Debugger (rdebugger)

---

## Checklist de instalación

- [ ] JDK 17+ instalado y en PATH
- [ ] Maven 3.9+ instalado y en PATH
- [ ] Python 3.14+ instalado con librerías (matplotlib, numpy, scipy, networkx, openpyxl)
- [ ] R instalado
- [ ] RStudio instalado
- [ ] QGIS 3.44 LTR instalado
- [ ] Git instalado y configurado
- [ ] Repo clonado en la facu desde GitHub

---

## Orden recomendado de instalación

1. **JDK** (primero, lo necesita Maven)
2. **Maven** (después JDK)
3. **Python** (independiente)
4. **R** y **RStudio** (juntos)
5. **QGIS** (independiente)
6. **Git** (independiente)
7. **VS Code** (último, al final)

---

## Solución de problemas

### "mvn no se reconoce"
- Verificar que Maven está en PATH
- Reiniciar PowerShell/CMD
- Ejecutar: `$env:MAVEN_HOME` (debería mostrar la ruta)

### "python no se reconoce"
- Reinstalar Python marcando ✓ "Add to PATH"
- Reiniciar terminal

### "QGIS no abre"
- Verificar que el disco tiene espacio (instala ~2GB)
- Descargar desde https://www.qgis.org/es/site/ (no de App Store)

---

**¿Necesitas ayuda con alguna instalación? Avísame cuando estés en la facu.**
