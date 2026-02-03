# 🧠 Mood Radar Service

Mood Radar Service es un microservicio enfocado en el registro y análisis de estados emocionales. Forma parte de una plataforma de bienestar mental cuyo objetivo es ayudar a las personas a comprender sus patrones emocionales a lo largo del tiempo.

⚠️ **Este servicio no realiza diagnósticos médicos. Su propósito es el acompañamiento, la auto-observación y la detección temprana de tendencias emocionales.**

## 🎯 Objetivo

Permitir que los usuarios registren su estado de ánimo y factores relacionados (sueño, energía, ansiedad, interacción social, pensamientos) para:

- Llevar una bitácora emocional estructurada
- Identificar patrones emocionales a lo largo del tiempo
- Detectar posibles señales de alerta temprana
- Generar insights personalizados de bienestar

## 🧩 Responsabilidades del Microservicio

Este servicio se encarga de:

- Registrar entradas diarias de estado emocional
- Almacenar información contextual (sueño, energía, estrés, interacción social)
- Guardar notas y reflexiones del usuario
- Exponer datos históricos para gráficas y análisis
- Detectar patrones básicos (ej: ánimo bajo prolongado, mala calidad de sueño frecuente)
- Generar señales emocionales automáticas (sin diagnóstico clínico)

## 📦 Modelo Principal

Cada registro emocional contiene:

- Estado de ánimo general
- Nivel de energía
- Nivel de ansiedad y estrés
- Horas y calidad de sueño
- Nivel de interacción social
- Notas personales
- Etiquetas (trabajo, familia, salud, etc.)
- Señales automáticas generadas por el sistema

Esto permite construir una visión longitudinal del bienestar emocional del usuario.

## 🧠 Análisis Emocional

El sistema analiza tendencias como:

- Rachas de ánimo bajo
- Energía persistentemente baja
- Problemas de sueño recurrentes
- Aislamiento social repetido
- Aumento sostenido de ansiedad o estrés

Cuando se detectan combinaciones de estos factores, se generan señales de bienestar que pueden usarse para mostrar recomendaciones o sugerencias de apoyo dentro de la aplicación.

## 🛠️ Stack Tecnológico

| Componente      | Tecnología           |
|-----------------|---------------------|
| Lenguaje        | Java                |
| Framework       | Spring Boot         |
| Base de datos   | MongoDB             |
| Acceso a datos  | Spring Data MongoDB |
| Arquitectura    | Microservicio REST  |
| Paradigma       | Orientado a eventos y análisis de tendencias |

## 🔒 Privacidad y Ética

La información emocional es altamente sensible. Este servicio está diseñado bajo los siguientes principios:

- Los datos pertenecen al usuario
- El sistema no reemplaza atención psicológica profesional
- No se realizan diagnósticos clínicos automáticos
- Los patrones detectados son solo indicadores de bienestar
- Se promueve el acceso a ayuda profesional cuando se detectan señales de alerta

## 🚀 Futuras Extensiones

- Integración con evaluaciones emocionales validadas (ej. PHQ-9, GAD-7)
- Motor de recomendaciones personalizadas
- Detección de distorsiones cognitivas mediante análisis de texto
- Alertas de riesgo emocional elevado
- Visualización avanzada de tendencias

## 💡 Filosofía del Proyecto

> “Lo que no se mide, no se puede entender.  
> Lo que se entiende, se puede cuidar.”

Mood Radar busca ser una herramienta de autoconocimiento que ayude a las personas a notar cambios emocionales antes de que se conviertan en crisis.

---

# 🏗️ Arquitectura Clean Architecture

Este proyecto implementa Clean Architecture para garantizar separación de responsabilidades, mantenibilidad y escalabilidad.

![Clean Architecture](https://miro.medium.com/max/1400/1*ZdlHz8B0-qu9Y-QO3AXR_w.png)

## Domain

Módulo más interno, encapsula la lógica y reglas del negocio mediante modelos y entidades del dominio.

## Usecases

Implementa los casos de uso del sistema, define lógica de aplicación y orquesta los flujos hacia el módulo de entities.

## Infrastructure

### Helpers

Utilidades generales para Driven Adapters y Entry Points, basadas en patrones como Unit of Work y Repository.

### Driven Adapters

Implementaciones externas como conexiones a servicios REST, bases de datos, archivos, etc.

### Entry Points

Puntos de entrada de la aplicación o inicio de los flujos de negocio.

## Application

Módulo más externo, ensambla los distintos módulos, resuelve dependencias y crea los beans de los casos de uso. Inicia la aplicación (`public static void main(String[] args)`).

**Los beans de los casos de uso se disponibilizan automáticamente gracias a un `@ComponentScan` ubicado en esta capa.**
