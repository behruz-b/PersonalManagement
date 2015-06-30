# --- Created by Slick DDL
# To stop Slick DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table "Students" ("ID" SERIAL NOT NULL PRIMARY KEY,"ismi" VARCHAR(254) DEFAULT '' NOT NULL,"familiyasi" VARCHAR(254) DEFAULT '' NOT NULL,"otasining_ismi" VARCHAR(254) DEFAULT '' NOT NULL,"tugulgan_sana" VARCHAR(254) DEFAULT '' NOT NULL,"guruhi" VARCHAR(254) DEFAULT '' NOT NULL,"email" VARCHAR(254) DEFAULT '' NOT NULL,"tel" VARCHAR(254) DEFAULT '' NOT NULL);
create table "Teachers" ("ID" SERIAL NOT NULL PRIMARY KEY,"name" VARCHAR(254) DEFAULT '' NOT NULL,"surname" VARCHAR(254) DEFAULT '' NOT NULL,"secondName" VARCHAR(254) DEFAULT '' NOT NULL,"dataOfBirth" VARCHAR(254) DEFAULT '' NOT NULL,"passportSeries" VARCHAR(254) DEFAULT '' NOT NULL,"role" VARCHAR(254) DEFAULT '' NOT NULL,"department" VARCHAR(254) DEFAULT '' NOT NULL,"livingPlace" VARCHAR(254) DEFAULT '' NOT NULL);
create table "Workers" ("ID" SERIAL NOT NULL PRIMARY KEY,"firstName" VARCHAR(254) DEFAULT '' NOT NULL,"lastName" VARCHAR(254) DEFAULT '' NOT NULL,"secondName" VARCHAR(254) DEFAULT '' NOT NULL,"department" VARCHAR(254) DEFAULT '' NOT NULL,"commission" VARCHAR(254) DEFAULT '' NOT NULL,"birthday" VARCHAR(254) DEFAULT '' NOT NULL,"education" VARCHAR(254) DEFAULT '' NOT NULL,"nationality" VARCHAR(254) DEFAULT '' NOT NULL,"sex" VARCHAR(254) DEFAULT '' NOT NULL,"maritalStatus" VARCHAR(254) DEFAULT '' NOT NULL,"country" VARCHAR(254) DEFAULT '' NOT NULL,"region" VARCHAR(254) DEFAULT '' NOT NULL,"district" VARCHAR(254) DEFAULT '' NOT NULL,"address" VARCHAR(254) DEFAULT '' NOT NULL,"telNumber" VARCHAR(254) DEFAULT '' NOT NULL,"fax" VARCHAR(254) DEFAULT '' NOT NULL,"mailAddress" VARCHAR(254) DEFAULT '' NOT NULL,"passportSeries" VARCHAR(254) DEFAULT '' NOT NULL,"passportNumber" VARCHAR(254) DEFAULT '' NOT NULL,"countryOfBirth" VARCHAR(254) DEFAULT '' NOT NULL,"whoIsGiven" VARCHAR(254) DEFAULT '' NOT NULL);

# --- !Downs

drop table "Students";
drop table "Teachers";
drop table "Workers";

