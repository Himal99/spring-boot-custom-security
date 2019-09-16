create table student_detail(id serial primary key,
 student_name varchar(100), student_roll varchar(10), 
student_address varchar(100), student_phone varchar(100),
student_grade varchar(10), parents_name varchar(155),
gender varchar(10),
 created_date timestamp default current_timestamp, modified_date timestamp null,
status boolean default true);

create table tachers(id serial primary key,
 student_name varchar(100), teacher_roll varchar(10), 
teacher_address varchar(100), teacher_phone varchar(100),
 created_date timestamp default current_timestamp, modified_date timestamp null,
status boolean default true);

create table role_detail(id serial primary key, subject varchar(50),roles varchar(255),created_date timestamp 
default current_timestamp);

create table tbl_users(id int primary key auto_increment, username varchar(100) unique, email
varchar(100) unique, password varchar(100), created_date timestamp default
current_timestamp, status boolean default true);

create table tbl_user_profile(id int primary key auto_increment,user_id int, first_name varchar(100),last_name
varchar(100),date_of_birth date null);

alter table tbl_user_profile add foreign key(user_id) references tbl_users(id);




