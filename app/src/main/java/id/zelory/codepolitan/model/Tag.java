/*
 * Copyright (c) 2015 Zelory.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package id.zelory.codepolitan.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by zetbaitsu on 7/28/15.
 */
public class Tag implements Parcelable
{
    private String name;
    private String slug;

    protected Tag(Parcel in)
    {
        name = in.readString();
        slug = in.readString();
    }

    public static final Creator<Tag> CREATOR = new Creator<Tag>()
    {
        @Override
        public Tag createFromParcel(Parcel in)
        {
            return new Tag(in);
        }

        @Override
        public Tag[] newArray(int size)
        {
            return new Tag[size];
        }
    };

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSlug()
    {
        return slug;
    }

    public void setSlug(String slug)
    {
        this.slug = slug;
    }

    @Override
    public String toString()
    {
        return name;
    }

    @Override
    public int describeContents()
    {
        return hashCode();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags)
    {
        dest.writeString(name);
        dest.writeString(slug);
    }
}
