create index IX_F386048B on Libro_Escritor (nombre[$COLUMN_LENGTH:75$]);
create index IX_D7CC802 on Libro_Escritor (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_683B6704 on Libro_Escritor (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_923728B8 on Libro_Libro (titulo[$COLUMN_LENGTH:75$]);
create index IX_84A2C3FF on Libro_Libro (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_C3BA3E41 on Libro_Libro (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_9C207B58 on Libro_Libros_Escritores (companyId);
create index IX_562425AA on Libro_Libros_Escritores (escritorId);
create index IX_CF4DEB5D on Libro_Libros_Escritores (libroId);