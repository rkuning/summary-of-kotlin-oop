package data

class Company(val name : String) {
//    mengoverride method bawaan class Any yaitu equals
//    kode dibawah bertujuan agar dapat mengkomparasi hanya nilai valuenya saja.
//    jika nilai value pada class Compani A sama dengan nilai value pada class COmpany B maka hasilnya true
//    jika tidak maka false
    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Company -> other.name == this.name
            else -> false
        }
    }

//    fungsi dibawah agar yang di hashcode adalah nilai/value hasil inputan dari user. bukan nilai memory default
    override fun hashCode(): Int {
        return name.hashCode()
    }
}