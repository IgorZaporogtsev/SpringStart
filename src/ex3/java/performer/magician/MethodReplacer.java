package ex3.java.performer.magician;


import java.lang.reflect.Method;

public interface MethodReplacer {

    Object reimplement(Object target, Method method, Object[] args);

}
