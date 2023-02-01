package facade;

public class Hello {

    public String sayHello(String[] names) {

        if(names[0] == null) {
            return "Hello, my friend";
        }
        if(names[0].equals(names[0].toUpperCase())) {
            return "HELLO, " + names[0];
        }
        if(names.length == 2) {
            return "Hello, " + String.join(" and ", names);
        }
        if(names.length > 2) {
            String last = names[names.length - 1];
            names[names.length - 1] = "and " + last;

            for (int i = 0; i < names.length; i++) {
                if(names[i].equals(names[i].toUpperCase())) {

                    return "Hello, " + String.join(", ", names) + ". AND HELLO " + names[i]+"!";
                }
            }
            return "Hello, " + String.join(", ", names);
        }



        return "Hello, " + names[0];
    }
}
