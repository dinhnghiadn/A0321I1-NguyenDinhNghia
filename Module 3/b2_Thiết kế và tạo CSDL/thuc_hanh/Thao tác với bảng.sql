use test2;
CREATE TABLE contacts
( contact_id INT(11) NOT NULL AUTO_INCREMENT,
  last_name VARCHAR(30) NOT NULL,
  first_name VARCHAR(25),
  birthday DATE,
  CONSTRAINT contacts_pk PRIMARY KEY (contact_id)
);
DROP TABLE contacts;
ALTER TABLE contacts
  ADD phone INT(10) NOT NULL
    AFTER contact_id,
  ADD address varchar(35) NULL
    AFTER last_name;
ALTER TABLE contacts
  MODIFY last_name varchar(50) NULL;
ALTER TABLE contacts
  DROP COLUMN phone;
ALTER TABLE contacts
  CHANGE COLUMN last_name last_namee
    varchar(20) NOT NULL;
ALTER TABLE contacts
  RENAME TO people;
