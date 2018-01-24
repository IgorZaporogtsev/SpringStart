package ex3.java.performer.magician;

import org.springframework.beans.factory.support.MethodReplacer;
import java.lang.reflect.Method;


public class TigerReplacer implements MethodReplacer {

    @Override
    public Object reimplement(Object target, Method method, Object[] args){ // Подмена метода

        return "A ferocious tiger"; // Помещает тигра в ящик
    }
}
