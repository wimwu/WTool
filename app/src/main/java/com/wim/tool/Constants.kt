/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.wim.tool

/**
 * Constants used throughout the app.
 */
const val DATABASE_NAME = "kReading-db"
const val ARRAY_SPLIT = ","

/**
 * MMKV
 */
const val USER = "user"
const val USER_ID = "userId"

/**
 * LeanCloud
 */
const val LEAN_CLOUD_APP_ID = "5cskTAnlz8UvGmAkDSHXgyWu-gzGzoHsz"

const val LEAN_CLOUD_X_LC_ID = "X-LC-Id"
const val LEAN_CLOUD_X_LC_SIGN = "X-LC-Sign"
const val LEAN_CLOUD_X_LC_SESSION = "X-LC-Session"
/**
 * https://leancloud.cn/docs/rest_api.html#hash-1794863242
 * 计算方式：md5(timestamp+MasterKey)，这里时间戳为1000
 */
const val LEAN_CLOUD_X_LC_SIGN_VALUE = "9b5de08976706d31cbbc5047e5b7c1b2,1000,master"

/**
 * REST API 服务器地址
 */
const val LEAN_CLOUD_SERVICE_URL = "https://5csktanl.lc-cn-n1-shared.com"

/**
 * REST API 版本
 */
const val LEAN_CLOUD_VERSION = "/1.1/"
const val LEAN_CLOUD_REST_URL = LEAN_CLOUD_SERVICE_URL + LEAN_CLOUD_VERSION

/**
 * 用户模块
 */
const val LEAN_CLOUD_MODULE_USER = "users"


