\c administracion_campo
-- Inserción de datos para la tabla TipoSuelo
INSERT INTO tipo_suelo (id, nombre, descripcion, numero)
VALUES
    (1, 'Tipo Suelo 1', 'Descripción Tipo Suelo 1', 1),
    (2, 'Tipo Suelo 2', 'Descripción Tipo Suelo 2', 2),
    (3, 'Tipo Suelo 3', 'Descripción Tipo Suelo 3', 3),
    (4, 'Tipo Suelo 4', 'Descripción Tipo Suelo 4', 4),
    (5, 'Tipo Suelo 5', 'Descripción Tipo Suelo 5', 5);

-- Inserción de datos para la tabla TipoLaboreo
INSERT INTO tipo_laboreo (id, nombre, descripcion)
VALUES
    (1, 'Tipo Laboreo 1', 'Descripción Tipo Laboreo 1'),
    (2, 'Tipo Laboreo 2', 'Descripción Tipo Laboreo 2'),
    (3, 'Tipo Laboreo 3', 'Descripción Tipo Laboreo 3'),
    (4, 'Tipo Laboreo 4', 'Descripción Tipo Laboreo 4'),
    (5, 'Tipo Laboreo 5', 'Descripción Tipo Laboreo 5');

-- Inserción de datos para la tabla MomentoLaboreo
INSERT INTO momento_laboreo (id, nombre, descripcion)
VALUES
    (1, 'Momento Laboreo 1', 'Descripción Momento Laboreo 1'),
    (2, 'Momento Laboreo 2', 'Descripción Momento Laboreo 2'),
    (3, 'Momento Laboreo 3', 'Descripción Momento Laboreo 3'),
    (4, 'Momento Laboreo 4', 'Descripción Momento Laboreo 4'),
    (5, 'Momento Laboreo 5', 'Descripción Momento Laboreo 5');


-- Inserción de datos para la tabla Campo
INSERT INTO campo (id, habilitado, nombre)
VALUES
    (1, true, 'Campo 1'),
    (2, true, 'Campo 2'),
    (3, true, 'Campo 3'),
    (4, true, 'Campo 4'),
    (5, true, 'Campo 5');



-- Inserción de datos para la tabla Cultivo
INSERT INTO cultivo (id, nombre, tipo_suelo_id)
VALUES
    (1, 'Cultivo 1', 1),
    (2, 'Cultivo 2', 2),
    (3, 'Cultivo 3', 3),
    (4, 'Cultivo 4', 1),
    (5, 'Cultivo 5', 2);

-- Inserción de datos para la tabla Empleado
INSERT INTO empleado (id, nombre, apellido)
VALUES
    (1, 'Empleado 1', 'Apellido 1'),
    (2, 'Empleado 2', 'Apellido 2'),
    (3, 'Empleado 3', 'Apellido 3'),
    (4, 'Empleado 4', 'Apellido 4'),
    (5, 'Empleado 5', 'Apellido 5');

-- Inserción de datos para la tabla Estado
INSERT INTO estado (id, nombre, descripcion)
VALUES
    (1, 'cancelado', 'Descripción Estado 1'),
    (2, 'Estado 2', 'Descripción Estado 2'),
    (3, 'Estado 3', 'Descripción Estado 3'),
    (4, 'Estado 4', 'Descripción Estado 4'),
    (5, 'Estado 5', 'Descripción Estado 5');

-- Inserción de datos para la tabla OrdenDeLaboreo
INSERT INTO orden_de_laboreo (id, momento_laboreo_id, orden, tipo_laboreo_id)
VALUES
    (1, 1, 'Orden 1', 1),
    (2, 2, 'Orden 2', 2),
    (3, 3, 'Orden 3', 3),
    (4, 4, 'Orden 4', 4),
    (5, 5, 'Orden 5', 5);

-- Inserción de datos para la tabla Laboreo
INSERT INTO laboreo (id, empleado_id, fecha_inicio, fecha_fin, hora_inicio, hora_fin, orden_laboreo_id)
VALUES
    (1, 1, '2024-01-01', '2024-01-05', '08:00:00', '17:00:00', 1),
    (2, 2, '2024-02-01', '2024-02-05', '08:00:00', '17:00:00', 2),
    (3, 3, '2024-03-01', '2024-03-05', '08:00:00', '17:00:00', 3),
    (4, 4, '2024-04-01', '2024-04-05', '08:00:00', '17:00:00', 4),
    (5, 5, '2024-05-01', '2024-05-05', '08:00:00', '17:00:00', 5);

-- Inserción de datos para la tabla Lote
INSERT INTO lote (id, numero, tamanio_has, tipo_suelo_id)
VALUES
    (1, 1, 100, 1),
    (2, 2, 200, 2),
    (3, 3, 300, 3),
    (4, 4, 400, 1),
    (5, 5, 500, 2);


-- Inserción de datos para la tabla ProyectoDeCultivo
INSERT INTO proyecto_de_cultivo (id, cultivo_id, estado_id, fecha_inicio, fecha_fin, observaciones)
VALUES
    (1, 1, 1, '2024-01-01', '2024-01-05', 'Observaciones Proyecto 1'),
    (2, 2, 2, '2024-02-01', '2024-02-05', 'Observaciones Proyecto 2'),
    (3, 3, 3, '2024-03-01', '2024-03-05', 'Observaciones Proyecto 3'),
    (4, 4, 4, '2024-04-01', '2024-04-05', 'Observaciones Proyecto 4'),
    (5, 5, 5, '2024-05-01', '2024-05-05', 'Observaciones Proyecto 5');




-- Inserción de datos para la tabla Campo_Lotes
INSERT INTO campo_lotes (campo_id, lotes_id)
VALUES
    (1, 1),
    (2, 2),
    (3, 3),
    (4, 4),
    (5, 5);

INSERT INTO cultivo_orden_laboreo (cultivo_id,orden_laboreo_id)
VALUES
    (1, 1),
    (2, 2),
    (3, 3),
    (4, 4),
    (5, 5);


-- Inserción de datos para la tabla Lote_ProyectoDeCultivo
INSERT INTO lote_proyectos_cultivo (lote_id, proyectos_cultivo_id)
VALUES
    (1, 1),
    (2, 2),
    (3, 3),
    (4, 4),
    (5, 5);

-- Inserción de datos para la tabla ProyectoDeCultivo_Laboreo
INSERT INTO proyecto_de_cultivo_laboreo (proyecto_de_cultivo_id, laboreo_id)
VALUES
    (1, 1),
    (2, 2),
    (3, 3),
    (4, 4),
    (5, 5);
