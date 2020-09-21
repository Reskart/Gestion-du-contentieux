import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AccueilComponent } from './accueil/accueil.component';
import { AffaireAccueilComponent } from './affaire/affaire-accueil/affaire-accueil.component';
import { AffaireRechercheComponent } from './affaire/affaire-recherche/affaire-recherche.component';
import { AffaireComponent } from './affaire/affaire.component';
import { TableaubordComponent } from './tableaubord/tableaubord.component';
import { TacheComponent } from './tache/tache.component';
import { TribunauxComponent } from './tribunaux/tribunaux.component';
import { UserFormComponent } from './user/user-form/user-form.component';
import { UserListComponent } from './user/user-list/user-list.component';
import { UserComponent } from './user/user.component';
import { AjoutTacheComponent } from './tache/ajout-tache/ajout-tache.component';
import { CalendrierComponent } from './tache/calendrier/calendrier.component';

const routes: Routes = [
  {path : '', component:AccueilComponent},
  {path : 'user', component:UserComponent, children:[{path:'form', component:UserFormComponent},{path:'list', component:UserListComponent}]},
  {path: 'affaire', component:AffaireComponent, children: [
    {path : 'recherche', component:AffaireRechercheComponent},
    {path: 'accueil', component: AffaireAccueilComponent}
  ]},

  
  {path:'TDB', component:TableaubordComponent},
  {path:'tache', component:TacheComponent, children: [{path:'ajout-tache', component:AjoutTacheComponent}]},
  {path:'tribunaux', component:TribunauxComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }