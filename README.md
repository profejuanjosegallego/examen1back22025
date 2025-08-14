📝 Descripción del proyecto

Este proyecto es un backend en Java con Spring Boot que gestiona entidades relacionadas con un sistema educativo: Curso, Docente y Usuario.
El sistema utiliza JPA/Hibernate para mapear las entidades a la base de datos y Jackson para la serialización/deserialización JSON en las relaciones entre ellas.


✅ Errores corregidos y explicación
1. Curso.java
   Archivo	Línea	Error	Solución
   Curso.java	@I	Anotación incompleta, debería ser @Id.	Cambiar a @Id.
   Curso.java	@Ge(strategy = IDENTITY)	Anotación incompleta @GeneratedValue.	Corregir a @GeneratedValue(strategy = GenerationType.IDENTITY).
   Curso.java	private String nombre	Falta punto y coma ;.	Agregar ;.
   Curso.java	Docente docente	Falta el modificador de acceso y punto y coma.	Cambiar a private Docente docente;.
   Curso.java	@JoinColumn(...)	Tiene punto y coma al final (inválido).	Eliminar ;.


2. Docente.java
   Archivo	Línea	Error	Solución
   Docente.java	@Entit	Anotación incompleta, debería ser @Entity.	Corregir a @Entity.
   Docente.java	@GeneratedValue(...)	Falta la anotación @Id antes.	Agregar @Id antes de @GeneratedValue(...).


3. Usuario.java
   Archivo	Línea	Error	Solución
   Usuario.java	@Entit	Anotación incompleta.	Corregir a @Entity.
   Usuario.java	@GeneratedValue(strategy = GenerationType.)	Estrategia incompleta.	Cambiar a @GeneratedValue(strategy = GenerationType.IDENTITY).
   Usuario.java	@Colun	Error tipográfico, debería ser @Column.	Cambiar todas las apariciones a @Column.


⚙️ Guía paso a paso para conexión a la base de datos

Configurar application.properties en src/main/resources:

spring.datasource.url=jdbc:mysql://localhost:3306/develop_db
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update

Asegurarse de tener MySQL levantado
Verifica que tu servidor de MySQL esté corriendo y que exista la base develop_db.

Ejecutar el proyecto
Desde IntelliJ, presiona Shift + F10 o usa:

mvn spring-boot:run


💡 Recomendaciones para evitar errores similares

Usar autocompletado de IntelliJ para evitar errores tipográficos en anotaciones.

Compilar el proyecto antes de hacer commit para detectar errores sintácticos.

Configurar inspecciones en IntelliJ para resaltar problemas en tiempo real.

Formatear el código con Ctrl + Alt + L antes de guardar.

Mantener una guía de estilo de código para el equipo.