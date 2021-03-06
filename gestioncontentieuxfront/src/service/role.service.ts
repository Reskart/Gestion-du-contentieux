import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class RoleService {

  URL = 'http://localhost:8080/apiRole';

  roles:any[]=[];

  constructor(private http:HttpClient) { }

  findAll(){
    return this.http.get<any[]>(this.URL+'/roles').pipe(map(value =>this.roles=value))
  }
}
