import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import {Cliente} from "./cliente";

@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  private apiUrl = 'http://localhost:8080/api/clientes';

  constructor(private http: HttpClient) { }

  getClientes(): Observable<Cliente[]> {
    return this.http.get<any[]>(this.apiUrl);
  }

  salvarCliente(cliente: Cliente): Observable<Cliente[]> {
    return this.http.post<Cliente[]>(this.apiUrl, cliente);
  }
}
