package hello.services;

import hello.config.BaseSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;



/**
 * Created by lyp on 3/5/2017.
 */
@Service
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
