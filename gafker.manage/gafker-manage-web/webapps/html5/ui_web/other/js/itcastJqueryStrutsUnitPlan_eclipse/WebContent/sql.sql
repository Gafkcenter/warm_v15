#省份信息表
create table province
(
   pid int,   #省编号  主键
   pname varchar(20) #省名称
)

insert into province(pid,pname) values(1,'吉林省');
insert into province(pid,pname) values(2,'辽宁省');
insert into province(pid,pname) values(3,'山东省');

--城市  省下的城市
create table city
(
   cid int,   #城市编号
   cname varchar(20),  #城市名称
   pid int     #省的编号 对应province表的主键
)

insert into city(cid,cname,pid) values(1,'长春',1);
insert into city(cid,cname,pid) values(2,'四平',1);
insert into city(cid,cname,pid) values(3,'吉林市',1);

insert into city(cid,cname,pid) values(4,'沈阳',2);
insert into city(cid,cname,pid) values(5,'大连',2);
insert into city(cid,cname,pid) values(6,'鞍山',2);

insert into city(cid,cname,pid) values(7,'济南',3);
insert into city(cid,cname,pid) values(8,'威海',3);
insert into city(cid,cname,pid) values(9,'烟台',3);


-- 县   城市下的县
create table county  #县
(
   tid int,   #县的编号
   tname varchar(20), #县的名称
   cid int      #城市编号    对应city表的主键
)

insert into county(tid,tname,cid) values(1,'九台',1);
insert into county(tid,tname,cid) values(2,'农安',1);

insert into county(tid,tname,cid) values(3,'梨树',2);
insert into county(tid,tname,cid) values(4,'公主岭',2);

insert into county(tid,tname,cid) values(5,'永吉',3);


