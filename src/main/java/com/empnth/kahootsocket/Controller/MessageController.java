package com.empnth.kahootsocket.Controller;

import com.empnth.kahootsocket.Model.MessageModel;
import com.empnth.kahootsocket.Storage.UserStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MessageController {

    @Autowired
    private SimpMessagingTemplate simpMess;

    @MessageMapping("/chat/{to}")
    public void sendMessage(@DestinationVariable String to, MessageModel message) {
        System.out.println("handling send message " + message + " to " + to);
        boolean isExist = UserStorage.getInstance().getUsers().contains(to);
        if (isExist) {
            simpMess.convertAndSend("/topic/messages/"+to,message);

        }
    }
}
