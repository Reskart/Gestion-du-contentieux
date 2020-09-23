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
import { AffaireAjoutComponent } from './affaire/affaire-ajout/affaire-ajout.component';
import { EncoursComponent } from './tableaubord/encours/encours.component';
import { AvenirComponent } from './tableaubord/avenir/avenir.component';
import { ArchiveComponent } from './tableaubord/archive/archive.component';
import { DocumentComponent} from './document/document.component';

const routes: Routes = [
  {path : '', component:AccueilComponent},
  {path : 'user', component:UserComponent, children:[{path:'form', component:UserFormComponent},{path:'list', component:UserListComponent}]},
  {path: 'affaire', component:AffaireComponent, children: [
    {path : 'recherche', component:AffaireRechercheComponent},
    {path: 'accueil', component: AffaireAccueilComponent},
    {path: 'ajout', component: AffaireAjoutComponent},
    {path: 'edit/:id', component: AffaireAjoutComponent}
  ]},
  {path: 'document/:id', component: DocumentComponent},

  
  {path:'TDB', component:TableaubordComponent},
  {path:'tribunaux', component:TribunauxComponent},
  {path:'TDB/encours',component:EncoursComponent},
  {path:'TDB/avenir',component:AvenirComponent},
  {path:'TDB/archive',component:ArchiveComponent},
  {path:'tache', component:TacheComponent},
  {path:'tache/ajout-tache', component:AjoutTacheComponent},
  {path:'tribunaux', component:TribunauxComponent},
  {path:'tache/calendrier', component:CalendrierComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }