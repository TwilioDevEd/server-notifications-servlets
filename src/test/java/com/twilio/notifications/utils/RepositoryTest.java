package com.twilio.notifications.utils;

import com.twilio.notifications.models.Administrator;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RepositoryTest {
    @Test
    public void getAdministrators_ArrayOfAdministrators() {
        String filePath = getClass().getClassLoader().getResource("administrators.sample.json").getPath();
        Repository repository = new Repository(filePath);

        Administrator[] administrators = repository.getAdministrators();

        assertThat(administrators.length).isEqualTo(1);
        assertThat(administrators[0].getName()).isEqualTo("Bob");
        assertThat(administrators[0].getPhoneNumber()).isEqualTo("+12025550197");
    }
}
