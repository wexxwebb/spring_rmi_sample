package service;

import org.springframework.stereotype.Service;

@Service
public class PhoneServiceImpl implements PhoneService{
    @Override
    public String getPhone() {
        return "+7-909-245-75-64";
    }

    @Override
    public Operator getDescription() {
        Operator kamilla = new Operator();
        kamilla.setAge(23);
        kamilla.setName("Kamila");
        kamilla.setSize(3);
        kamilla.setPhone("+8-800-555-45-55");

        return kamilla;
    }
}
