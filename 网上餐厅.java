-- 餐桌表
CREATE TABLE `dinnertable` (
  `id` int(11) NOT NULL AUTO_INCREMENT,--餐桌id
  `tableName` varchar(20) DEFAULT NULL, -- 餐桌名称
  `tableStatus` int(11) DEFAULT '0',   -- 餐桌状态   0表示空闲状态   1表示已预订状态
  `orderDate` datetime DEFAULT NULL,   -- 预定餐桌时间
  PRIMARY KEY (`id`)
)
-- 菜系表  川菜，湘菜等
CREATE TABLE `foodtype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,  --菜系id
  `typeName` varchar(20) DEFAULT NULL,      --菜系名称
  PRIMARY KEY (`id`)
)
-- 菜名表
CREATE TABLE `food` (
  `id` int(11) NOT NULL AUTO_INCREMENT,  -- 菜名id
  `foodName` varchar(20) DEFAULT NULL,     -- 菜名
  `foodType_id` int(11) DEFAULT NULL,          -- 所属菜系
  `price` double DEFAULT NULL,                     -- 价格
  `mprice` double DEFAULT NULL,                  -- 会员价格
  `remark` varchar(200) DEFAULT NULL,         --菜名描述
  `img` varchar(100) DEFAULT NULL,              -- 菜名图片对应路径
  PRIMARY KEY (`id`),
  KEY `fk_food_foodType_id` (`foodType_id`),
  CONSTRAINT `fk_food_foodType_id` FOREIGN KEY (`foodType_id`) REFERENCES `foodtype` (`id`)
)

-- 订单表
CREATE TABLE `orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT,   -- 订单id
  `table_id` int(11) DEFAULT NULL,                  -- 餐桌id
  `orderDate` datetime DEFAULT NULL,           -- 下单时间
  `totalPrice` double DEFAULT NULL,              -- 总金额
  `orderStatus` int(11) DEFAULT '0',                --支付状态  0未支付   1已支付
  PRIMARY KEY (`id`),
  KEY `order_table_id` (`table_id`),
  CONSTRAINT `order_table_id` FOREIGN KEY (`table_id`) REFERENCES `dinnertable` (`id`)
) 

-- 订单明细表
CREATE TABLE `orderdetail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,       -- 订单明细id
  `orderId` int(11) DEFAULT NULL,             -- 所属订单id
  `food_id` int(11) DEFAULT NULL,             -- 菜名id
  `foodCount` int(11) DEFAULT NULL,           -- 订餐数量
  PRIMARY KEY (`id`),
  KEY `orderDetail_order_id` (`orderId`),
  KEY `orderDetail_food_id` (`food_id`),
  CONSTRAINT `orderDetail_food_id` FOREIGN KEY (`food_id`) REFERENCES `food` (`id`),
  CONSTRAINT `orderDetail_order_id` FOREIGN KEY (`orderId`) REFERENCES `orders` (`id`)
)

-- 管理员表
CREATE TABLE `admin` (
  `id` varchar(20) NOT NULL,                     -- 管理员id
  `name` varchar(20) DEFAULT NULL,               -- 管理员姓名
  `password` varchar(32) DEFAULT NULL,           -- 管理员密码
  PRIMARY KEY (`id`)
)
