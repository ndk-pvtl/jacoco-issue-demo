package com.example.jacocoissuedemo.randomstuff;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.util.Collections.emptyList;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.mockito.Mockito.*;

@DisplayName("Random Service Test")
class RandomServiceTest {

    private RandomService randomService;
    private RandomRepository randomRepository;

    @BeforeEach
    void setUp() {
        randomRepository = mock(RandomRepository.class);
        this.randomService = new RandomService(randomRepository);
    }

    @DisplayName("Test saving stuff")
    @Test
    void testSavingStuff() {
        randomService.saveStuff();
        RandomEntity randomEntity = new RandomEntity("Random", "Entity", "Job");
        verify(randomRepository).save(randomEntity);
    }

    @DisplayName("Test loading stuff")
    @Test
    void testLoadingStuff() {
        when(randomRepository.findAll()).thenReturn(emptyList());
        assertThat(randomService.readStuff()).isEqualTo(emptyList());
    }
}