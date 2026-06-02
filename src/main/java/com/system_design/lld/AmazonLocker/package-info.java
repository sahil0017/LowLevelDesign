package com.system_design.lld.AmazonLocker;
/**
 * class Locker:
 *     - compartments: Compartment[]
 *     - accessTokenMapping: Map<string, AccessToken>
 *
 *     + Locker(compartments)
 *     + depositPackage(size) -> string | error
 *     + pickup(tokenCode) -> void | error
 *     + openExpiredCompartments() -> void
 *
 * class AccessToken:
 *     - code: string
 *     - expiration: timestamp
 *     - compartment: Compartment
 *
 *     + AccessToken(code, expiration, compartment)
 *     + isExpired() -> boolean
 *     + getCompartment() -> Compartment
 *     + getCode() -> string
 *
 * class Compartment:
 *     - size: Size
 *     - occupied: boolean
 *
 *     + Compartment(size)
 *     + getSize() -> Size
 *     + isOccupied() -> boolean
 *     + markOccupied() -> void
 *     + markFree() -> void
 *     + open() -> void
 *
 * enum Size:
 *     SMALL
 *     MEDIUM
 *     LARGE
 */