import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {ClienteService} from "../cliente.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-cliente-form',
  templateUrl: './cliente-form.component.html',
  styleUrls: ['./cliente-form.component.css']
})
export class ClienteFormComponent implements OnInit {

  clienteForm: FormGroup;

  constructor(
    private fb: FormBuilder,
    private router: Router,
    private clienteService: ClienteService
  ) {
    this.clienteForm = this.fb.group({
      nome: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      telefone: ['', Validators.required]
    })
  }

  ngOnInit(): void {
  }

  salvarCliente(): void {
    if(this.clienteForm.valid) {
      this.clienteService.salvarCliente(this.clienteForm.value).subscribe(() => {
        console.log('Cliente salvo com sucesso.');
        this.router.navigate(['/clientes']);
      })
    }
  }
}
