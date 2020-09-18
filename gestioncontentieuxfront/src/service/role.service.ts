import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RoleService {

  URL = 'http://localhost:8080/apiRole'

  constructor() { }
}
