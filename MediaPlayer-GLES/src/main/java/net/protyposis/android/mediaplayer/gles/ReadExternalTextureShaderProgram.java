/*
 * Copyright (c) 2014 Mario Guggenberger <mg@protyposis.net>
 *
 * This file is part of MediaPlayer-Extended.
 *
 * MediaPlayer-Extended is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MediaPlayer-Extended is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MediaPlayer-Extended.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.protyposis.android.mediaplayer.gles;

import android.opengl.GLES20;

/**
 * Created by maguggen on 04.07.2014.
 */
public class ReadExternalTextureShaderProgram extends TextureShaderProgram {

    public ReadExternalTextureShaderProgram() {
        super("fs_texture_readexternal.s");
    }

    public void setTexture(ExternalSurfaceTexture texture) {
        GLES20.glUniformMatrix4fv(mSTMatrixHandle, 1, false, texture.getTransformMatrix(), 0);
    }
}
