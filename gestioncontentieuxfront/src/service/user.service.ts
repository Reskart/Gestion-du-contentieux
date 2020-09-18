import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  URL = 'http://localhost:8080/apiUtilisateur';

  utilisateurs: any []=[];

  constructor(private http:HttpClient) { }

  getOne(id) {

    return this.http.get<any>(this.URL+'/utilisateur/'+id);
  }
  findAll() {
    return this.http.get<any[]>(this.URL+'/utilisateurs').pipe(map(value =>this.utilisateurs=value))
  }
}
