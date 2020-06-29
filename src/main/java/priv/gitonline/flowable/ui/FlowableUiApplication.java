package priv.gitonline.flowable.ui;

import org.flowable.ui.modeler.conf.DatabaseConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Import;
import priv.gitonline.flowable.ui.config.AppDispatcherServletConfiguration;
import priv.gitonline.flowable.ui.config.ApplicationConfiguration;

//启用全局异常拦截器
@Import(value={
        // 引入修改的配置
        ApplicationConfiguration.class,
        AppDispatcherServletConfiguration.class,
        // 引入 DatabaseConfiguration 表更新转换
        DatabaseConfiguration.class})
@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class FlowableUiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlowableUiApplication.class, args);
    }

}
