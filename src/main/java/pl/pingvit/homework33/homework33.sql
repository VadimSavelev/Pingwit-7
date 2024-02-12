CREATE TABLE public.users
(
    id bigint NOT NULL,
    name character varying(300)  NOT NULL,
    surname character varying(300)  NOT NULL,
    email character varying(320)  NOT NULL,
    phone character varying(15) NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT phone_unique UNIQUE (phone),
    CONSTRAINT user_email_unique UNIQUE (email)
    )

CREATE TABLE public.products
(
    id bigint,
    name character varying(300) NOT NULL,
    description character varying(300) NOT NULL,
    price numeric(10, 2) NOT NULL,
    PRIMARY KEY (id)
)

CREATE TABLE public.order_statuses
(
    id bigint,
    name character varying NOT NULL,
    PRIMARY KEY (id)
)

CREATE TABLE public.orders
(
    id bigint,
    registration_date timestamp without time zone NOT NULL,
    quantity_of_goods integer NOT NULL,
    comments text,
    users_id bigint NOT NULL,
    order_statuses_id bigint NOT NULL,
    products_id bigint NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_orders_order_statuses_id FOREIGN KEY (order_statuses_id)
        REFERENCES public.order_statuses (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT fk_orders_user_id FOREIGN KEY (users_id)
        REFERENCES public.users (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT fk_orders_product_id FOREIGN KEY (products_id)
        REFERENCES public.products (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
);