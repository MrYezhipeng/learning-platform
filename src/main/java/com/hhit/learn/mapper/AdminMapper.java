package com.hhit.learn.mapper;

import com.hhit.learn.entity.AdminEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * The interface Admin mapper.
 *
 * @program: learn
 * @description: Admin的mapper
 * @author: 叶志鹏
 * @create: 2018 -04-04 11:50
 */
@Mapper
@Component
public interface AdminMapper {

    /**
     * Save admin.
     *
     * @param adminName     the admin name
     * @param adminPassword the admin password
     * @Description: 保存管理员的账号密码
     * @Param: adminName账号 ；adminPassword密码
     * @return: void
     * @Author: 叶志鹏
     * @Date: 2018 /4/4
     */
    void saveAdmin(@Param(value = "adminName") String adminName,
                   @Param(value = "adminPassword") String adminPassword);

    /**
     * Delete admin.
     *
     * @param pkAdminID the pk admin id
     * @Description: 通过pkAdminID删除admin记录
     * @Param: pkAdminId 为admin的ID
     * @return: void
     * @Author: 叶志鹏
     * @Date: 2018 /4/4
     */
    void deleteAdmin(@Param(value = "pkAdminId") Integer pkAdminID);

    /**
     * Update admin password.
     *
     * @param adminName     the admin name
     * @param adminPassword the admin password
     * @Description: 通过pkAdminID修改admin记录
     * @Param: pkAdminId 为admin的ID
     * @return: void
     * @Author: 叶志鹏
     * @Date: 2018 /4/4
     */
    void updateAdminPassword(@Param(value = "adminName") String adminName,
                             @Param(value = "adminPassword") String adminPassword);

    /**
     * Gets admin.
     *
     * @param adminName     the admin name
     * @param adminPassword the admin password
     * @return the admin
     * @Description: 通过账号密码查询管理员
     * @Param: adminName adminPassword
     * @return: AdminEntity
     * @Author: 叶志鹏
     * @Date: 2018 /4/4
     */
    AdminEntity getAdmin(@Param(value = "adminName") String adminName,
                         @Param(value = "adminPassword") String adminPassword);
}

