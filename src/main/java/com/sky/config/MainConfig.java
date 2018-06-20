package com.sky.config;

import com.sky.bean.Person;
import org.springframework.context.annotation.*;

//配置类==配置文件
@Configuration
//@ComponentScan(value = "com.sky", excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class})})
//@ComponentScan(value = "com.sky", useDefaultFilters = false, includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})})
@ComponentScans(value = {
        @ComponentScan(value = "com.sky", useDefaultFilters = false, includeFilters = {
//                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
//                ,
//                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {BookService.class}),
                @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})
        })
})
public class MainConfig {

//    给容器中注册一个bean,类型为返回值的类型，id默认是方法名
//    通过value进行bean的重命名
    @Bean(value = "personId2")
    public Person personId(){
        return new Person("lisi", 20);
    }

}
