CREATE TABLE public.importancia(
	c_importancia SERIAL PRIMARY KEY,
	s_importancia varchar(30)
);

CREATE TABLE public.contribuyente(
	c_contribuyente SERIAL PRIMARY KEY,
	c_importancia int,
	s_nombre varchar(30),
	s_apellido varchar(30),
	s_nit varchar(14),
	f_fecha_ingreso date
);

ALTER TABLE public.contribuyente ADD CONSTRAINT
fk_contribuyente_importancia FOREIGN KEY (c_importancia)
REFERENCES public.importancia (c_importancia);

INSERT INTO public.importancia(s_importancia) VALUES('Grande');

INSERT INTO public.importancia(s_importancia) VALUES('Mediano');

INSERT INTO public.importancia(s_importancia) VALUES('Otros');

SELECT * FROM public.contribuyente;