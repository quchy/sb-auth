import {ModuleWithProviders} from "@angular/core";

import {Routes, RouterModule} from '@angular/router';

import { LoginComponent } from "./login/login.component";


export const routes: Routes = [
  {path: '', component: LoginComponent, pathMatch: 'full'},
  {path: '**', redirectTo: ''}
];

export const AppRoutes: ModuleWithProviders = RouterModule.forRoot(routes, { enableTracing: false });


