package eu.arrowhead.client.library.util;

public class ClientCommonConstants {
	
	//=================================================================================================
	// members

	public static final String CLIENT_SYSTEM_NAME = "client_system_name";
	public static final String $CLIENT_SYSTEM_NAME = "${" + CLIENT_SYSTEM_NAME + "}";
	public static final String CLIENT_SERVER_ADDRESS = "server.address";
	public static final String $CLIENT_SERVER_ADDRESS_WD = "${" + CLIENT_SERVER_ADDRESS + ": localhost" + "}";
	public static final String CLIENT_SERVER_PORT = "server.port";
	public static final String $CLIENT_SERVER_PORT_WD = "${" + CLIENT_SERVER_PORT + ": 8080" + "}";
	public static final String TOKEN_SECURITY_FILTER_ENABLED = "token.security.filter.enabled";
	public static final String $TOKEN_SECURITY_FILTER_ENABLED_WD = "${" + TOKEN_SECURITY_FILTER_ENABLED + ":true" + "}";
	public static final String CORE_SERVICE_DEFINITION_SUFFIX = "-ah.core";

	public static final String TOMCAT_WS_SSL_CONTEXT = "org.apache.tomcat.websocket.SSL_CONTEXT";
	public static final String WS_MANAGER_ID_PREFIX = "ws.manager.";
	
	//=================================================================================================
	// assistant methods

	//-------------------------------------------------------------------------------------------------
	private ClientCommonConstants() {
		throw new UnsupportedOperationException();
	}
}
