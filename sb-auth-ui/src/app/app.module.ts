import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';

import { MenubarModule, MenuItem} from 'primeng/primeng';


import { MenuComponent } from './menu/menu.component';
import {AppRoutes} from "./app.routes";
import { LoginComponent} from './login/login.component';



@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    LoginComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutes,
    MenubarModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }


// , AppRoutes,   LoginComponent,   MenuComponent
