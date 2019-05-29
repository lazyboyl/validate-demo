package com.validate.demo.entity.user;

/**
 * @author linzf
 * @since 2019-05-29
 * 类描述：验证分组
 */
public class UserGroup {

    /**
     * 表示当前的验证为新增数据的时候的验证
     */
    public interface AddUser{}

    /**
     * 表示当前的验证为修改数据的时候的验证
     */
    public interface UpdateUser{}

}
