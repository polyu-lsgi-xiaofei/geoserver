/* (c) 2014 Open Source Geospatial Foundation - all rights reserved
 * (c) 2001 - 2013 OpenPlans
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package org.geoserver.ows;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

public class OWSHandlerMapping extends SimpleUrlHandlerMapping {
	@Override
	protected Object lookupHandler(String urlPath, HttpServletRequest request)
			throws Exception {
		Object h = super.lookupHandler(urlPath, request);
		if (h == null /* && AdvancedDispatch.isSet(getApplicationContext()) */) {
			// check for a workspace being specified in the request and strip it
			// off
			int i = urlPath.startsWith("/") ? 1 : 0;
			int j = urlPath.indexOf("/", i);
			if (j > i) {
				String first = urlPath.substring(i, j);
				String last = urlPath.substring(j);
				h = super.lookupHandler(last, request);
			}
		}
		return h;
	}
}
