-- INSERER : GENRES --
ALTER TABLE genre AUTO_INCREMENT = 1;
insert into genre (id, label) values (1, 'Drama');
insert into genre (id, label) values (2, 'Drama');
insert into genre (id, label) values (3, 'Drama|Romance');
insert into genre (id, label) values (4, 'Drama');
insert into genre (id, label) values (5, 'Documentary');
insert into genre (id, label) values (6, 'Crime|Film-Noir|Mystery|Romance');
insert into genre (id, label) values (7, 'Crime|Documentary|War');
insert into genre (id, label) values (8, 'Comedy|Drama|Romance');
insert into genre (id, label) values (9, 'Comedy|Drama');
insert into genre (id, label) values (10, 'Drama');

-- INSERER : PARTICIPANTS --
ALTER TABLE participant AUTO_INCREMENT = 1;
insert into participant (id, last_name, first_name) values (1, 'Ravelus', 'Esbjörn');
insert into participant (id, last_name, first_name) values (2, 'Spinas', 'Alizée');
insert into participant (id, last_name, first_name) values (3, 'Geldard', 'Médiamass');
insert into participant (id, last_name, first_name) values (4, 'Frame', 'Edmée');
insert into participant (id, last_name, first_name) values (5, 'Van Schafflaer', 'Kallisté');
insert into participant (id, last_name, first_name) values (6, 'Yerby', 'Lèi');
insert into participant (id, last_name, first_name) values (7, 'Kondratowicz', 'Réjane');
insert into participant (id, last_name, first_name) values (8, 'Wearing', 'Thérèsa');
insert into participant (id, last_name, first_name) values (9, 'Enrietto', 'Anaé');
insert into participant (id, last_name, first_name) values (10, 'Capeling', 'Lorène');

-- INSERER : MEMBRES --
ALTER TABLE member AUTO_INCREMENT = 1;
insert into member (id, last_name, first_name, login, password, is_admin) values (1, 'Graben', 'Dafnée', 'Hammad', '2dq5t6G0RH6', 0);
insert into member (id, last_name, first_name, login, password, is_admin) values (2, 'Zouch', 'Michèle', 'Reider', 'MgdVWpErGb1', 1);
insert into member (id, last_name, first_name, login, password, is_admin) values (3, 'Thomlinson', 'Mahélie', 'Eldridge', 'rqVMkWAnWfZo', 0);
insert into member (id, last_name, first_name, login, password, is_admin) values (4, 'Hovell', 'Aurélie', 'Valeria', 'OKzfMSyjSop', 0);
insert into member (id, last_name, first_name, login, password, is_admin) values (5, 'Fido', 'Laurélie', 'Tiffany', 'xB63UOoR', 0);

-- INSERER : MOVIES --
ALTER TABLE movie AUTO_INCREMENT = 1;
insert into movie (id, title, year, duration, synopsis, genre_id, director_id) values (1, 'Lucky You', 1895, 45, 'Destruction of Left Upper Femur, Percutaneous Approach', 1, 5);
insert into movie (id, title, year, duration, synopsis, genre_id, director_id) values (2, 'Prime Suspect', 1928, 136, 'Supplement Rectum with Autologous Tissue Substitute, Via Natural or Artificial Opening', 4, 2);
insert into movie (id, title, year, duration, synopsis, genre_id, director_id) values (3, 'When Willie Comes Marching Home', 2016, 245, 'Replacement of Left Ankle Joint with Nonautologous Tissue Substitute, Open Approach', 6, 7);
insert into movie (id, title, year, duration, synopsis, genre_id, director_id) values (4, 'Critters 2: The Main Course', 2008, 239, 'Supplement Coccyx with Nonautologous Tissue Substitute, Open Approach', 8, 4);
insert into movie (id, title, year, duration, synopsis, genre_id, director_id) values (5, 'The King and Four Queens', 2016, 179, 'Drainage of Left Testis, Percutaneous Approach, Diagnostic', 1, 4);
insert into movie (id, title, year, duration, synopsis, genre_id, director_id) values (6, 'King, The', 1869, 81, 'Measurement of Respiratory Total Activity, Via Natural or Artificial Opening', 3, 6);
insert into movie (id, title, year, duration, synopsis, genre_id, director_id) values (7, 'Restless Blood (Levoton veri)', 1970, 195, 'Excision of Left Ankle Tendon, Percutaneous Approach', 6, 4);

-- INSERER : OPINIONS --
ALTER TABLE opinion AUTO_INCREMENT = 1;
insert into opinion (id, note, comment, member_id, movie_id) values (1, 0, 'Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Etiam vel augue.', 5, 1);
insert into opinion (id, note, comment, member_id, movie_id) values (2, 5, 'Praesent blandit. Nam nulla. Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede. Morbi porttitor lorem id ligula. Suspendisse ornare consequat lectus.', 5, 1);
insert into opinion (id, note, comment, member_id, movie_id) values (3, 1, 'Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet. Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo. Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui.', 3, 1);
insert into opinion (id, note, comment, member_id, movie_id) values (4, 3, 'Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui.', 2, 1);
insert into opinion (id, note, comment, member_id, movie_id) values (5, 0, 'In hac habitasse platea dictumst. Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo. Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros.', 4, 1);

-- INSERER : ACTORS --
insert into movie_actors (actors_id, actor_movies_id) values (5, 1);
insert into movie_actors (actors_id, actor_movies_id) values (1, 2);
insert into movie_actors (actors_id, actor_movies_id) values (9, 3);
insert into movie_actors (actors_id, actor_movies_id) values (9, 4);
insert into movie_actors (actors_id, actor_movies_id) values (8, 5);
insert into movie_actors (actors_id, actor_movies_id) values (5, 6);
insert into movie_actors (actors_id, actor_movies_id) values (9, 7);

insert into movie_actors (actors_id, actor_movies_id) values (4, 1);
insert into movie_actors (actors_id, actor_movies_id) values (3, 2);
insert into movie_actors (actors_id, actor_movies_id) values (8, 3);
insert into movie_actors (actors_id, actor_movies_id) values (2, 4);
insert into movie_actors (actors_id, actor_movies_id) values (7, 5);
insert into movie_actors (actors_id, actor_movies_id) values (2, 6);
insert into movie_actors (actors_id, actor_movies_id) values (6, 7);