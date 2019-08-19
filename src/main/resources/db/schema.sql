CREATE TABLE book (
	id BIGINT AUTO_INCREMENT comment 'ID',
	book_name VARCHAR(128) comment '书名',
	author VARCHAR(128) comment '作者',
	price DECIMAL (12,2) comment '价格',
	cover VARCHAR (200) comment '封面',
	summary VARCHAR (320) comment '摘要'
);


