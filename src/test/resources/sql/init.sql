create table if not exists projects
(
    id         varchar   not null primary key,
    name       varchar unique,
    created_at timestamp not null default now()
);

delete from projects;
insert into projects (id, name, created_at) values ('349a49c5-b52c-4cd4-ba7d-42ef5e2d64e7', 'project1', now());