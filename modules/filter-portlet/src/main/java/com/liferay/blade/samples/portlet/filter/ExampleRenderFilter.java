/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.liferay.blade.samples.portlet.filter;

import java.io.BufferedReader;
import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.filter.FilterChain;
import javax.portlet.filter.FilterConfig;
import javax.portlet.filter.PortletFilter;
import javax.portlet.filter.RenderFilter;
import javax.portlet.filter.RenderResponseWrapper;

import com.liferay.portal.kernel.util.PortletKeys;
import org.osgi.service.component.annotations.Component;

/**
 * @author Liferay
 */
@Component(
	immediate = true,
	property = "javax.portlet.name="+ PortletKeys.LOGIN,
	service = PortletFilter.class
)
public class ExampleRenderFilter implements RenderFilter {

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(RenderRequest request, RenderResponse response, FilterChain chain)
		throws IOException, PortletException {

		BufferedRenderResponseWrapper bufferedRenderResponseWrapper = new BufferedRenderResponseWrapper(response);

		chain.doFilter(request, bufferedRenderResponseWrapper);

		String text = bufferedRenderResponseWrapper.toString();
		text=text.replaceAll("@pruebas.com", "");
		response.getWriter().write(text);
	}

	@Override
	public void init(FilterConfig filterConfig) throws PortletException {
	}

}