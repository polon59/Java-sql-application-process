﻿CREATE TABLE mentors
(id SERIAL PRIMARY KEY,
first_name TEXT,
last_name TEXT,
nick_name TEXT,
phone_number TEXT,
email TEXT,
city TEXT,
favourite_number INTEGER);


INSERT INTO mentors
(first_name, last_name, nick_name, phone_number, email, city, favourite_number)
VALUES ('Pál',
	'Monoczki',
	'Pali',
	'003630/327-2663',
	'pal.monoczki@codecool.com',
	'Miskolc',
	NULL);


INSERT INTO mentors
(first_name, last_name, nick_name, phone_number, email, city, favourite_number)
VALUES ('Sándor',
	'Szodoray',
	'Szodi',
	'003620/519-9152',
	'sandor.szodoray@codecool.com',
	'Miskolc',
	7);


INSERT INTO mentors
(first_name, last_name, nick_name, phone_number, email, city, favourite_number)
VALUES ('Dániel',
	'Salamon',
	'Dani',
	'003620/508-0706',
	'daniel.salamon@codecool.com',
	'Budapest',
	4);


INSERT INTO mentors
(first_name, last_name, nick_name, phone_number, email, city, favourite_number)
VALUES ('Miklós',
	'Beöthy',
	'Miki',
	'003630/256-8118',
	'miklos.beothy@codecool.com',
	'Budapest',
	42);


INSERT INTO mentors
(first_name, last_name, nick_name, phone_number, email, city, favourite_number)
VALUES ('Tamás',
	'Tompa',
	'Tomi',
	'003630/370-0748',
	'tamas.tompa@codecool.com',
	'Budapest',
	42);


INSERT INTO mentors
(first_name, last_name, nick_name, phone_number, email, city, favourite_number)
VALUES ('Mateusz',
	'Ostafil',
	'Mateusz',
	'003648/518-664-923',
	'mateusz.ostafil@codecool.com',
	'Krakow',
	13);


INSERT INTO mentors
(first_name, last_name, nick_name, phone_number, email, city, favourite_number)
VALUES ('Anikó',
	'Fenyvesi',
	'Anikó',
	'003670/111-2222',
	'aniko.fenyvesi@codecool.com',
	'Budapest',
	11);



INSERT INTO mentors
(first_name, last_name, nick_name, phone_number, email, city, favourite_number)
VALUES ('Immánuel',
	'Fodor',
	'Immi',
	'003620/123-6234',
	'immanuel.fodor@codecool.com',
	'Budapest',
	3);


INSERT INTO mentors
(first_name, last_name, nick_name, phone_number, email, city, favourite_number)
VALUES ('László',
	'Molnár',
	'Laci',
	'003620/222-5566',
	'laszlo.molnar@codecool.com',
	'Budapest',
	5);


INSERT INTO mentors
(first_name, last_name, nick_name, phone_number, email, city, favourite_number)
VALUES ('Mátyás',
	'Forián Szabó',
	'Matyi',
	'003630/111-5532',
	'matyas.forian.szabo@codecool.com',
	'Budapest',
	90);


INSERT INTO mentors
(first_name, last_name, nick_name, phone_number, email, city, favourite_number)
VALUES ('Zoltán',
	'Sallay',
	'Zozi',
	'003670/898-3122',
	'zoltan.sallay@codecool.com',
	'Budapest',
	5);


INSERT INTO mentors
(first_name, last_name, nick_name, phone_number, email, city, favourite_number)
VALUES ('Szilveszter',
	'Erdős',
	'Sly',
	'003620/444-5555',
	'szilveszter.erdos@codecool.com',
	'Budapest',
	13);


INSERT INTO mentors
(first_name, last_name, nick_name, phone_number, email, city, favourite_number)
VALUES ('László',
	'Terray',
	'Laci',
	'003670/402-2435',
	'laszlo.terray@codecool.com',
	'Budapest',
	8);


INSERT INTO mentors
(first_name, last_name, nick_name, phone_number, email, city, favourite_number)
VALUES ('Árpád',
	'Törzsök',
	'Árpád',
	'003630/222-1221',
	'arpad.torzsok@codecool.com',
	'Budapest',
	9);



INSERT INTO mentors
(first_name, last_name, nick_name, phone_number, email, city, favourite_number)
VALUES ('Imre',
	'Lindi',
	'Imi',
	'003670/222-1233',
	'imre.lindi@codecool.com',
	'Miskolc',
	3);


INSERT INTO mentors
(first_name, last_name, nick_name, phone_number, email, city, favourite_number)
VALUES ('Róbert',
	'Kohányi',
	'Robi',
	'003630/123-5553',
	'robert.kohanyi@codecool.com',
	'Miskolc',
	NULL);


INSERT INTO mentors
(first_name, last_name, nick_name, phone_number, email, city, favourite_number)
VALUES ('Przemysław',
	'Ciąćka',
	'Przemek',
	'003670/222-4554',
	'przemyslaw.ciacka@codecool.com',
	'Krakow',
	55);


INSERT INTO mentors
(first_name, last_name, nick_name, phone_number, email, city, favourite_number)
VALUES ('Marcin',
	'Izworski',
	'Marcin',
	'003670/999-2323',
	'marcin.izworski@codecool.com',
	'Krakow',
	55);


INSERT INTO mentors
(first_name, last_name, nick_name, phone_number, email, city, favourite_number)
VALUES ('Rafał',
	'Stępień',
	'Rafal',
	'003630/323-5343',
	'rafal.stepien@codecool.com',
	'Krakow',
	3);


INSERT INTO mentors
(first_name, last_name, nick_name, phone_number, email, city, favourite_number)
VALUES ('Agnieszka',
	'Koszany',
	'Agi',
	'003630/111-5343',
	'agnieszka.koszany@codecool.com',
	'Krakow',
	77);


INSERT INTO mentors
(first_name, last_name, nick_name, phone_number, email, city, favourite_number)
VALUES ('Mateusz',
	'Steliga',
	'Mateusz',
	'003630/123-5343',
	'mateusz.steliga@codecool.com',
	'Krakow',
	5);


INSERT INTO mentors
(first_name, last_name, nick_name, phone_number, email, city, favourite_number)
VALUES ('Attila',
	'Molnár',
	'Atesz',
	'003670/630-0539',
	'attila.molnar@codecool.com',
	'Budapest',
	23);


DELETE FROM mentors 
WHERE id = 4;




























