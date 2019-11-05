package guru.springframework.converters;

import guru.springframework.domain.UserCommand;
import guru.springframework.entities.User;
import guru.springframework.entities.User.UserBuilder;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-11-05T16:27:17-0500",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.3 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserCommand userToUserCommand(User user) {
        if ( user == null ) {
            return null;
        }

        UserCommand userCommand = new UserCommand();

        userCommand.setFirstName( user.getFirstName() );
        userCommand.setLastName( user.getLastName() );
        userCommand.setEmail( user.getEmail() );

        return userCommand;
    }

    @Override
    public User userCommandToUser(UserCommand userCommand) {
        if ( userCommand == null ) {
            return null;
        }

        UserBuilder user = User.builder();

        user.firstName( userCommand.getFirstName() );
        user.lastName( userCommand.getLastName() );
        user.email( userCommand.getEmail() );

        return user.build();
    }
}
