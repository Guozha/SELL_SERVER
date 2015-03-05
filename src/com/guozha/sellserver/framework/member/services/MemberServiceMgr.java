/**
 * 
 */
package com.guozha.sellserver.framework.member.services;

import java.util.List;

import com.guozha.sellserver.framework.exception.ObjectDuplicateException;
import com.guozha.sellserver.framework.exception.ObjectHasSubObjectException;
import com.guozha.sellserver.framework.member.Member;
import com.guozha.sellserver.framework.member.services.object.ConditionVO;
import com.guozha.sellserver.framework.sys.business.BusinessObjectServiceMgr;

/**
 * @author peng.shi
 *
 */
public interface MemberServiceMgr extends BusinessObjectServiceMgr
{
	public static final String SERVICE_NAME = "memberSrvMgr";
	
	/**
	 * 创建Member
	 * @param email
	 * @param username
	 * @param password
	 * @return
	 */
	public Member createMember(String email,String username,String password);
	
	/**
	 * 获取Member
	 * @param id
	 * @return
	 */
	public Member getMember(Long id);
	
	/**
	 * 根据Username 获取 Member
	 * @param username
	 * @return
	 */
	public Member getMemberByUsername(String username);
	
	/**
	 * 根据Email 获取 Member
	 * @param email
	 * @return
	 */
	public Member getMemberByEmail(String email);
	
	/**
	 * 添加Member
	 * @param member
	 * @return
	 * @throws ObjectDuplicateException
	 */
	public Member addMember(Member member) throws ObjectDuplicateException;
	
	/**
	 * 更新Member
	 * @param member
	 * @return
	 */
	public Member updateMember(Member member);
	
	/**
	 * 确认Member
	 * @param member
	 * @return
	 */
	public Member confiredMember(Member member);
	
	/**
	 * 删除Member
	 * @param member
	 * @return
	 */
	public Member deleteMember(Member member) throws ObjectHasSubObjectException;
	
	/**
	 * 管理员获取Member列表
	 * @param offset
	 * @param limit
	 * @return
	 */
	public List<Member> getMembers(ConditionVO vo,int offset,int limit);
	
	/**
	 * 获取Members 数量
	 * @return
	 */
	public int getTotalMembers(ConditionVO vo);
}
