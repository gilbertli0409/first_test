package config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Created by lyp on 3/4/2017.
 */
@Configuration
public class BaseConfig
{
	private String name;
	private String id;

	@Bean
	public BaseConfig baseConfig()
    {
        return new BaseConfig();
    }
	public String getName()
	{
		return name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

	public String getId()
	{
		return id;
	}

	public void setId(final String id)
	{
		this.id = id;
	}
}
