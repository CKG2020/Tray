package com.easyArch.server.mapper;

import com.easeArch.common.entry.FriendItemVo;
import com.easeArch.common.entry.Temp;
import com.easeArch.common.entry.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM tray_user WHERE account=#{username,jdbcType=VARCHAR}")
    User findUserByUsername(@Param("username")String username);
    @Insert("insert into tray_user(username,pwd,nickname,cmt,ip) values (#{username},#{pwd},#{nickname},#{cmt},#{ip})")
    int insertUser(User user);
    @Select("SELECT tray_user.account,tray_user.username,tray_friend.status FROM tray_friend,tray_user where tray_friend.faccount=tray_user.account and tray_friend.account=#{account}")
    List<FriendItemVo> friendByCount(@Param("account")String account);


    @Select("SELECT   tray_user.username FROM  tray_user where tray_user.account=#{account}")
    User findUserByAccount(@Param("account")String account);

//    @Insert("INSERT into tray_friend(fid,account,faccount,status) values (#{fid},#{account},#{faccount},#{status})")
//    int insertFriend(FriendItemVo friendItemVo);
    //添加好友前验证该好友是否已经存在
    @Select("SELECT   * FROM  tray_friend  where tray_friend.faccount=#{faccount}")
    Temp  findFriendByFaccount(@Param("faccount")String  faccount);



    @Insert("INSERT into tray_friend(account,faccount) values (#{account},#{faccount})")
    int insertFriend(@Param("account")String account, @Param("faccount")String faccount);




}
