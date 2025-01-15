create sequence product_id_seq start with 1 increment by 50;

create table products
(
    id          bigint default nextval('product_id_seq') primary key,
    code        text not null unique,
    name        text not null unique,
    description text,
    image_url   text,
    price       numeric not null,
    created_at  timestamp default now()
);