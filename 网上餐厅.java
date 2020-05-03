-- ������
CREATE TABLE `dinnertable` (
  `id` int(11) NOT NULL AUTO_INCREMENT,--����id
  `tableName` varchar(20) DEFAULT NULL, -- ��������
  `tableStatus` int(11) DEFAULT '0',   -- ����״̬   0��ʾ����״̬   1��ʾ��Ԥ��״̬
  `orderDate` datetime DEFAULT NULL,   -- Ԥ������ʱ��
  PRIMARY KEY (`id`)
)
-- ��ϵ��  ���ˣ���˵�
CREATE TABLE `foodtype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,  --��ϵid
  `typeName` varchar(20) DEFAULT NULL,      --��ϵ����
  PRIMARY KEY (`id`)
)
-- ������
CREATE TABLE `food` (
  `id` int(11) NOT NULL AUTO_INCREMENT,  -- ����id
  `foodName` varchar(20) DEFAULT NULL,     -- ����
  `foodType_id` int(11) DEFAULT NULL,          -- ������ϵ
  `price` double DEFAULT NULL,                     -- �۸�
  `mprice` double DEFAULT NULL,                  -- ��Ա�۸�
  `remark` varchar(200) DEFAULT NULL,         --��������
  `img` varchar(100) DEFAULT NULL,              -- ����ͼƬ��Ӧ·��
  PRIMARY KEY (`id`),
  KEY `fk_food_foodType_id` (`foodType_id`),
  CONSTRAINT `fk_food_foodType_id` FOREIGN KEY (`foodType_id`) REFERENCES `foodtype` (`id`)
)

-- ������
CREATE TABLE `orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT,   -- ����id
  `table_id` int(11) DEFAULT NULL,                  -- ����id
  `orderDate` datetime DEFAULT NULL,           -- �µ�ʱ��
  `totalPrice` double DEFAULT NULL,              -- �ܽ��
  `orderStatus` int(11) DEFAULT '0',                --֧��״̬  0δ֧��   1��֧��
  PRIMARY KEY (`id`),
  KEY `order_table_id` (`table_id`),
  CONSTRAINT `order_table_id` FOREIGN KEY (`table_id`) REFERENCES `dinnertable` (`id`)
) 

-- ������ϸ��
CREATE TABLE `orderdetail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,       -- ������ϸid
  `orderId` int(11) DEFAULT NULL,             -- ��������id
  `food_id` int(11) DEFAULT NULL,             -- ����id
  `foodCount` int(11) DEFAULT NULL,           -- ��������
  PRIMARY KEY (`id`),
  KEY `orderDetail_order_id` (`orderId`),
  KEY `orderDetail_food_id` (`food_id`),
  CONSTRAINT `orderDetail_food_id` FOREIGN KEY (`food_id`) REFERENCES `food` (`id`),
  CONSTRAINT `orderDetail_order_id` FOREIGN KEY (`orderId`) REFERENCES `orders` (`id`)
)

-- ����Ա��
CREATE TABLE `admin` (
  `id` varchar(20) NOT NULL,                     -- ����Աid
  `name` varchar(20) DEFAULT NULL,               -- ����Ա����
  `password` varchar(32) DEFAULT NULL,           -- ����Ա����
  PRIMARY KEY (`id`)
)
