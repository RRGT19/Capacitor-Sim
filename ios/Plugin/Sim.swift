import Foundation
import CoreTelephony

@objc public class Sim: NSObject {

    @objc public func getSimCarrierId() -> Int {
        return 1
    }

    @objc public func getSimCarrierIdName() -> String {
        return "String"
    }

    @objc public func getSimCountryIso() -> String {
        return "String"
    }

    @objc public func getSimOperator() -> String {
        return "String"
    }

    @objc public func getSimOperatorName() -> String {
        return "String"
    }
}
