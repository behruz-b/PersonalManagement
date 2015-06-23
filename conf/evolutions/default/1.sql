# --- Created by Slick DDL
# To stop Slick DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table "Hodimlar" ("ID" SERIAL NOT NULL PRIMARY KEY,"FIRST_NAME" VARCHAR(254) DEFAULT '' NOT NULL,"LAST_NAME" VARCHAR(254) DEFAULT '' NOT NULL,"SECOND_NAME" VARCHAR(254) DEFAULT '' NOT NULL,"DEPARTMENT" VARCHAR(254) DEFAULT '' NOT NULL,"COMMISSION" VARCHAR(254) DEFAULT '' NOT NULL,"BIRTHDAY" VARCHAR(254) DEFAULT '' NOT NULL);
create table "Talabalar" ("ID" SERIAL NOT NULL PRIMARY KEY,"name" VARCHAR(254) DEFAULT '' NOT NULL,"surname" VARCHAR(254) DEFAULT '' NOT NULL,"second_name" VARCHAR(254) DEFAULT '' NOT NULL,"tugulgan_sana" VARCHAR(254) DEFAULT '' NOT NULL,"guruhi" VARCHAR(254) DEFAULT '' NOT NULL,"email" VARCHAR(254) DEFAULT '' NOT NULL,"tel" VARCHAR(254) DEFAULT '' NOT NULL);

# --- !Downs

drop table "Talabalar";
drop table "Hodimlar";

