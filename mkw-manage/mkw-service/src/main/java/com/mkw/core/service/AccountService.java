package com.mkw.core.service;

import com.mkw.core.common.SuperService;
import com.mkw.core.entity.Account;
import com.mkw.plugins.DataInfo;
import com.mkw.plugins.PageInfo;

/**
 * <p>
 * 管理员表 服务类
 * </p>
 *
 * @author xiaojiayi
 * @since 2018-09-06
 */
public interface AccountService extends SuperService<Account> {
	
	/**
	 * @Description: 保存对象信息
	 * @author xiaojiayi 
	 * @date 2018年4月30日 下午7:13:26 
	 * @param dataInfo
	 * @param authorId
	 * @return
	 * @throws Exception
	 */
	public DataInfo addModel(DataInfo dataInfo, String authorId) throws Exception;
	
	/**
	 * @Description: 根据id更新对象信息
	 * @author xiaojiayi 
	 * @date 2018年4月30日 下午7:13:26 
	 * @param dataInfo
	 * @param authorId
	 * @return
	 * @throws Exception
	 */
	public DataInfo editModelById(DataInfo dataInfo, String authorId) throws Exception;
	
	/**
	 * @Description: 根据id软删除对象信息
	 * @author xiaojiayi 
	 * @date 2018年4月30日 下午7:13:26 
	 * @param dataInfo
	 * @param authorId
	 * @return
	 * @throws Exception
	 */
	public DataInfo remoteModelById(DataInfo dataInfo, String authorId) throws Exception;
	
	/**
	 * @Description: 根据id更新状态
	 * @author xiaojiayi 
	 * @date 2018年4月30日 下午7:13:26 
	 * @param dataInfo
	 * @param authorId
	 * @return
	 * @throws Exception
	 */
	public DataInfo editStatusById(DataInfo dataInfo, String authorId) throws Exception;
	
	/**
	 * @Description: 根据id获取对象信息
	 * @author xiaojiayi 
	 * @date 2018年4月30日 下午7:13:26 
	 * @param dataInfo
	 * @param authorId
	 * @return
	 * @throws Exception
	 */
	public DataInfo findModelById(DataInfo dataInfo) throws Exception;
	
	/**
	 * @Description: 根据实体获取列表数据
	 * @author xiaojiayi 
	 * @date 2018年4月30日 下午7:13:26 
	 * @param dataInfo
	 * @param authorId
	 * @return
	 * @throws Exception
	 */
	public DataInfo findListByModel(DataInfo dataInfo) throws Exception;
	
	/**
	 * @Description: 分页获取数据
	 * @author xiaojiayi 
	 * @date 2018年4月30日 下午7:13:26 
	 * @param dataInfo
	 * @param authorId
	 * @return
	 * @throws Exception
	 */
	public PageInfo findListByPage(PageInfo pageInfo) throws Exception;
	
	/**
	 * @Description: 检查登陆信息
	 * @author xiaojiayi 
	 * @date 2018年9月6日 下午5:09:11
	 * @param dataInfo
	 * @param type 0综合版1企业版2个人版
	 * @return
	 * @throws Exception
	 */
	public DataInfo checkLogin(DataInfo dataInfo, int type) throws Exception;
	
	/**
	 * @Description: 获取菜单
	 * @author xiaojiayi 
	 * @date 2018年9月10日 上午10:20:48
	 * @param dataInfo
	 * @return
	 * @throws Exception
	 */
	public DataInfo findMenu(DataInfo dataInfo, String authorId) throws Exception;
}
