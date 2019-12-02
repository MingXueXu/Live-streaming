set names utf8;

-- //用户表
DROP TABLE IF EXISTS `user`;                           
CREATE TABLE `user`
(
    `id`                     bigint(20) NOT NULL AUTO_INCREMENT,
    `username`               varchar(255) DEFAULT NULL,
    `password`               varchar(255) DEFAULT NULL,
    `nickname`               varchar(255) DEFAULT NULL,
    `userimgurl`           varchar(255) DEFAULT NULL,
    `sex`                    varchar(255) DEFAULT NULL,
    `age`                    varchar(255) DEFAULT NULL,
    `online`                 int(10)      default null,
    PRIMARY KEY (`id`)
);

ALTER TABLE `user` ADD UNIQUE (`username`);

--//视频信息表
DROP TABLE IF EXISTS `videoinfo`;                  
CREATE TABLE `videoinfo`
(    
  `id`            bigint(20) NOT NULL AUTO_INCREMENT,
  `name`            varchar(255) DEFAULT NULL comment '文件名',
  `type`            varchar(255) DEFAULT NULL comment '视频分类',
  `url`             varchar(255) DEFAULT NULL comment '视频的地址',
  `uploader`        varchar(255) DEFAULT NULL comment '上传者',
  `like`            varchar(255) DEFAULT NULL comment '点赞',
  `collection`      varchar(255) DEFAULT NULL comment '收藏',
  `time`            datetime(255) DEFAULT NULL comment '视频发布时间',
  PRIMARY KEY (`id`)
);
ALTER TABLE `videoinfo` ADD UNIQUE (`id`);                       

DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `videoid` varchar(255) DEFAULT NULL comment '视频id',
  `username` varchar(255) DEFAULT NULL comment '评论人',
  `comment`  varchar(255) DEFAULT NULL comment '评论内容',
  `time`     datetime(255) DEFAULT NULL comment '评论时间',
  PRIMARY KEY (`id`)
);
ALTER TABLE `comment` ADD UNIQUE (`id`);

--//收藏表
DROP TABLE IF EXISTS `collection`;
CREATE TABLE `collection` (                    
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `videoid` varchar(255) DEFAULT NULL comment '收藏视频的id',
  `username` varchar(255) DEFAULT NULL comment '收藏对象的用户名',
  PRIMARY KEY (`id`)
);
ALTER TABLE `collection` ADD UNIQUE (`id`);

--//观看历史表
DROP TABLE IF EXISTS `watchinghistory`;
CREATE TABLE `watchinghistory` (                    
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `videoid` varchar(255) DEFAULT NULL comment '观看历史的视频id',
  `username` varchar(255) DEFAULT NULL comment '观看历史的用户名',
  PRIMARY KEY (`id`)
);
ALTER TABLE `watching_history` ADD UNIQUE (`id`);