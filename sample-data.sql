INSERT INTO champion(name, cost, traits) VALUES
('애쉬', 4, '사수,프렐요드'),
('세주아니', 4, '난동꾼,프렐요드'),
('카이사', 4, '도전자,공허');

INSERT INTO trait(name, effect_description) VALUES
('프렐요드', '적 팀 디버프를 부여합니다.'),
('사수', '공격 시 추가 효과를 발동합니다.'),
('난동꾼', '최대 체력이 증가합니다.');

INSERT INTO deck(name, tier, description, champion_ids, hidden_recommend) VALUES
('프렐요드 사수', 'S', '밸런스형 고성능 덱', '1,2', 1),
('공허 도전자', 'A', '초중반 운영이 쉬운 덱', '3', 0);
