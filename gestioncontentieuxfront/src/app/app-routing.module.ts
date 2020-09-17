import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AffaireComponent } from './affaire/affaire.component';

const routes: Routes = [

  { path: 'affaire', component: AffaireComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
