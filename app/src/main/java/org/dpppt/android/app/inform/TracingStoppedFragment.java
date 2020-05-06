/*
 * Copyright (c) 2020 Ubique Innovation AG <https://www.ubique.ch>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * SPDX-License-Identifier: MPL-2.0
 */
package org.dpppt.android.app.inform;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.dpppt.android.app.R;

public class TracingStoppedFragment extends Fragment {

	public static TracingStoppedFragment newInstance() {
		return new TracingStoppedFragment();
	}

	public TracingStoppedFragment() {
		super(R.layout.fragment_tracing_stopped);
	}

	@Override
	public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		((InformActivity) requireActivity()).allowBackButton(false);
		view.findViewById(R.id.inform_end_tracing_button_continue).setOnClickListener(v -> {
			getParentFragmentManager().beginTransaction()
					.setCustomAnimations(R.anim.slide_enter, R.anim.slide_exit, R.anim.slide_pop_enter, R.anim.slide_pop_exit)
					.replace(R.id.inform_fragment_container, GetWellFragment.newInstance())
					.commit();
		});
	}

}
