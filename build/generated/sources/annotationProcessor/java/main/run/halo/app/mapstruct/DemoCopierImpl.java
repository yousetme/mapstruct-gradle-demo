package run.halo.app.mapstruct;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import run.halo.app.mapstruct.dto.User2Dto;
import run.halo.app.mapstruct.dto.UserDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-20T14:49:45+0800",
    comments = "version: 1.4.1.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-5.6.2.jar, environment: Java 1.8.0_121 (Oracle Corporation)"
)
@Component
public class DemoCopierImpl implements DemoCopier {

    @Override
    public User2Dto to(UserDto source) {
        if ( source == null ) {
            return null;
        }

        User2Dto user2Dto = new User2Dto();

        user2Dto.setUserName( source.getUserName() );

        return user2Dto;
    }

    @Override
    public List<User2Dto> to(Collection<UserDto> source) {
        if ( source == null ) {
            return null;
        }

        List<User2Dto> list = new ArrayList<User2Dto>( source.size() );
        for ( UserDto userDto : source ) {
            list.add( to( userDto ) );
        }

        return list;
    }

    @Override
    public void existTo(UserDto source, User2Dto target) {
        if ( source == null ) {
            return;
        }

        target.setUserName( source.getUserName() );
    }

    @Override
    public UserDto from(User2Dto source) {
        if ( source == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setUserName( source.getUserName() );

        return userDto;
    }

    @Override
    public List<UserDto> from(Collection<User2Dto> source) {
        if ( source == null ) {
            return null;
        }

        List<UserDto> list = new ArrayList<UserDto>( source.size() );
        for ( User2Dto user2Dto : source ) {
            list.add( from( user2Dto ) );
        }

        return list;
    }

    @Override
    public void existFrom(User2Dto source, UserDto target) {
        if ( source == null ) {
            return;
        }

        target.setUserName( source.getUserName() );
    }
}
