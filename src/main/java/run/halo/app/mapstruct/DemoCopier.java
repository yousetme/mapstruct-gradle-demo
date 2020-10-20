package run.halo.app.mapstruct;

import org.mapstruct.Mapper;
import run.halo.app.mapstruct.dto.User2Dto;
import run.halo.app.mapstruct.dto.UserDto;


/**
 *
 */
@Mapper(componentModel = "spring")
public interface DemoCopier extends ObjectCopier<UserDto, User2Dto> {
}
