# ProyectoRelacionesDDBB
Relaciones en Bases de Datos

Nombre: Belén Paca

En el contexto de bases de datos, las relaciones definen cómo interactúan las tablas entre sí. Los tres tipos principales de relaciones son: One to One (uno a uno), One to Many (uno a muchos) y Many to Many (muchos a muchos).

Nombre del Porgrama FitFactory
* Entidad  Address
  Representa la dirección del socio del gimnasio (GymMember), Tiene relación bidireccional de uno a uno con la clase GymMember
* Entidad GymMember
  Representa los atributos del socio del gimnasio, tiene relación Uno a Uno con Address y relación Uno 
  a Muchos con GymClasses
* Entidad GymClassess
  Representa los atributos de las clases que va a tomar el socio del gimnasio, tiene relación Muchos a 
  Uno con Coach y relación de Muchos a Muchos con Coach.
* Entidad Coach
  Representa los atributos del entrenador del gimnasio, establece una relación uno a muchos entre la entidad Coach y la entidad GymClasses
  
  
 
