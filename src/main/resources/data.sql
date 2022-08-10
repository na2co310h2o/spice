DROP TABLE IF EXISTS products;
DROP TABLE IF EXISTS product_availability;

CREATE TABLE `products` (
	`product_id` int AUTO_INCREMENT PRIMARY KEY,
	`product_description_english` varchar(300) NOT NULL,
	`product_description_french` varchar(300) NOT NULL,
	`brand_name_english` varchar(100) NOT NULL,
	`brand_name_french` varchar(100) NOT NULL,
	`product_type` varchar(100) NOT NULL,
	`additional_product_identification` varchar(100) NOT NULL,
	`target_market` varchar(100) NOT NULL,
	`product_image_url` varchar(300) NOT NULL,
	`status` varchar(100) NOT NULL
);

CREATE TABLE `product_availability` (
	`availability_id` int AUTO_INCREMENT PRIMARY KEY,
	`available_products` int NOT NULL,
	`unused_products` int NOT NULL
);

/*INSERT INTO `products` (`product_description_english`,`product_description_french`,`brand_name_english`,`brand_name_french`,`product_type`,`additional_product_identification`,`target_market`,`product_image_url`,`status`)
	VALUES ('Chicken Noodle Soup','French Chicken Noodle Soup','Campbell Chicken Noodle Soup','French Campbell Chicken Noodle Soup','Consumer or Base','It is a soup','Canada','http://wwww.campbellSoup.com','Active');
	
INSERT INTO `products` (`product_description_english`,`product_description_french`,`brand_name_english`,`brand_name_french`,`product_type`,`additional_product_identification`,`target_market`,`product_image_url`,`status`)
	VALUES ('Chocolate Chip Cookie','French Chocolate Chip Cookie','Mrs. Fields','French Mrs. Fields','Consumer or Base','It is a cookie','Canada','http://wwww.mrsfields.com','Active');
	
INSERT INTO `products` (`product_description_english`,`product_description_french`,`brand_name_english`,`brand_name_french`,`product_type`,`additional_product_identification`,`target_market`,`product_image_url`,`status`)
	VALUES ('Potato Chips','French Potato Chips','Lays','French Lays','Consumer or Base','It is a potato chip','Canada','http://wwww.lays.com','Active');
	*/

INSERT INTO `product_availability` (`available_products`,`unused_products`)
	VALUES (54,170)
