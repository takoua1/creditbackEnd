package com.banque.credit.client;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/profile")
public class ClientController {

    @Autowired
    ClientReppository clientReppository;

    @PostMapping("/add")
    public Client addProfile(@Valid @RequestBody Client client)
    {
        return (clientReppository.save(client));
    }
}
