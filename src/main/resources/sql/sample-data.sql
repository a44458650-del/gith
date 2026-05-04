INSERT INTO champion(name,cost,traits) VALUES
('Yasuo',3,'Duelist,Exile'),
('Annie',2,'Mage,Fortune'),
('Lee Sin',4,'Duelist,Divine');

INSERT INTO trait(name,description) VALUES
('Duelist','공격 속도 증가 시너지'),
('Mage','추가 주문 시전 시너지'),
('Fortune','연패/연승 보상 시너지');

INSERT INTO deck(name,tier,pick_rate,win_rate,hidden_potential,summary) VALUES
('Duelist Flex','S',16.20,55.40,false,'안정적인 상위권 덱'),
('Fortune Snowball','A',8.30,53.90,true,'저사용률 고점 덱'),
('Mage Reroll','B',6.10,50.20,true,'초중반 운영 특화');
