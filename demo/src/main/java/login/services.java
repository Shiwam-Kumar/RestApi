package login;

import org.springframework.stereotype.Service;
@Service
public class services {
        public boolean validate( String id, String password)
        {
            return (id.equals("kumarshiwam8@gmail.com")) && (password.equals("shiwam@karn"));
        }
}
