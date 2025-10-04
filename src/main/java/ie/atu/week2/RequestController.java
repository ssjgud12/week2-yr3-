package ie.atu.week2;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.apache.el.lang.ELArithmetic.*;
import static org.apache.el.lang.ELArithmetic.divide;

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

    @GetMapping ("/Calculate")
    public Calculator getCalculator (@RequestParam int x, @RequestParam int y, @RequestParam String op, int z)
    {
        switch(op)
        {
            case "add":
                z = x+y;
                break;

            case "Subtract":
               z = x - y;
                break;

            case "Multiply":
                z = x * y;
                break;

            case "Divide":
                if (y == 0)
                {
                    throw new ArithmeticException("Divide by zero");
                }
                z = x / y;
                break;
        }

        return new Calculator (x, y, z);
    }



}
