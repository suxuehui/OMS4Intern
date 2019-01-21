package cn.com.connext.oms.service;

import cn.com.connext.oms.entity.TbRole;
import cn.com.connext.oms.mapper.TbRoleMapper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TbRoleService {

    List<TbRole> getListRole();
    /**
     * 角色分页
     * @param pageSize
     * @param currentPage
     * @param roleName
     * @return
     */
    PageInfo<TbRole> page(Integer pageSize, Integer currentPage, String roleName);
    /**
     * 生成角色单
     * @return TbRole
     *
     */
    List<TbRole> addRole();

    /**@Author:Stephanie
     * @Description:根据role_id查询role_name
     */
    public TbRole fingRoleNameById(Integer roleId);

    /**
     * @Description:根据role_name查询role_id
     * @return
     */
    public TbRole findIdByRoleName(Integer roleName);

    /**
     * 通过角色id获取角色是否存在
     */
    TbRole getRoleByRoleId(String roleName,Integer roleId);

    /**
     * 删除角色
     * @param roleId
     * @return boolean
     */
    boolean roleDeletById(int roleId);

    /**
     * 更新角色接口并授权
     * @param id
     * @param roleName
     * @param permissionId
     * @return
     */
    String roleUpdate(Integer id,String roleName, String permissionId);

    /**
     * 添加角色
     * @param tbRole
     * @return
     */
    boolean addRole(TbRole tbRole);


}
