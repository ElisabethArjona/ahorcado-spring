package com.babel.ahorcado.applications;

import com.babel.ahorcado.services.IUserManagerService;
import org.springframework.stereotype.Component;

@Component
public class AhorcadoApp {
    private final IUserManagerService iUserManagerService;


    public AhorcadoApp(IUserManagerService iUserManagerService) {
        this.iUserManagerService = iUserManagerService;
    }

    public void run(){
        int optionUser;

        do {
            optionUser = iUserManagerService.menu();
            switch (optionUser) {
                case 1 -> {
                    iUserManagerService.play();
                }
                case 2 -> {
                }
            }
        } while (optionUser != 2);
    }
}
