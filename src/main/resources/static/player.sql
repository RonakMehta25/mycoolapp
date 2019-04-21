use hb_student_tracker;
create table Player(
 player_id int(11) not null auto_increment,
 name varchar(50) default null,
 team_id int(11) default null,
 primary key(player_id),
 KEY fk_team_id_1 (team_id),
CONSTRAINT fk_team_id_1 FOREIGN KEY (team_id) REFERENCES team (team_id)
)