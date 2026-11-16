# LlanquihueTourApp

## Descripción del proyecto

LlanquihueTourApp es una aplicación desarrollada en Java que permite gestionar información de tours turísticos de la agencia Llanquihue Tour, ubicada en la Región de Los Lagos.

El programa lee información desde un archivo de texto (`tours.txt`), crea objetos de tipo `Tour` y los almacena en una colección `ArrayList`.

Además, permite recorrer la colección para mostrar todos los tours registrados y aplicar filtros según el precio de cada uno.

El proyecto fue desarrollado utilizando Java 25, Maven e IntelliJ IDEA, aplicando conceptos de programación orientada a objetos y manejo de archivos.

## Estructura del proyecto

```text
LlanquihueTourApp/
│
├── src/
│   └── main/
│       ├── java/
│       │   ├── model/
│       │   │   └── Tour.java
│       │   │
│       │   ├── data/
│       │   │   └── GestorDatos.java
│       │   │
│       │   └── ui/
│       │       └── Main.java
│       │
│       └── resources/
│           └── tours.txt
│
├── pom.xml
├── .gitignore
└── README.md
```

## Descripción de las clases

### Paquete model

- **Tour.java:** representa un tour turístico mediante los atributos nombre, tipo y precio. Incluye constructor, getters, setters y método `toString()`.

### Paquete data

- **GestorDatos.java:** se encarga de leer el archivo `tours.txt`, separar los registros mediante `split(";")`, crear objetos de tipo `Tour` y almacenarlos en un `ArrayList`.

### Paquete ui

- **Main.java:** contiene el método principal del programa. Ejecuta la carga de datos, muestra todos los tours registrados y filtra aquellos cuyo precio es superior a $25.000.

### Carpeta resources

- **tours.txt:** archivo de texto que contiene los registros de los tours, separados por punto y coma.

## Instrucciones para ejecutar el proyecto

1. Clonar o descargar el repositorio desde GitHub.
2. Abrir el proyecto `LlanquihueTourApp` utilizando IntelliJ IDEA.
3. Verificar que Maven haya cargado correctamente las dependencias y que esté configurado Java 25.
4. Comprobar que el archivo `tours.txt` se encuentre dentro de `src/main/resources`.
5. Abrir la clase `Main.java`, ubicada en el paquete `ui`.
6. Ejecutar el método `main()` mediante la opción **Run 'Main.main()'**.
7. Revisar la consola para visualizar los tours cargados y los resultados del filtro por precio.

## Funcionalidades implementadas

- Lectura de datos desde un archivo `.txt`.
- Separación de registros mediante `split(";")`.
- Creación de objetos a partir de los datos del archivo.
- Almacenamiento de objetos en un `ArrayList`.
- Recorrido de la colección mediante `for-each`.
- Filtrado de tours según su precio.

---

**Proyecto:** LlanquihueTourApp

**Asignatura:** Desarrollo Orientado a Objetos I

**Institución:** Duoc UC