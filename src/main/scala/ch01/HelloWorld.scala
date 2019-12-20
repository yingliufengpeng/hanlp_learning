package ch01

import com.hankcs.hanlp.HanLP

object HelloWorld {

  def main(args: Array[String]): Unit = {

    HanLP.Config.enableDebug() // 首次运行会自动建立模型缓存,为了避免无聊,开启调试模式说点什么!!!

    println(HanLP.segment("王国维和服务员"))

  }

}
