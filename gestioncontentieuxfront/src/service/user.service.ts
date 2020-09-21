import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  URL = 'http://localhost:8080/apiUtilisateur';

  utilisateurs: any []=[];
  utilisateur:any;

  constructor(private http:HttpClient) { }

  getOne(id) {

    return this.http.get<any>(this.URL+'/utilisateur/'+id);
  }
  getName(name) {

    return this.http.get<any>(this.URL+'/utilisateurName/'+name);
  }
  findAll() {
    return this.http.get<any[]>(this.URL+'/utilisateurs').pipe(map(value =>this.utilisateurs=value))
  }
  add(user){
    return this.http.post(this.URL+'/add',user,{observe:'response'});
  }
}
