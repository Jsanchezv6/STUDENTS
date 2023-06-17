package validators;



import com.springbootcrud.springboot.models.Course;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class CourseValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Course.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        // Validaciones personalizadas para la entidad Course
    }
}
