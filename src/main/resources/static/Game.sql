create table Game(
  game_id int(11) NOT NULL auto_increment,
  primary key(game_id),
  KEY fk_team_id (team_id),
  team_id int(11) not null,
  result_id int(11) not null,
CONSTRAINT fk_team_id FOREIGN KEY (team_id) REFERENCES team (team_id) ON DELETE NO ACTION ON UPDATE NO ACTION,
KEY fk_result_id (result_id),
CONSTRAINT fk_result_id FOREIGN KEY (result_id) REFERENCES Result (result_id) ON DELETE NO ACTION ON UPDATE NO ACTION
);