import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  URL = 'http://localhost:8080/apiUtilisateur'

  constructor() { }
}
