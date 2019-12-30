DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info`(
    `id`                     bigint(20) NOT NULL AUTO_INCREMENT,
    `username`               varchar(255) DEFAULT NULL,
    `password`               varchar(255) DEFAULT NULL,
    `nickname`               varchar(255) DEFAULT NULL,
    `user_img_url`           varchar(255) DEFAULT NULL,
    `personalized_signature` varchar(255) DEFAULT NULL,
    `personalized_labels`    varchar(255) DEFAULT NULL,
    `age` int default null comment '吧龄',
     PRIMARY KEY (`id`)
);
ALTER TABLE `user_info` ADD UNIQUE (`username`);

drop table if exists `video_info`;
create table `video_info`(
`id` bigint(20) not null AUTO_INCREMENT,
`num` varchar (255) default null comment '视频的编号',
`name` varchar (255) default null comment '视频名称',
`video_url` varchar(255) default null comment '视频的映射路径',
`user_id` bigint(20) default null comment '保存视频上传者的id',
`time` varchar (255) default null comment '视频长传的时间',
`like_num` int default null comment '点赞数',
primary key (`id`)
);
ALTER TABLE `video_info` ADD UNIQUE (`name`);

drop table if exists `comment`;
create table `comment`(
`id` bigint(20) not null AUTO_INCREMENT,
`video_id` bigint default null comment '视频id',
`user_id` bigint default null comment '评论人id',
`comment` varchar (1000) default null comment '评论内容',
`time` varchar (255) default null comment '评论时间',
primary key (`id`)
);
ALTER TABLE `comment` ADD UNIQUE (`video_id`);

drop table if exists `collection`;
create table `collection`(
`id` bigint(20) not null AUTO_INCREMENT,
`video_id` bigint default null comment '视频id',
`user_id` bigint default null comment '评论人id',
primary key (`id`)
);
ALTER TABLE `collection` ADD UNIQUE (`video_id`);

drop table if exists `watching_history`;
create table `watching_history`(
`id` bigint(20) not null AUTO_INCREMENT,
`video_id` bigint default null comment '视频id',
`user_id` bigint default null comment '评论人id',
`time` varchar (255) default null comment '观看时间',
primary key (`id`)
);
ALTER TABLE `watching_history` ADD UNIQUE (`video_id`);
