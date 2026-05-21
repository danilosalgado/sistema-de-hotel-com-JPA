package com.hotel.controller;
import com.hotel.entity.Reserva;
import com.hotel.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/reservas")
public class ReservaController {
    @Autowired
    private ReservaRepository repository;
    @PostMapping
    public Reserva salvar(@RequestBody Reserva reserva) {
        return repository.save(reserva);
    }
    @GetMapping
    public List<Reserva> buscarPorEmail(@RequestParam String email) {
        return repository.findByEmail(email);
    }
    @PutMapping("/{id}")
    public Reserva atualizar(@PathVariable Integer id, @RequestBody Reserva nova) {
        Reserva reserva = repository.findById(id).orElseThrow();
        reserva.setNome(nova.getNome());
        reserva.setSexo(nova.getSexo());
        reserva.setEmail(nova.getEmail());
        reserva.setDataChegada(nova.getDataChegada());
        reserva.setNumeroNoites(nova.getNumeroNoites());
        reserva.setNumeroHospedes(nova.getNumeroHospedes());
        reserva.setMensagem(nova.getMensagem());
        return repository.save(reserva);
    }
    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Integer id) {
        repository.deleteById(id);
        return "Reserva deletada com sucesso!";
    }
}
