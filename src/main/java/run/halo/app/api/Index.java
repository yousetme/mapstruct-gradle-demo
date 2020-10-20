package run.halo.app.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import run.halo.app.mapstruct.DemoCopier;
import run.halo.app.mapstruct.dto.User2Dto;
import run.halo.app.mapstruct.dto.UserDto;

@Component
public class Index {
    @Autowired
    private DemoCopier demoCopier;

    public void convert() {
        User2Dto to = demoCopier.to(new UserDto());
        System.out.println(to);
    }
}
