package cn.duozai.dao;

import cn.duozai.entity.SysUser;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表数据访问接口实现类
 *
 * @author 多仔ヾ
 */
// Dao层实现类中实现的内容相当于MyBatis操作中的测试类
// 将Dao层实现类标记为Bean对象，交给Spring管理
@Repository
public class SysUserMapperImpl implements SysUserMapper {

    // 从Spring容器中注入SqlSessionTemplate
    @Resource(name = "sqlSessionTemplate")
    SqlSessionTemplate sqlSession;

    @Override
    public List<SysUser> getUserList() {
        // 通过SqlSessionTemplate调用Mapper接口，实现数据库操作
        return sqlSession.getMapper(SysUserMapper.class).getUserList();
    }

}
