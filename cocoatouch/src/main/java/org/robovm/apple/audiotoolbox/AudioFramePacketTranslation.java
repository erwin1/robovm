/*
 * Copyright (C) 2013-2015 Trillian Mobile AB
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
package org.robovm.apple.audiotoolbox;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AudioFramePacketTranslation/*</name>*/ 
    extends /*<extends>*/Struct<AudioFramePacketTranslation>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AudioFramePacketTranslationPtr extends Ptr<AudioFramePacketTranslation, AudioFramePacketTranslationPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AudioFramePacketTranslation() {}
    public AudioFramePacketTranslation(long mFrame, long mPacket, int mFrameOffsetInPacket) {
        this.setMFrame(mFrame);
        this.setMPacket(mPacket);
        this.setMFrameOffsetInPacket(mFrameOffsetInPacket);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native long getMFrame();
    @StructMember(0) public native AudioFramePacketTranslation setMFrame(long mFrame);
    @StructMember(1) public native long getMPacket();
    @StructMember(1) public native AudioFramePacketTranslation setMPacket(long mPacket);
    @StructMember(2) public native int getMFrameOffsetInPacket();
    @StructMember(2) public native AudioFramePacketTranslation setMFrameOffsetInPacket(int mFrameOffsetInPacket);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
