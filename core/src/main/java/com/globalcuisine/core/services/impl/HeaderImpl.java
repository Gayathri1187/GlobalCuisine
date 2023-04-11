package com.globalcuisine.core.services.impl;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import com.globalcuisine.core.models.HeaderModel;

@Model(adaptables = Resource.class, adapters = HeaderModel.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderImpl implements HeaderModel {

	@Inject
	public String text;

	@Inject
	@ChildResource
	public Resource pagedetails;
	
	@Inject
	@ChildResource
	public Resource pagedetailstwo;

	@Override
	public String getText() {
		return text;
	}

	@Override
	public Resource getPagedetails() {
		return pagedetails;
	}
	
	@Override
	public Resource getPagedetailstwo() {
		return pagedetailstwo;
	}

}