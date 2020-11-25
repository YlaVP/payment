package ru.exapmple.component;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

// будет бин для организации коллекции клиентов
@Component
public class ClientsComponent<Client> {

    private final ArrayList<Client> clients = new ArrayList<>();
}
