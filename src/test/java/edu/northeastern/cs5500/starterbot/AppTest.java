package edu.northeastern.cs5500.starterbot;

import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void testGetBotToken() {
        assertThat(App.getBotToken()).isNotNull();
    }
}
