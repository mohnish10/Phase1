import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ContactusComponent } from './contactus/contactus.component';
import { RegisterComponent } from './register/register.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { UserlistComponent } from './userlist/userlist.component';

const routes: Routes = [
{path:'',redirectTo:"home",pathMatch:'full'},
{path:'home',component:HomeComponent},
{path:'contactus',component:ContactusComponent},
{path:'register',component:RegisterComponent},
{path:'list',component:UserlistComponent},
{path:'**',component:PageNotFoundComponent},


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }