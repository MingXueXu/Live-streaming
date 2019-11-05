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

DROP TABLE IF EXISTS `video_manage`;
CREATE TABLE `video_manage` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `classify_id` varchar(50) DEFAULT NULL comment '分类ID',
  `classify` varchar(50) DEFAULT NULL comment '分类名称',
  `discuss_user` varchar(50) DEFAULT NULL comment '讨论人',
  `discuss_content` varchar(50) DEFAULT NULL comment '讨论内容',
  PRIMARY KEY (`id`)
)
ALTER TABLE `video_manage` ADD UNIQUE (`id`);

ALTER TABLE `video_manage` ADD UNIQUE (`classify_id`);

DROP TABLE IF EXISTS `user_master_manage`;
CREATE TABLE `user_master_manage` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL comment '用户名',
  `collect_video` varchar(50) DEFAULT NULL comment '用户收藏视频',
  `thumb_video` varchar(50) DEFAULT NULL comment '用户点赞视频',
  `flower_video` varchar(50) DEFAULT NULL comment '用户送花视频',
  `history_view_video` varchar(50) DEFAULT NULL comment '用户观看历史视频',
  PRIMARY KEY (`id`)
)
ALTER TABLE `video_manage` ADD UNIQUE (`id`);