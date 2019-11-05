-- ----------------------------
-- Records of user_detail_info
-- ----------------------------
set names utf8;
INSERT INTO `user` VALUES (1, 'root', 'root', 'ALone Wolf', NULL, '男', '武汉', '10', '教育学院', '教育技术学', '我的世界，你的爱情', 'java，宅男',0);
INSERT INTO `user` VALUES (2, '111', '111', '111', NULL, '男', '武汉', '11', '教育学院', '教育技术学', '1111', 'vue',0);
INSERT INTO `user` VALUES (3, '222', '222', '222', NULL, '女', '武汉', '12', '生命科学学院', '生物信息学', '222', '无',0);
INSERT INTO `user` VALUES (4, 'abc', 'abc', 'abc', NULL, '女', '武汉', '13', '计算机与信息学院', '软件工程', 'abc', '无',0);
INSERT INTO `file` (id,name,classification,publish_time) VALUES ('1','file1','类别1','2000-7-25 22:56:32');
INSERT INTO `file` (id,name,classification,publish_time) VALUES ('2','file2','类别1','2000-7-26 22:56:32');
INSERT INTO `file` (id,name,classification,publish_time) VALUES ('3','file3','类别2','2000-7-27 22:56:32');
INSERT INTO `file` (id,name,classification,publish_time) VALUES ('4','file4','类别2','2000-7-28 22:56:32');
INSERT INTO `video_info` (id,thumb_number,flower_number,collect_number,broadcast_number) VALUES ('1','111','111','111','111');
INSERT INTO `video_info` (id,thumb_number,flower_number,collect_number,broadcast_number) VALUES ('2','222','222','222','222');
INSERT INTO `video_info` (id,thumb_number,flower_number,collect_number,broadcast_number) VALUES ('3','333','333','333','333');
INSERT INTO `video_info` (id,thumb_number,flower_number,collect_number,broadcast_number) VALUES ('4','444','444','444','444');
commit;
