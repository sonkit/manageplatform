package com.wonders.express.manageplatform.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.wonders.express.manageplatform.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByLoginName(String loginName);
}
