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

public class InfoBoxModel {

	private String title;
	private String msg;
	private String url;
	private String urlTitle;

	public InfoBoxModel(String title, String msg, String url, String urlTitle) {
		this.title = title;
		this.msg = msg;
		this.url = url;
		this.urlTitle = urlTitle;
	}

	public String getTitle() {
		return title;
	}

	public String getMsg() {
		return msg;
	}

	public String getUrl() {
		return url;
	}

	public String getUrlTitle() {
		return urlTitle;
	}

}
