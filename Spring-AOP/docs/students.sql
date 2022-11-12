CREATE TABLE `students` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `gender` tinyint(1) NOT NULL,
  `grade` int(11) NOT NULL,
  `score` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1001 DEFAULT CHARSET=utf8;


INSERT INTO `students`(`id`, `name`, `gender`, `grade`, `score`) VALUES (1, '小明', 1, 1, 88);
INSERT INTO `students`(`id`, `name`, `gender`, `grade`, `score`) VALUES (2, '小红', 1, 1, 95);
INSERT INTO `students`(`id`, `name`, `gender`, `grade`, `score`) VALUES (3, '小军', 0, 1, 93);
INSERT INTO `students`(`id`, `name`, `gender`, `grade`, `score`) VALUES (4, '小白', 0, 1, 100);
INSERT INTO `students`(`id`, `name`, `gender`, `grade`, `score`) VALUES (5, '小牛', 1, 2, 96);
INSERT INTO `students`(`id`, `name`, `gender`, `grade`, `score`) VALUES (6, '小兵', 1, 2, 99);
INSERT INTO `students`(`id`, `name`, `gender`, `grade`, `score`) VALUES (7, '小强', 0, 2, 86);
INSERT INTO `students`(`id`, `name`, `gender`, `grade`, `score`) VALUES (8, '小乔', 0, 2, 79);
INSERT INTO `students`(`id`, `name`, `gender`, `grade`, `score`) VALUES (9, '小青', 1, 3, 85);
INSERT INTO `students`(`id`, `name`, `gender`, `grade`, `score`) VALUES (10, '小王', 1, 3, 90);
INSERT INTO `students`(`id`, `name`, `gender`, `grade`, `score`) VALUES (11, '小林', 0, 3, 91);
INSERT INTO `students`(`id`, `name`, `gender`, `grade`, `score`) VALUES (12, '小贝', 0, 3, 77);
INSERT INTO `students`(`id`, `name`, `gender`, `grade`, `score`) VALUES (999, 'Bob', 1, 1, 80);
INSERT INTO `students`(`id`, `name`, `gender`, `grade`, `score`) VALUES (1000, 'Bob2', 1, 1, 80);
