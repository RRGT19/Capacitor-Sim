# capacitor-sim-info

This plugin gives access to information about the telephony services on the device.

## Install

```bash
npm install capacitor-sim-info
npx cap sync
```

## API

<docgen-index>

* [`getInfo()`](#getinfo)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### getInfo()

```typescript
getInfo() => Promise<SimInfo>
```

Return information about the telephony services on the device.

**Returns:** <code>Promise&lt;<a href="#siminfo">SimInfo</a>&gt;</code>

**Since:** 1.0.0

--------------------


### Interfaces


#### SimInfo

| Prop                | Type                |
| ------------------- | ------------------- |
| **`carrierId`**     | <code>number</code> |
| **`carrierIdName`** | <code>string</code> |
| **`countryIso`**    | <code>string</code> |
| **`operator`**      | <code>string</code> |
| **`operatorName`**  | <code>string</code> |

</docgen-api>
