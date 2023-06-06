CREATE DATABASE hillel
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Russian_Ukraine.1251'
    LC_CTYPE = 'Russian_Ukraine.1251'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
	
	*************************************************
	
	CREATE TABLE IF NOT EXISTS public.homework
(
    homework_id integer NOT NULL DEFAULT nextval('homework_homework_id_seq'::regclass),
    hw_name character varying(20) COLLATE pg_catalog."default" NOT NULL,
    description text COLLATE pg_catalog."default",
    CONSTRAINT pk_homework PRIMARY KEY (homework_id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.homework
    OWNER to postgres;
	
	***************************************************
	
	CREATE TABLE IF NOT EXISTS public.lesson
(
    lesson_id integer NOT NULL DEFAULT nextval('lesson_lesson_id_seq'::regclass),
    lesson_name character varying(20) COLLATE pg_catalog."default" NOT NULL,
    update_at timestamp without time zone,
    fk_homework_id integer,
    CONSTRAINT pk_lesson_id PRIMARY KEY (lesson_id),
    CONSTRAINT lesson_fk_homework_id_fkey FOREIGN KEY (fk_homework_id)
        REFERENCES public.homework (homework_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.lesson
    OWNER to postgres;
	
	***************************************************
	
	CREATE TABLE IF NOT EXISTS public.schedule
(
    id integer NOT NULL DEFAULT nextval('schedule_id_seq'::regclass),
    name text COLLATE pg_catalog."default" NOT NULL,
    update_at timestamp without time zone,
    CONSTRAINT schedule_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.schedule
    OWNER to postgres;
	
	**************************************************
	
	CREATE TABLE IF NOT EXISTS public.lessons
(
    schedule_id integer NOT NULL,
    lesson_id integer NOT NULL,
    CONSTRAINT lessons_pkey PRIMARY KEY (schedule_id, lesson_id),
    CONSTRAINT lessons_lesson_id_fkey FOREIGN KEY (lesson_id)
        REFERENCES public.lesson (lesson_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.lessons
    OWNER to postgres;
	
	