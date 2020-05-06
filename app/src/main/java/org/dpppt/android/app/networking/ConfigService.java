/*
 * Copyright (c) 2020 Ubique Innovation AG <https://www.ubique.ch>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * SPDX-License-Identifier: MPL-2.0
 */
package org.dpppt.android.app.networking;

import org.dpppt.android.app.networking.models.ConfigResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ConfigService {

	@Headers("Accept: application/json")
	@GET("v1/config")
	Call<ConfigResponseModel> getConfig(
			@Query("appversion") String appVersion,
			@Query("osversion") String osVersion,
			@Query("buildnr") String buildNumber
	);

}
