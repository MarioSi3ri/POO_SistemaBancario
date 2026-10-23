# 🏦 POO Sistema Bancario

![Java](https://img.shields.io/badge/Java-100%25-orange?style=for-the-badge&logo=openjdk)
![Paradigma](https://img.shields.io/badge/Paradigma-POO-blue?style=for-the-badge)
![Estado](https://img.shields.io/badge/Estado-Académico-success?style=for-the-badge)

Proyecto académico desarrollado en **Java** para practicar los fundamentos de la **Programación Orientada a Objetos**, especialmente la **herencia**, la reutilización de código y el paso de parámetros mediante constructores.

El programa simula operaciones básicas de un sistema bancario con una cuenta base y diferentes productos financieros: tarjeta de crédito, tarjeta de débito y cuenta de ahorro.

> Proyecto correspondiente al **Reto 4: Herencia de clases y paso de parámetros** de la UVEG.

---

## 📖 Contenido

- [Acerca del proyecto](#-acerca-del-proyecto)
- [Objetivos de aprendizaje](#-objetivos-de-aprendizaje)
- [Funcionalidades](#-funcionalidades)
- [Estructura del proyecto](#-estructura-del-proyecto)
- [Tecnologías utilizadas](#-tecnologías-utilizadas)
- [Requisitos previos](#-requisitos-previos)
- [Instalación](#-instalación)
- [Ejecución](#-ejecución)
- [Ejemplo de uso](#-ejemplo-de-uso)
- [Conceptos de POO aplicados](#-conceptos-de-poo-aplicados)
- [Consideraciones](#-consideraciones)
- [Autor](#-autor)

---

## 🧾 Acerca del proyecto

**POO Sistema Bancario** es una aplicación de consola que representa de forma sencilla el comportamiento de distintos productos bancarios.

La clase `CuentaBase` concentra los atributos y operaciones comunes, mientras que las clases especializadas heredan sus características y agregan reglas particulares:

- Una **tarjeta de crédito** administra una deuda e incrementa el monto mediante intereses.
- Una **tarjeta de débito** permite realizar retiros siempre que exista saldo suficiente.
- Una **cuenta de ahorro** permite incrementar el saldo mediante una inversión del 10%.

La interacción se realiza desde la consola mediante la clase principal `MexBank`, que solicita cantidades al usuario y muestra los saldos resultantes.

---

## 🎯 Objetivos de aprendizaje

Este proyecto permite practicar los siguientes temas:

- Creación de clases y objetos.
- Definición y uso de constructores.
- Encapsulamiento mediante atributos privados y métodos de acceso.
- Herencia entre clases relacionadas.
- Reutilización de atributos y métodos de una clase base.
- Sobrescritura de métodos.
- Lectura de datos desde la consola con `Scanner`.
- Aplicación de reglas de negocio sencillas.

---

## ✨ Funcionalidades

### 💳 Tarjeta de crédito

- Inicializa el monto como una deuda, utilizando el valor de apertura con signo negativo.
- Aplica un interés del **15%** mediante el método `sumaInteres()`.
- Permite registrar un depósito o abono.
- Muestra el monto actualizado.

### 💰 Tarjeta de débito

- Inicia con un saldo disponible.
- Permite retirar una cantidad si:
  - Es mayor que cero.
  - No supera el saldo actual.
- Informa si la operación fue exitosa o si existe saldo insuficiente.

### 🏦 Cuenta de ahorro

- Inicia con un saldo de apertura.
- Aplica una inversión del **10%** mediante el método `invertir()`.
- Permite depositar una cantidad adicional.
- Vuelve a calcular la inversión sobre el nuevo saldo.

---

## 📁 Estructura del proyecto

```text
POO_SistemaBancario/
├── Herencia/
│   ├── src/
│   │   └── main/
│   │       └── java/
│   │           └── com/
│   │               └── si3ri/
│   │                   └── reto/
│   │                       ├── CuentaBase.java
│   │                       ├── CuentaAhorro.java
│   │                       ├── MexBank.java
│   │                       ├── TarjetaCredito.java
│   │                       └── TarjetaDebito.java
│   └── .idea/
├── .idea/
└── POO_SistemaBancario.iml
```

### Descripción de las clases

| Clase | Responsabilidad |
|---|---|
| `CuentaBase` | Define el monto actual y las operaciones generales de depósito y retiro. |
| `TarjetaCredito` | Hereda de `CuentaBase` y aplica intereses del 15% sobre la deuda. |
| `TarjetaDebito` | Hereda de `CuentaBase` y valida los retiros contra el saldo disponible. |
| `CuentaAhorro` | Hereda de `CuentaBase` y aplica una inversión del 10% al saldo. |
| `MexBank` | Contiene el método `main` y coordina la interacción con el usuario. |

---

## 🛠️ Tecnologías utilizadas

- **Java** — lenguaje principal del proyecto.
- **JDK** — compilación y ejecución de la aplicación.
- **`java.util.Scanner`** — captura de datos desde la consola.
- **IntelliJ IDEA** — estructura de proyecto y archivos de configuración incluidos.
- **Git/GitHub** — control de versiones y publicación del código.

No se utilizan bases de datos, dependencias externas ni frameworks.

---

## ✅ Requisitos previos

Antes de ejecutar el proyecto, asegúrate de contar con:

- **JDK 8 o superior** instalado.
- Una terminal o consola de comandos.
- Opcionalmente, **IntelliJ IDEA** u otro IDE compatible con Java.

Puedes comprobar que Java está instalado ejecutando:

```bash
java -version
javac -version
```

---

## 📥 Instalación

### 1. Clonar el repositorio

```bash
git clone https://github.com/MarioSi3ri/POO_SistemaBancario.git
```

### 2. Entrar al directorio del proyecto

```bash
cd POO_SistemaBancario
```

### 3. Abrir el proyecto

Puedes abrir la carpeta en IntelliJ IDEA o trabajar directamente desde la terminal.

En IntelliJ IDEA:

1. Selecciona **Open**.
2. Elige la carpeta `POO_SistemaBancario`.
3. Configura un JDK instalado en tu equipo.
4. Ubica la clase `MexBank.java`.

---

## ▶️ Ejecución

### Opción A: desde IntelliJ IDEA

1. Abre el archivo:

   ```text
   Herencia/src/main/java/com/si3ri/reto/MexBank.java
   ```

2. Haz clic derecho sobre la clase `MexBank`.
3. Selecciona **Run 'MexBank.main()'**.
4. Introduce los valores solicitados en la consola.

### Opción B: desde la terminal

Desde la raíz del repositorio, crea una carpeta para los archivos compilados:

```bash
mkdir -p out
```

En Windows PowerShell puedes utilizar:

```powershell
New-Item -ItemType Directory -Force out
```

Compila las clases Java:

```bash
javac -d out Herencia/src/main/java/com/si3ri/reto/*.java
```

Ejecuta la clase principal:

```bash
java -cp out main.java.com.si3ri.reto.MexBank
```

> El paquete declarado en las clases es `main.java.com.si3ri.reto`, por lo que el nombre completo de la clase principal incluye ese prefijo al ejecutar desde la terminal.

---

## 🧪 Ejemplo de uso

Al iniciar el programa, se crean automáticamente las siguientes cuentas:

- Tarjeta de crédito con apertura de `1000`.
- Tarjeta de débito con apertura de `3000`.
- Cuenta de ahorro con apertura de `5000`.

Después, el sistema solicita:

1. Una cantidad para depositar en la tarjeta de crédito.
2. Una cantidad para retirar de la tarjeta de débito.
3. Una cantidad para invertir o depositar en la cuenta de ahorro.

Ejemplo de interacción:

```text
====TARJETA DE CRÉDITO====
Saldo/Deuda inicial: -1000.0
Actualizando saldo y aplicando intereses del 15%...
Saldo/Deuda inicial actualizado/a: -1150.0
Ingrese la cantidad a depositar en la tarjeta de crédito: 200

====TARJETA DE DÉBITO====
Saldo inicial: 3000.0
Ingrese la cantidad a retirar de la tarjeta de débito: 500
Retiro realizado con éxito.
Saldo actual de la tarjeta de debito: 2500.0

====CUENTA DE AHORRO====
Saldo inicial: 5000.0
Actualizando saldo y aplicando invesión del 10%...
Saldo inicial actualizado: 5500.0
Ingrese la cantidad a invertir en su cuenta de ahorro: 1000
Saldo actual de la cuenta de ahorro: 7150.0
```

Los valores anteriores son únicamente ilustrativos; el resultado real depende de las cantidades introducidas durante la ejecución.

---

## 🧠 Conceptos de POO aplicados

### Herencia

Las clases `TarjetaCredito`, `TarjetaDebito` y `CuentaAhorro` extienden a `CuentaBase` mediante la palabra reservada `extends`:

```java
public class CuentaAhorro extends CuentaBase {
    // comportamiento especializado
}
```

### Encapsulamiento

El atributo `montoActual` se declara como `private` y se consulta o modifica mediante los métodos `getMontoActual()` y `setMontoActual()`.

### Reutilización de código

Las operaciones y el estado común de las cuentas se implementan una sola vez en `CuentaBase`, evitando repetir la misma lógica en cada clase hija.

### Sobrescritura de métodos

`TarjetaDebito` redefine el método `retirar(double cantidad)` para agregar validaciones específicas antes de efectuar el retiro.

### Constructores y `super`

Cada clase hija invoca el constructor de la clase base mediante `super(apertura)`, permitiendo inicializar el monto desde la clase padre.

---

## ⚠️ Consideraciones

- Es una simulación académica; no representa un sistema bancario real.
- Los datos se mantienen únicamente durante la ejecución y no se guardan en una base de datos.
- La aplicación utiliza valores de tipo `double`, por lo que no está diseñada para cálculos financieros de precisión real.
- La validación de entradas es básica y presupone que el usuario introduce números válidos.
- Las tasas del 15% y 10% son reglas fijas definidas para el ejercicio.
- El proyecto no incluye pruebas automatizadas ni un sistema de autenticación.

---

## 🚀 Posibles mejoras

Como futuras extensiones del proyecto se podrían incorporar:

- Menú interactivo para seleccionar operaciones.
- Validación robusta de entradas no numéricas.
- Uso de `BigDecimal` para cálculos monetarios.
- Historial de movimientos.
- Persistencia de cuentas y transacciones.
- Excepciones personalizadas para operaciones inválidas.
- Pruebas unitarias con JUnit.
- Separación entre lógica de negocio, presentación y acceso a datos.

---

## 👤 Autor

**Mario Si3ri**

- GitHub: [@MarioSi3ri](https://github.com/MarioSi3ri)
- Repositorio: [POO_SistemaBancario](https://github.com/MarioSi3ri/POO_SistemaBancario)

---

## 📄 Licencia

Este proyecto se distribuye bajo la **Licencia MIT**. Consulta el archivo [LICENSE](LICENSE) para conocer los términos completos.

---

⭐ Si este proyecto te resulta útil para estudiar Programación Orientada a Objetos, considera darle una estrella al repositorio.
