# AUTO_FRONT_POM_FACTORY

Proyecto de automatización UI con **Serenity BDD + Cucumber + Selenium** (patrón POM), ejecutado con **Gradle**.

## 1) Prerrequisitos

- Java 17 instalado (`java -version`)
- Google Chrome instalado
- Linux/macOS/Windows con permisos para ejecutar `gradlew`
- Dirigirse a https://github.com/AITraining-SofkaProyects-Team2/.github/tree/main
- Clonar ese repositorio
- Pararse con una terminal dentro de esa direccion clonada
- Ejecutar docker compose up --build

> URL base configurada por defecto en `src/test/resources/serenity.conf`:
>
> `webdriver.base.url = "http://localhost/dashboard"`

Si no hay una app respondiendo en esa URL, la prueba falla con:

`WebDriverException: net::ERR_CONNECTION_REFUSED`

## 2) Ejecutar pruebas (Gradle)

Desde la carpeta del proyecto:

```bash
cd AUTO_FRONT_POM_FACTORY
chmod +x gradlew
./gradlew clean test aggregate
```

El proyecto está configurado para generar reportes automáticamente al final de `test`.


## 3) Ver reportes

- Reporte principal Serenity:
  - `target/site/serenity/index.html`
- Resumen single-page:
  - `target/site/serenity/serenity-summary.html`
- Reporte de pruebas Gradle:
  - `build/reports/tests/test/index.html`