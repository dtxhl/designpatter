package com.xhl.demo1;

public class UserDaoProxy implements IUserDao {
    //接收保存目标对象
    private IUserDao target;

    public UserDaoProxy(IUserDao target) {
        this.target = target;
    }

    @Override
    public void save() {
        System.out.println("开始事物。。。");
        target.save();//执行目标对象的方法
        System.out.println("提交事物...");
    }
}
