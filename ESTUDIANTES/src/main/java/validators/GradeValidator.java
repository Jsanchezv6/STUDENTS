package validators;



import com.springbootcrud.springboot.models.Grade;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class GradeValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Grade.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        // Validaciones personalizadas para la entidad Grade
    }
}
