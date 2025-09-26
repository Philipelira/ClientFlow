import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ClienteListagemComponent} from "./cliente/cliente-listagem/cliente-listagem.component";
import {ClienteFormComponent} from "./cliente/cliente-form/cliente-form.component";

const routes: Routes = [
  {path: 'clientes', component: ClienteListagemComponent},
  {path: 'clientes/novo', component: ClienteFormComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
