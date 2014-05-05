/**Copyright (C) 2013 Thomas Maher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.jimsuplee.femaleastronauts;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageAndTextAdapter extends ArrayAdapter<String> {

	private LayoutInflater mInflater;
	
	private String[] mStrings;
	private TypedArray mIcons;
	
	private int mViewResourceId;
	
	public ImageAndTextAdapter(Context ctx, int viewResourceId,
			String[] strings, TypedArray icons) {
		super(ctx, viewResourceId, strings);
		
		mInflater = (LayoutInflater)ctx.getSystemService(
				Context.LAYOUT_INFLATER_SERVICE);
		
		mStrings = strings;
		mIcons = icons;
		
		mViewResourceId = viewResourceId;
	}

	@Override
	public int getCount() {
		return mStrings.length;
	}

	@Override
	public String getItem(int position) {
		return mStrings[position];
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		convertView = mInflater.inflate(mViewResourceId, null);
		
		ImageView iv = (ImageView)convertView.findViewById(R.id.option_icon);
		iv.setImageDrawable(mIcons.getDrawable(position));

		TextView tv = (TextView)convertView.findViewById(R.id.option_text);
		tv.setText(mStrings[position]);
		
		return convertView;
	}
}
