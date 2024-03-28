package com.lovenoteservice.lovenoteservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lovenoteservice.lovenoteservice.domain.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {

    UserInfo findByPhone(int phone);

}