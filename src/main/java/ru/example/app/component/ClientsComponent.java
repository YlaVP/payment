package ru.example.app.component;

import com.sun.security.ntlm.Client;
import org.springframework.stereotype.Component;

import java.util.ArrayList;


@Component
// будет бин для организации коллекции клиентов


public class ClientsComponent {

        private final ArrayList<Client> clients = new ArrayList<>();
    }



