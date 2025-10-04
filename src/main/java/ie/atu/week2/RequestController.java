package ie.atu.week2;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping



public class RequestController
{
    @GetMapping("/Good Morning World")
    public String hello()
    {
        return "Good Morning World";
    }


    @GetMapping("/greet/{Alvin}")
    public String greet(@PathVariable String name)
    {
        return "Hello " + name + "!";
    }

    @GetMapping ("/details")
    public String details(@RequestParam String name, @RequestParam int age)
    {
        return "Name: " + name + " Age : " + age;
    }

    @GetMapping ("/person")
    public Person getPerson ()
    {
        return new Person ("Olayemi", 67);
    }

    @GetMapping ("/Addition")
    public Calculator getCalculator (int x, int y, int z)
    {
        return new Calculator (x, y, z);
    }



}
