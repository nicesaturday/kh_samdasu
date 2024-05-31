package com.samdasu.crtl;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.RemoteEndpoint.Basic;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;import org.springframework.web.bind.support.SessionStatus;

@Controller
@ServerEndpoint("/socket")
public class SocketController {
	private static final List<Session> sessionList = new ArrayList<Session>();
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	//같은 세션 값을 가지고 있는지만 확인하면 된다.
	//방을 파는 개념으로 생각하면 안됨. 
	public SocketController() {
		log.info("Created Socket");
	}
	
	@GetMapping("/")
	public String viewPage() {
		return "socket/test";
	}
	
	@OnOpen
	public void onOpen(Session session) {
		log.info("Open Session : " + session.getId());
		try {
			final Basic basic = session.getBasicRemote();
			basic.sendText("채팅 서버 연결 성공");
		} catch (Exception e) {
			log.info(e.getMessage());
		}
		sessionList.add(session);
	}
	
	@OnMessage
	public void onMessage(String message, Session session) {
		try {
			final Basic basic = session.getBasicRemote();
			basic.sendText("변경 완료");
		} catch (Exception e) {
			log.info(e.getMessage());
		}
		sessionList.add(session);
	}
	
	@OnError
	public void OnError(Throwable t , Session session) {
		log.info(t.getMessage() + "by Session :" + session.getId());
	}
	
	//나가는 사람있으면 알아서 세션 제거해줌.
	@OnClose
	public void onClose(Session session) {
		log.info("Session : " + session.getId() + "closed");
	}
	
	
	private void sendAllSessionToMessage(Session self , String msg) {
		try {
			for(Session s : SocketController.sessionList) {
				if(!self.getId().equals(s.getId())) {
					s.getBasicRemote();
				}
			}
		} catch (Exception e) {
			log.info(e.getMessage());
		}
	}
	
}
