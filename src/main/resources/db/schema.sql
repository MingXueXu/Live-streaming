DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info`
(
    `id`                     bigint(20) NOT NULL AUTO_INCREMENT,
    `username`               varchar(255) DEFAULT NULL,
    `password`               varchar(255) DEFAULT NULL,
    `nickname`               varchar(255) DEFAULT NULL,
    `user_img_url`           varchar(255) DEFAULT NULL,
    `sex`                    varchar(255) DEFAULT NULL,
    `city`                   varchar(255) DEFAULT NULL,
    `school`                 varchar(255) DEFAULT NULL,
    `academy`                varchar(255) DEFAULT NULL,
    `major`                  varchar(255) DEFAULT NULL,
    `personalized_signature` varchar(255) DEFAULT NULL,
    `personalized_labels`    varchar(255) DEFAULT NULL,
    `online`                 int(10)      default null,
    PRIMARY KEY (`id`)
);
