package org.geoserver;

import java.util.Iterator;
import java.util.logging.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.geotools.util.logging.Logging;

public class GeoServerInitStartupListener implements ServletContextListener {

	/**
	 * Listens for GeoServer startup and tries to configure axis order, logging
	 * redirection, and a few other things that really need to be set up before
	 * anything else starts up
	 */

	private static final Logger LOGGER = Logging.getLogger("org.geospe.logging");

	boolean relinquishLoggingControl;

	private Iterator<Class<?>> products;

	private final static String COMPARISON_TOLERANCE_PROPERTY = "COMPARISON_TOLERANCE";

	private final static double DEFAULT_COMPARISON_TOLERANCE = 1e-9;

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
        // make sure we remember if GeoServer controls logging or not
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub

	}

}
