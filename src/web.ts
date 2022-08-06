import { WebPlugin } from '@capacitor/core';

import type { SimInfo, SimPlugin } from './definitions';

export class SimWeb extends WebPlugin implements SimPlugin {
  async getInfo(): Promise<SimInfo> {
    throw this.unimplemented('Not implemented on web.');
  }
}
