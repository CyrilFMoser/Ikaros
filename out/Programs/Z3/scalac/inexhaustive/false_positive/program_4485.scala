package Program_12 

object Test {
sealed trait T_B[C]
case class CC_D[J]() extends T_B[J]
case class CC_E[K](a: K, b: T_B[K]) extends T_B[K]

val v_a: CC_E[Char] = null
val v_b: Int = v_a match{
  case CC_E(_, CC_D()) => 0 
}
}
// This is not matched: (CC_B Byte
//      Wildcard
//      (CC_B Int (CC_A Int Wildcard (T_A Int)) Wildcard Wildcard (T_A Int))
//      (CC_B Byte
//            (CC_A Byte Wildcard (T_A Byte))
//            Wildcard
//            (CC_A Byte Char (T_A Byte))
//            (T_A Byte))
//      (T_A Byte))