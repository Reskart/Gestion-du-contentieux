import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AccueilComponent } from './accueil/accueil.component';
import { AffaireComponent } from './affaire/affaire.component';
import { TableaubordComponent } from './tableaubord/tableaubord.component';
import { TacheComponent } from './tache/tache.component';
import { TribunauxComponent } from './tribunaux/tribunaux.component';
import { UserComponent } from './user/user.component';

const routes: Routes = [
  {path : '', component:AccueilComponent},
  {path : 'user', component:UserComponent},
  {path: 'affaire', component:AffaireComponent},
  {path:'TDB', component:TableaubordComponent},
  {path:'tache', component:TacheComponent},
  {path:'tribunaux', component:TribunauxComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
