INSERT INTO FORMAT(NAME) VALUES ('Standard')
INSERT INTO FORMAT(NAME) VALUES ('Modern')
INSERT INTO FORMAT(NAME) VALUES ('Legacy')
INSERT INTO FORMAT(NAME) VALUES ('Vintage')
INSERT INTO FORMAT(NAME) VALUES ('Commander')


INSERT INTO CARD(NAME,PRICE) VALUES ('Standard',1.0)
INSERT INTO CARD(NAME,PRICE) VALUES ('Modern',2.0)
INSERT INTO CARD(NAME,PRICE) VALUES ('Legacy',3.0)
INSERT INTO CARD(NAME,PRICE) VALUES ('Vintage',4.0)
INSERT INTO CARD(NAME,PRICE) VALUES ('Commander',5.0)


INSERT INTO DECK(NAME,PRICE) VALUES ('Standard',1.0)
INSERT INTO DECK(NAME,PRICE) VALUES ('Modern',2.0)
INSERT INTO DECK(NAME,PRICE) VALUES ('Legacy',3.0)
INSERT INTO DECK(NAME,PRICE) VALUES ('Vintage',4.0)
INSERT INTO DECK(NAME,PRICE) VALUES ('Commander',5.0)


INSERT INTO CARD_DECK(card_id,deck_id) VALUES (1,5)
INSERT INTO CARD_DECK(card_id,deck_id) VALUES (2,4)
INSERT INTO CARD_DECK(card_id,deck_id) VALUES (3,3)
INSERT INTO CARD_DECK(card_id,deck_id) VALUES (4,2)
INSERT INTO CARD_DECK(card_id,deck_id) VALUES (5,1)
