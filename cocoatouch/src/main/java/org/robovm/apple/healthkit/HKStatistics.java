/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.healthkit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKStatistics/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HKStatisticsPtr extends Ptr<HKStatistics, HKStatisticsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKStatistics.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public HKStatistics() {}
    protected HKStatistics(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "quantityType")
    public native HKQuantityType getQuantityType();
    @Property(selector = "startDate")
    public native NSDate getStartDate();
    @Property(selector = "endDate")
    public native NSDate getEndDate();
    @Property(selector = "sources")
    public native NSArray<HKSource> getSources();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "averageQuantityForSource:")
    public native HKQuantity getAverageQuantityForSource(HKSource source);
    @Method(selector = "averageQuantity")
    public native HKQuantity getAverageQuantity();
    @Method(selector = "minimumQuantityForSource:")
    public native HKQuantity getMinimumQuantityForSource(HKSource source);
    @Method(selector = "minimumQuantity")
    public native HKQuantity getMinimumQuantity();
    @Method(selector = "maximumQuantityForSource:")
    public native HKQuantity getMaximumQuantityForSource(HKSource source);
    @Method(selector = "maximumQuantity")
    public native HKQuantity getMaximumQuantity();
    @Method(selector = "sumQuantityForSource:")
    public native HKQuantity getSumQuantityForSource(HKSource source);
    @Method(selector = "sumQuantity")
    public native HKQuantity getSumQuantity();
    /*</methods>*/
}