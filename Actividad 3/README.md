# CRUD-Java-MySQL

Aplicación Java en modo gráfico, para crear un mantenimiento sencillo hacia una tabla de una base de datos.

#

1.  Agregar un registro.
2.  Modificar un registro.
3.  Eliminar un registro.
4.  Mostrar el contenido de la tabla.

Tema: Reposteria
-     Tabla: Categorías
#

El gestor de base de datos es MySQL, en entorno XAMPP.
``` sql 
create database reposteria

CREATE TABLE `categorias` (
  `id_cate` int(11) NOT NULL,
  `nombre_cate` varchar(20) NOT NULL,
  `precio` varchar(30) NOT NULL,
  `stock` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

```

#
Conexión 
```xml
<?xml version="1.0" encoding="UTF-8"?>
<persistence version="1.0" xmlns="http://java.sun.com/xml/ns/persistence" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://java.sun.com/xml/ns/persistence http://java.sun.com/xml/ns/persistence/persistence_1_0.xsd">
  <persistence-unit name="reposteria?zeroDateTimeBehavior=convertToNullPU" transaction-type="RESOURCE_LOCAL">
    <provider>org.eclipse.persistence.jpa.PersistenceProvider</provider>
    <class>reposteriaapp.Categorias_1</class>
    <properties>
      <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/reposteria?zeroDateTimeBehavior=convertToNull"/>
      <property name="javax.persistence.jdbc.user" value="root"/>
      <property name="javax.persistence.jdbc.driver" value="com.mysql.jdbc.Driver"/>
      <property name="javax.persistence.jdbc.password" value=""/>
    </properties>
  </persistence-unit>
</persistence>

```
