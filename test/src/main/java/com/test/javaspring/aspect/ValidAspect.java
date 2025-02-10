package com.test.javaspring.aspect;

import com.test.javaspring.excetion.ValidException;
import com.test.javaspring.repository.OAuth2UserMapper;
import com.test.javaspring.service.UserService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;

import java.beans.BeanProperty;

@Aspect
@Component
public class ValidAspect {

    @Autowired
    private UserService userService;
    @Autowired
    private OAuth2UserMapper oAuth2UserMapper;


    @Pointcut("@annotation(com.test.javaspring.aspect.annotation.ValidAop)")
    private void pointCut(){}

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        Object[] args = proceedingJoinPoint.getArgs();
        BeanPropertyBindingResult bindingResult = null;

        for(Object arg : args){
            if(arg.getClass() == BeanPropertyBindingResult.class){
                bindingResult = (BeanPropertyBindingResult) arg;
                break;
            }
        }

        if(bindingResult.hasErrors()){
            throw new ValidException("유효성 검사 오류", bindingResult.getFieldError());
        }

        return proceedingJoinPoint.proceed();
    }
}
