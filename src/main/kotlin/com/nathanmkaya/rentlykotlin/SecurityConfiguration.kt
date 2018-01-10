package com.nathanmkaya.rentlykotlin
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import javax.sql.DataSource
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.builders.HttpSecurity









class SecurityConfiguration {

    @Autowired
    private val bCryptPasswordEncoder: BCryptPasswordEncoder? = null
    @Autowired
    private val dataSource: DataSource? = null

    @Throws(Exception::class)
    protected fun configure(auth: AuthenticationManagerBuilder) {
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .passwordEncoder(bCryptPasswordEncoder)
    }

    @Throws(Exception::class)
    protected fun configure(http: HttpSecurity) {
        http.authorizeRequests().antMatchers("/css/**", "/webjars/**", "/static/**").permitAll().anyRequest()
                .fullyAuthenticated().and().formLogin().loginPage("/login")
                .and().logout().permitAll()
    }

    @Throws(Exception::class)
    fun configure(web: WebSecurity) {
        web.ignoring().antMatchers("/css/**", "/js/**", "/images/**", "/webjars/**", "* favicon.ico")
    }
}
