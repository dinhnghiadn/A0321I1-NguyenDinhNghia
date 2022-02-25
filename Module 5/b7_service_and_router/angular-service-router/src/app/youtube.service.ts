import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class YoutubeService {

  playlist = [
    {id: 'rDwiCm9CVrk', song: '[Arknights BGM] CC#5 Spectrum: Lobby Theme'},
    {id: '8cle4sQutp4', song: '[Arknights OST] Nearl The Radiant Knight Theme Song - Radiant (by Mary Clare)'},
    {id: 'IxszlJppRQI', song: 'Ne-Yo - So Sick'},
    {id: '6J1-eYBbspA', song: 'David Archuleta - Crush'},
    {id: '4fndeDfaWCg', song: 'Backstreet Boys - I Want It That Way'}
  ];
  constructor() { }
  find(id: string) {
    return this.playlist.find(item => item.id === id);
  }
}
