💶 Conversor Euro a Yen (Comparativa de Binding) 💴

🚀 Descripción del Proyecto Este proyecto es una aplicación Android simple desarrollada en Java cuyo objetivo principal es convertir una cantidad de Euros (€) a Yenes Japoneses (¥). El propósito académico de esta aplicación es servir como comparativa práctica entre dos enfoques cruciales en el desarrollo de Android para la interacción entre la lógica de la aplicación y la interfaz de usuario (UI): ✅ Data Binding (Método Moderno): Enfoque requerido, que separa la lógica de la UI y reduce la cantidad de código repetitivo. ❌ Método Tradicional (findViewById): Enfoque manual que concentra la lógica de la UI y el negocio en la Activity.

✨ Funcionalidades Conversión de Moneda: Convierte la cantidad ingresada en Euros a Yenes (tasa fija de 1€ = 160¥). Validación de Entrada: Maneja entradas vacías o no numéricas. Soporte Multilenguaje: Todos los textos de la aplicación (hints, botones, resultados, errores) están externalizados para soportar Español e Inglés.

Requisitos de Desarrollo Android Studio: Arctic Fox 2020.3.1 o superior. SDK Mínimo: Android 5.0 (Lollipop) o superior. Lenguaje: Java.

Configuración del Data Binding

Para compilar la versión con Data Binding, es necesario añadir la siguiente configuración en el archivo build.gradle (Módulo: app): Groovy android { // ... buildFeatures { dataBinding true // Activación de la herramienta } } 📄 Licencia

Este proyecto está bajo la Licencia MIT. 🧑‍🤝‍🧑 Autores y colaboradores Gonzalo Durán - Implementación del Método Tradicional (findViewById) Alejandro Cantos - Implementación del Método Data Binding Davante Medac Sevilla Este - Contexto del proyecto
