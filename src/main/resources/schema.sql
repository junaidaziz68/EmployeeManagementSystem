drop database userapp;
create table department (id bigint not null, department varchar(255), primary key (id));
create table users (id bigint not null, email varchar(255), first_name varchar(255), last_name varchar(255), department_id bigint, primary key (id));
 alter table users add constraint FKfi832e3qv89fq376fuh8920y4 foreign key (department_id) references department;