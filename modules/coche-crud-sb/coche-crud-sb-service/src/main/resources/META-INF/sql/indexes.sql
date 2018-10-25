create index IX_70E670EE on Coches_Coche (uuid_[$COLUMN_LENGTH:75$], companyId);

create index IX_CFBA98D2 on Coches_Conductor (cocheId);
create unique index IX_8D0BF982 on Coches_Conductor (dni[$COLUMN_LENGTH:75$]);
create index IX_3A0F22E1 on Coches_Conductor (uuid_[$COLUMN_LENGTH:75$], companyId);