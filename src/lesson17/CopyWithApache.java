package lesson17;

import com.google.common.io.Files;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CopyWithApache implements CopyUtils{

    @Override
    public void copy(String from, String to) throws IOException {

        File copyAp = new File(from);
        File copyTo = new File(to);

        FileUtils.copyFile(copyAp,copyTo);

    }
}
