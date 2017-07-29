/**
 * Created by zskucsak on 29/07/2017.
 */

import { Component } from '@angular/core'


@Component ( {

  selector: 'navi-bar',
  template: `
    <div class="top-bar">
      <div class="top-bar-title">SB-Auth</div>
      <div>
        <ul class="menu">
          <li class="nav-menu"><a href="#">Menu 1</a> </li>
        </ul>
      </div>
    </div>
  `,
  styleUrls: [ './navbar.component.css']
})
export  class NavComponent {}



