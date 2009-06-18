package org.bigbluebutton.conference.service.whiteboard

import org.red5.logging.Red5LoggerFactory

public class WhiteboardService {
	
	private static Logger log = Red5LoggerFactory.getLogger( WhiteboardService.class, "bigbluebutton" );
	
	private WhiteboardApplication application

	public String getWhiteboardMessages() {
		String roomName = Red5.connectionLocal.scope.name
		return application.getWhiteboardMessages(roomName)
	}
	
	public void sendMessage(String message) {
		String roomName = Red5.connectionLocal.scope.name
		application.sendMessage(roomName, message)
	}

	public void setWhiteboardApplication(WhiteboardApplication a) {
		log.debug("Setting Whiteboard Applications")
		application = a
	}

}