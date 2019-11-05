package guru.springframework.converters;

import guru.springframework.domain.UserCommand;
import guru.springframework.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Created by rfh on 11/5/2019
 */
@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserCommand userToUserCommand(User user);

    User userCommandToUser(UserCommand userCommand);
}
