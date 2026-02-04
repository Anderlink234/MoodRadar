---
name: scaffold-clean-architecture
description: >
  Usa esta skill ÚNICAMENTE cuando el usuario indique explícitamente que desea
  generar o modificar componentes utilizando el Scaffold Clean Architecture
  Gradle Plugin (por ejemplo: "genera un modelo con scaffold",
  "crear un caso de uso con scaffold", "generar proyecto con clean architecture").
  NO usar para explicaciones teóricas generales.
---

# Scaffold Clean Architecture — Guía Operativa para Generación de Componentes

Esta skill permite generar proyectos y componentes usando el plugin:

`co.com.bancolombia.cleanArchitecture`

Basado en principios de Clean Architecture de Robert C. Martin.

---

## 🧱 Arquitectura Generada

La estructura se divide en:

### Domain
- `model` → Entidades y puertos (interfaces)
- `usecase` → Casos de uso y lógica de aplicación

### Infrastructure
- `entry-points` → REST, Kafka, etc.
- `driven-adapters` → DB, APIs externas, colas, etc.
- `helpers` → utilidades compartidas

### Application
Módulo ensamblador donde vive el `main()` y la configuración de inyección.

---

## ⚙️ STACK TECNOLÓGICO

- Java 17+
- Gradle 9.2.1+
- Reactor (Flux / Mono)
- Reactive Commons (RabbitMQ event-driven)
- Secrets Manager (opcional)

---

# 🚀 COMANDOS SOPORTADOS

La respuesta SIEMPRE debe incluir el comando Gradle exacto a ejecutar.

---

## 🏗️ Generar Proyecto Base

**Trigger:** Usuario pide crear/generar proyecto scaffold

```bash
gradle ca --name=<ProjectName> --type=reactive --package=<base.package>
