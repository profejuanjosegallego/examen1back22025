📝 Descripción del proyecto

Aplicación desarrollada en Spring Boot para la gestión de cursos, docentes y usuarios, utilizando JPA para la persistencia de datos y MySQL como base de datos.

🔧 Cambios realizados y errores corregidos

Curso.java

✅ Líneas 9-10: Corregidas anotaciones @Id y @GeneratedValue.

✅ Línea 12: Agregado punto y coma faltante en el atributo nombre.

✅ Línea 16: Corregida anotación @JoinColumn y eliminado punto y coma incorrecto.

➕ Agregados getters, setters y constructor completo.

Docente.java

✅ Línea 6: Corregida anotación @Entity.

✅ Línea 9: Agregada anotación @Id.

➕ Agregados getters, setters y constructor completo.

Usuario.java

✅ Línea 5: Corregida anotación @Entity.

✅ Línea 10: Corregida anotación @GeneratedValue.

✅ Líneas 11 y 17: Corregida anotación @Column.

🆕 Se define la enumeración TipoUsuario.

➕ Agregados getters, setters y constructor completo.

application.properties

🆕 Añadida configuración para la conexión a MySQL.

⚙️ Guía de conexión a la base de datos

- Ejecutar XAMPP con los servicios Apache y MySQL activos.
- Crear la base de datos "develop_db" en MySQL.
- Configurar el archivo application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/develop_db
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

- Ejecutar la aplicación, asegurando que no haya errores en los archivos.
- Confirmar que la conexión fue exitosa y que las tablas fueron creadas en MySQL.

💡 Recomendaciones:

🔍 Revisar siempre la sintaxis de las anotaciones JPA.

💻 Utilizar IDEs con soporte para Java y Spring Boot para detectar errores rápidamente.

🛠 Mantener actualizados los constructores, getters y setters.

✅ Verificar la configuración de la base de datos antes de ejecutar la aplicación.
