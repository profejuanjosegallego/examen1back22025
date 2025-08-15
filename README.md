# Examen 1 - Backend 2

## Descripción del proyecto
Este proyecto es una aplicación básica de Spring Boot centrada en la capa de modelos para una academia. 
El objetivo principal fue realizar una refactorización y corrección del código, aplicando buenas prácticas de desarrollo
y configurando la conexión a una base de datos relacional.

## Tareas realizadas

### 1. Listado de errores corregidos con explicación
Se analizaron y corrigieron las clases del paquete com.example.Examen1Back2.modelos para asegurar la correcta 
implementación de las anotaciones JPA y la estructura de las clases. A continuación, se detalla el registro de cada 
cambio realizado.

#### Registro de cambios:

- **`Docente.java`**:
Línea(s) Afectada(s): 7, 10, 11, 13, 14, 15, 17, 19, 20, 21, 23, 24, 25, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38,
39, 40

Error: Anotación @Entity incompleta; falta @Id en la clave primaria; ausencia de getters, setters y constructores; falta
cascade en @OneToMany.

Solución: Se completaron las anotaciones @Entity y @Id. Se implementaron getters y setters completos para todos los 
campos, así como constructores para una mejor estructura. Se añadió cascade = CascadeType.ALL para asegurar la 
correcta propagación de las operaciones.

- **`Curso.java`**:
  Línea(s) Afectada(s): 7, 9, 10, 11, 12, 14, 15, 16, 17, 18, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32

Error: Errores de sintaxis en las anotaciones @Id, @GeneratedValue y @JoinColumn. Faltaban puntos y comas en las 
declaraciones de campo.

Solución: Se corrigieron los errores de sintaxis en las anotaciones. Se agregaron los puntos y comas faltantes y se 
implementaron getters y setters para el campo docente.

- **`Usuario.java`**:
  Línea(s) Afectada(s): 7, 10, 11, 13, 14, 15, 16, 17, 18, 19, 21, 22, 23, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 
36, 37, 38, 39, 40, 41, 42, 43

Error: Anotaciones @Entity, @GeneratedValue y @Column incompletas. Ausencia de getters y setters.

Solución: Se completaron y corrigieron las anotaciones. Se implementaron los métodos getters y setters para todos 
los atributos de la clase, mejorando la encapsulación.

### 2. Guía paso a paso para la conexión a la base de datos

Creación de la base de datos:

Se utilizó XAMPP para crear una base de datos MySQL llamada develop_db.

La creación se realizó a través de la interfaz de PHPMyAdmin.

Se otorgaron los permisos necesarios al usuario de la base de datos 
(GRANT ALL PRIVILEGES ON develop_db.* TO 'tu_usuario'@'localhost';).

Configuración del proyecto:

Se editó el archivo src/main/resources/application.properties.

Se incluyeron las propiedades de conexión a la base de datos (spring.datasource.url, username, password, driver).

Se activó la creación automática de tablas con spring.jpa.hibernate.ddl-auto=update. de datos se cree 
automáticamente al iniciar la aplicación (`spring.jpa.hibernate.ddl-auto=update`).

### 3.Recomendaciones para evitar errores similares en el futuro

Verificar la sintaxis de las anotaciones: Presta atención a la sintaxis exacta de las anotaciones de JPA, ya que un 
sólo carácter faltante puede causar errores.

Uso de auto-completado: Aprovecha la función de auto-completado de tu IDE (IntelliJ IDEA, en este caso) para escribir 
las anotaciones y evitar errores tipográficos.

Implementación de constructores, getters y setters: Asegúrate de que todas tus clases de modelo incluyan un constructor 
vacío y un constructor con todos los parámetros, además de los métodos getters y setters para garantizar la 
encapsulación de los datos y la correcta manipulación de las entidades por parte de JPA.

Documentar el código: Agrega comentarios en el código y un README.md detallado para explicar la lógica y la 
estructura del proyecto, lo que facilita el mantenimiento y la colaboración.

Nombrar correctamente las tablas y columnas: Utiliza @Table y @Column para un control explícito sobre la estructura 
de la base de datos, lo cual es una buena práctica de desarrollo.

### 4. Versionamiento y Pull Request
Se utilizó Git y GitHub para versionar los cambios y preparar un Pull Request para la revisión del profesor.

- **Comandos de Git utilizados:**
    - `git clone`: Para obtener el proyecto del repositorio remoto.
    - `git status`: Para verificar el estado de los archivos modificados.
    - `git add .`: Para preparar todos los cambios para el commit.
    - `git commit -m "feat: Se corrigen las clases del modelo y se configura la conexión a la base de datos."`: 
       Para guardar los cambios localmente.
    - `git push origin main`: Para subir los cambios al repositorio en mi cuenta de GitHub.
    - Se creará un Pull Request en GitHub para que el profesor pueda revisar y fusionar los cambios.