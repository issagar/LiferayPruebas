create table Coches_Coche (
	uuid_ VARCHAR(75) null,
	CocheId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	marca VARCHAR(75) null,
	modelo VARCHAR(75) null,
	precio DOUBLE
);

create table Coches_Conductor (
	uuid_ VARCHAR(75) null,
	conductorId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nombre VARCHAR(75) null,
	apellido VARCHAR(75) null,
	dni VARCHAR(75) null,
	cocheId LONG
);