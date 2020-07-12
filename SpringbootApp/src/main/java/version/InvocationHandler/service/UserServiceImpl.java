package version.InvocationHandler.service;

import version.InvocationHandler.service.UserService;

public class UserServiceImpl implements UserService {
	@Override
	public void print() {
		//System.out.println("你大爷");
	}
	@Override
	public void doSomething(String string) {
		System.out.println(string);
	}
}
