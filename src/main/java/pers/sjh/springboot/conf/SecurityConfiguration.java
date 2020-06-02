package pers.sjh.springboot.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import pers.sjh.springboot.handler.LoginFailureAuthenticationHandler;
import pers.sjh.springboot.handler.LoginSuccessAuthenticationHandler;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {


    @Autowired
    private LoginSuccessAuthenticationHandler loginSuccessAuthenticationHandler;

    @Autowired
    private LoginFailureAuthenticationHandler loginFailureAuthenticationHandler;



    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin() 								// 定义当需要用户登录时候，转到的登录页面。
                .loginPage("/login")	 					// 设置登录页面
                .successHandler(loginSuccessAuthenticationHandler)
                .failureHandler(loginFailureAuthenticationHandler)

                .and().authorizeRequests()					// 定义哪些URL需要被保护、哪些不需要被保护
                .antMatchers("/css/**","/lib/**", "/js/**","/images/**", "/webjars/**", "**/favicon.ico","/", "/login").permitAll()		// 设置所有人都可以访问登录页面
                .anyRequest().authenticated() 				// 任何请求,登录后可以访问
                .and().csrf().disable();
        http.headers().frameOptions().disable();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        //解决静态资源被拦截的问题
        web.ignoring().antMatchers("/static/**");
    }




}
