# Calculadora de Figuras Geométricas 🧮

Este proyecto en Java permite calcular el área y el perímetro de diferentes figuras geométricas mediante una interfaz gráfica personalizada con `MenuBarPersonalizable`.

## Características

- Interfaz gráfica con menús para cada figura.
- Cálculo de **área** y **perímetro** para:
  - Cuadrado
  - Rectángulo
  - Triángulo
  - Pentágono
  - Hexágono
  - Círculo
- Botón de **cerrar aplicación** desde el menú.
- Personalización del menú superior con colores, gradientes y efectos.

## Tecnologías Usadas

- Java
- Swing
- NetBeans
- Javadoc para documentación
- Componente personalizado `MenuBarPersonalizable.jar`

## Cómo Ejecutarlo

1. Abre el proyecto en NetBeans u otro IDE compatible.
2. Asegúrate de tener las siguientes clases:
   - `MenuBarPersonalizable.java` (o el `.jar` agregado al palette).
   - `CalculadoraFiguras.java` (con los métodos estáticos).
   - `FormularioPrincipal.java` (el JFrame con los menús).
3. Ejecuta el archivo principal (`implementacion`).
4. Usa el menú para elegir una figura y calcula su área o perímetro.

## Ejemplo de uso

> Selecciona **Figuras > Cuadrado > Calcular Área**, introduce el lado, y verás el resultado.

---

## 📁 Estructura del Proyecto

libreria/
 ├── libreriaValidacion/ <- Contiene menuPersonalizado y CalculadoraFiguras
 ├── implementacion/ <- Contiene la implementacion de la clase principal
 └── documentacion/ <- Archivos javadoc

## Autor

Desarrollado por Hernandez Uvera Azael y Toledo Mariscal Isai Raziel.

---

## Licencia

Este proyecto es de uso libre para fines educativos.
