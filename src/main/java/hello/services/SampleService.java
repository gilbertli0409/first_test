package hello.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import config.BaseSetting;


/**
 * Created by lyp on 3/5/2017.
 */
@Service
@EnableConfigurationProperties(BaseSetting.class)
public class SampleService
{
	@Autowired
	private BaseSetting setting;


	public BaseSetting getSetting()
	{
		return setting;
	}
	public void setSetting(final BaseSetting setting)
	{
		this.setting = setting;
	}
}
