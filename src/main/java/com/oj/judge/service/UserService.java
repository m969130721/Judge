package com.oj.judge.service;

import com.oj.judge.common.ServerResult;
import com.oj.judge.common.StatusConst;

/**
 * @author m969130721@163.com
 * @date 18-12-17 下午1:44
 */
public interface UserService {

    ServerResult addCount(Integer userId, StatusConst statusConst);

    ServerResult addSolutionCount(Integer userId);

}
