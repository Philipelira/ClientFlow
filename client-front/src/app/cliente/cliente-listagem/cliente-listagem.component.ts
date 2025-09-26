import { Component, OnInit } from '@angular/core';
import {ClienteService} from "../cliente.service";
import {Cliente} from "../cliente";

@Component({
  selector: 'app-cliente-listagem',
  templateUrl: './cliente-listagem.component.html',
  styleUrls: ['./cliente-listagem.component.css']
})
export class ClienteListagemComponent implements OnInit {

  clientes: Cliente[] = [];

  constructor(private clienteService: ClienteService) { }

  ngOnInit(): void {
    this.carregarClientes();
  }

  carregarClientes(): void {
    this.clienteService.getClientes().subscribe({
      next: (dados) => {
        this.clientes = dados;
        console.log('Clientes carregados:', this.clientes);
      },
      error: (erro) => {
        console.error('Erro ao carregar clientes:', erro);
      }
    });
  }
}
