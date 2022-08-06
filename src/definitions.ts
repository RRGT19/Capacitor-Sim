export interface SimPlugin {
  /**
   * Return information about the telephony services on the device.
   *
   * @since 1.0.0
   */
  getInfo(): Promise<SimInfo>;
}

export interface SimInfo {
  carrierId?: number;
  carrierIdName?: string;
  countryIso?: string;
  operator?: string;
  operatorName?: string;
}