-- ----------------------------
-- Records of user_detail_info
-- ----------------------------
set names utf8;
INSERT INTO `user` VALUES (1, 'name', '111', 'nikename', 'URL', '男', '11', '1');
INSERT INTO `videoinfo` VALUES (1, 'name', 'type', 'url', 'uploader', '男', 'like', 'collection', 2000-1-1 00:00:00);
INSERT INTO `comment` VALUES (1, 'videoid', 'name', 'comment', 2000-1-1 00:00:00);
INSERT INTO `collection` VALUES (1, 'videoid', 'name');
INSERT INTO `watchinghistory` VALUES (1, 'videoid', 'name');
commit;
