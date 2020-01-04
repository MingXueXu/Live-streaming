set names utf8;
//用户数据id、用户名称、用户密码、用户昵称、用户头像地址、性别、个性签名、用户标签
INSERT INTO `user_info` VALUES (1, 'name1', '111', 'nikename1', 'URL1', '男', '11', '1');
INSERT INTO `user_info` VALUES (2, 'name2', '222', 'nikename2', 'URL2', '男', '22', '2');
INSERT INTO `user_info` VALUES (3, 'name3', '333', 'nikename3', 'URL3', '男', '33', '3');
//3个视频的id、编号、名称、映射路径、上传者的id、以及长传的时间、点赞数
INSERT INTO `video_info` VALUES (1, 'num1', 'name1', 'url1', '1','time',1);
INSERT INTO `video_info` VALUES (2, 'num2', 'name2', 'url2', '2','time',2);
INSERT INTO `video_info` VALUES (3, 'num3', 'name3', 'url3', '3','time',3);
//id为1、2、3的三个用户对视频id为1的评论内容1、2、3和评论时间
INSERT INTO `comment` VALUES (1, '1', '1', 'comment1','2000-1-1,00:00:00');
INSERT INTO `comment` VALUES (2, '1', '2', 'comment2','2000-1-1,00:00:00');
INSERT INTO `comment` VALUES (3, '1', '3', 'comment3','2000-1-1,00:00:00');
//用户1收藏id为1、2、3的视频时间三个表
INSERT INTO `collection` VALUES (1, 1, 1);
INSERT INTO `collection` VALUES (2, 2, 1);
INSERT INTO `collection` VALUES (3, 3, 1);
//用户1观看id为1、2、3的视频时间三个表
INSERT INTO `watching_history` VALUES (1, 1, 1,'time');
INSERT INTO `watching_history` VALUES (2, 2, 1,'time');
INSERT INTO `watching_history` VALUES (3, 3, 1,'time');
commit;