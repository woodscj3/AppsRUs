DROP SCHEMA CSE201;
CREATE SCHEMA CSE201;
USE CSE201;

CREATE TABLE UserInfo (
	username varchar(50) PRIMARY KEY,
    userPassword varchar(50) NOT NULL,
    userType varchar(30) NOT NULL
);

CREATE TABLE AppInfo (
	appName varchar(50) PRIMARY KEY,
    appDescription varchar(500) NOT NULL,
    appOrganization varchar(500) NOT NULL,
    appPlatform varchar(500) NOT NULL,
    appVersion varchar(30) NOT NULL,
    appLink varchar(500) NOT NULL,
    appPrice double NOT NULL
);

CREATE TABLE AppRequest (
	appName varchar(50) PRIMARY KEY,
    appDescription varchar(500) NOT NULL,
    appOrganization varchar(500) NOT NULL,
    appPlatform varchar(500) NOT NULL,
    appVersion varchar(30) NOT NULL,
    appLink varchar(500) NOT NULL,
    appPrice double NOT NULL
);

CREATE TABLE AppComment (
	appName varchar(50),
    appComment varchar(500),
    constraint AppComment_appName_fk FOREIGN KEY (appName) REFERENCES AppInfo(appName)
);