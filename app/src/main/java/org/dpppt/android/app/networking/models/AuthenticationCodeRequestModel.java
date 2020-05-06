/*
 * Copyright (c) 2020 Ubique Innovation AG <https://www.ubique.ch>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * SPDX-License-Identifier: MPL-2.0
 */
package org.dpppt.android.app.networking.models;

import androidx.annotation.Keep;

public class AuthenticationCodeRequestModel {

	@Keep
	private String authorizationCode;
	@Keep
	private int fake;

	public AuthenticationCodeRequestModel(String authorizationCode, int fake) {
		this.authorizationCode = authorizationCode;
		this.fake = fake;
	}

}
