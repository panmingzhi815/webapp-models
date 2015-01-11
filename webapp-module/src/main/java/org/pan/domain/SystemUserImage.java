package org.pan.domain;

import javax.persistence.Entity;
import javax.persistence.Lob;

/**
 * 系统用户图像
 * 将系统用户图像提取到单独的实例，可提高对系统用户对象的检索速度
 */
@Entity
public class SystemUserImage extends DomainObject {

    @Lob
    public byte[] headImageData;

    public byte[] getHeadImageData() {
        return headImageData;
    }

    public void setHeadImageData(byte[] headImageData) {
        this.headImageData = headImageData;
    }
}
