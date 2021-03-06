/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceTypeConfig  extends AbstractModel{

    /**
    * 可用区。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例机型。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例机型系列。
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * GPU核数，单位：核。
    */
    @SerializedName("GPU")
    @Expose
    private Integer GPU;

    /**
    * CPU核数，单位：核。
    */
    @SerializedName("CPU")
    @Expose
    private Integer CPU;

    /**
    * 内存容量，单位：`GB`。
    */
    @SerializedName("Memory")
    @Expose
    private Integer Memory;

    /**
     * 获取可用区。
     * @return Zone 可用区。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区。
     * @param Zone 可用区。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取实例机型。
     * @return InstanceType 实例机型。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * 设置实例机型。
     * @param InstanceType 实例机型。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * 获取实例机型系列。
     * @return InstanceFamily 实例机型系列。
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * 设置实例机型系列。
     * @param InstanceFamily 实例机型系列。
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * 获取GPU核数，单位：核。
     * @return GPU GPU核数，单位：核。
     */
    public Integer getGPU() {
        return this.GPU;
    }

    /**
     * 设置GPU核数，单位：核。
     * @param GPU GPU核数，单位：核。
     */
    public void setGPU(Integer GPU) {
        this.GPU = GPU;
    }

    /**
     * 获取CPU核数，单位：核。
     * @return CPU CPU核数，单位：核。
     */
    public Integer getCPU() {
        return this.CPU;
    }

    /**
     * 设置CPU核数，单位：核。
     * @param CPU CPU核数，单位：核。
     */
    public void setCPU(Integer CPU) {
        this.CPU = CPU;
    }

    /**
     * 获取内存容量，单位：`GB`。
     * @return Memory 内存容量，单位：`GB`。
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * 设置内存容量，单位：`GB`。
     * @param Memory 内存容量，单位：`GB`。
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "GPU", this.GPU);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);

    }
}

