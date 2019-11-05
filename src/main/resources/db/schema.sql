set names utf8;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`
(
    `id`                     bigint(20) NOT NULL AUTO_INCREMENT,
    `username`               varchar(255) DEFAULT NULL,
    `password`               varchar(255) DEFAULT NULL,
    `nickname`               varchar(255) DEFAULT NULL,
    `user_img_url`           varchar(255) DEFAULT NULL,
    `sex`                    varchar(255) DEFAULT NULL,
    `city`                   varchar(255) DEFAULT NULL,
    `years`                 varchar(255) DEFAULT NULL,
    `academy`                varchar(255) DEFAULT NULL,
    `major`                  varchar(255) DEFAULT NULL,
    `personalized_signature` varchar(255) DEFAULT NULL,
    `personalized_labels`    varchar(255) DEFAULT NULL,
    `online`                 int(10)      default null,
    PRIMARY KEY (`id`)
);

ALTER TABLE `user` ADD UNIQUE (`username`);

DROP TABLE IF EXISTS `file`;
CREATE TABLE `file` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL comment '文件名',
  `classification` varchar(50) DEFAULT NULL comment '视频分类',
  `publish_time` DATETIME NOT NULL comment '视频发布时间',
  PRIMARY KEY (`id`)
);

ALTER TABLE `file` ADD UNIQUE (`id`);

DROP TABLE IF EXISTS `video_info`;
CREATE TABLE `video_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `thumb_number` varchar(50) DEFAULT NULL comment '视频点赞数',
  `flower_number` varchar(50) DEFAULT NULL comment '视频送花数',
  `collect_number` varchar(50) DEFAULT NULL comment '收藏量',
  `broadcast_number`varchar(50) DEFAULT NULL comment '点播放量',
  PRIMARY KEY (`id`)
)
ALTER TABLE `video_info` ADD UNIQUE (`id`);