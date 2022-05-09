package pp.developer.democamera

import android.Manifest

object Constants {
    const val TAG="Demo Camara"
    const val FILE_NAME_FORMAT = "yyyy-MM-dd_HH-mm-ss.SSS"
    const val REQUEST_CODE_PERMISSION = 123
    val REQUIRED_PERMISSION = arrayOf(Manifest.permission.CAMERA)
}