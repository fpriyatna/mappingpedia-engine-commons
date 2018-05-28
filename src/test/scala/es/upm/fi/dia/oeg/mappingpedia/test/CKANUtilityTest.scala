package es.upm.fi.dia.oeg.mappingpedia.test

import es.upm.fi.dia.oeg.mappingpedia.utility.MappingpediaCommonCKANUtility

object CKANUtilityTest {
  def main(args: Array[String])= {
    val ckanURL = "";
    val ckanKey = "";

    val ckanUtility = new MappingpediaCommonCKANUtility(ckanURL, ckanKey)
    val responseSuccess = ckanUtility.findPackageByPackageName("zaragoza_spain", "zaragoza-farmacias")
    val responseFailed = ckanUtility.findPackageByPackageName("zaragoza_spain", "zaragoza-farmacias111")

    println("Bye")
  }

}
