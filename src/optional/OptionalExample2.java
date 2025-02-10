package optional;

import java.util.Optional;

public class OptionalExample2 {
    public static void main(String[] args) {
        User user = new User();
        user.setName("John");
        Details details = new Details();
        details.setId(123);
        details.setName("Greg");
        //user.setDetails(details);
        System.out.println(Optional.ofNullable(user)
                .map(User::getDetails)
                .map(Details::getId).orElse(10));
    }
}
