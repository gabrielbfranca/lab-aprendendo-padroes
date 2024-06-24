package com.diopratica.padraoprojetopratica.services;

import com.diopratica.padraoprojetopratica.model.Cliente;
import com.diopratica.padraoprojetopratica.model.Endereco;
import com.diopratica.padraoprojetopratica.model.repo.ClienteRepository;
import com.diopratica.padraoprojetopratica.service.ClienteService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestClienteService {
    @MockBean
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteService clienteService;

    @Test
    public void testBuscarTodos() {
        // Mock a list of Cliente objects
        Endereco endereco1 = new Endereco();
        Endereco endereco2 = new Endereco();
        List<Cliente> mockClientes = Arrays.asList(
                new Cliente(1L, "John Doe", endereco1),
                new Cliente(2L, "Jane Doe", endereco2)
        );

        // Mock repository behavior
        Mockito.when(clienteRepository.findAll()).thenReturn(mockClientes);

        // Call the service method
        Iterable<Cliente> retrievedClientes = clienteService.buscarTodos();

        // Assertions
        assertNotNull(retrievedClientes);
        int count = 0;
        for (Cliente cliente : retrievedClientes) {
            count++;
        }
        assertEquals(2, count); // Verify number of retrieved clientes
    }
}
