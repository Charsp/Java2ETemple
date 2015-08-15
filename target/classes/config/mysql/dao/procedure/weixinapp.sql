use weixinapp; 
-- 给用户临时增加权限
delimiter //
-- 所有触发器
-- 修改之前
drop trigger IF EXISTS mapping_BUPD;  

CREATE  TRIGGER  mapping_BUPD  before UPDATE ON `mapping` FOR EACH ROW
begin
set new.binddate = now();
end 

drop trigger IF EXISTS mapping_BINS; 

CREATE  TRIGGER  mapping_BINS  before UPDATE ON `mapping` FOR EACH ROW
begin
set new.binddate = now();
end 

-- 创建存储过程 saveMapping
drop procedure IF EXISTS saveMapping; 

create procedure  saveMapping (_openid varchar(28),_loginid varchar(20),_loginpwd varchar(20))
begin 
	-- 查询现有openid的数量是否存在	
	declare num int default 0 ;
 	select count(*) into num from mapping where openid = _openid; 
	-- 存在之前openid,修改其deleted为0，并修改其用户名密码
	if num>0  then 
	update mapping set deleted=0,loginid=_loginid,loginpwd=_loginpwd where openid=_openid;
	else 
	insert into mapping (openid,loginid,loginpwd,deleted)values(_openid,_loginid,_loginpwd,0);
	end if;
end  


delimiter ;  -- 将SQL标识符重新设为 ';'  