DROP TABLE customer IF EXISTS;
CREATE TABLE customer (
	cust_id 	NUMERIC 		PRIMARY KEY,
	cust_nm 	VARCHAR(200) 	NOT NULL,
	cust_email 	VARCHAR(200)
);

INSERT INTO customer (cust_id, cust_nm, cust_email) VALUES 1, 'scroogy', 'scroogy@swtest.co.kr';
INSERT INTO customer (cust_id, cust_nm, cust_email) VALUES 2, 'scroogy2', 'scroogy2@swtest.co.kr';
commit;
