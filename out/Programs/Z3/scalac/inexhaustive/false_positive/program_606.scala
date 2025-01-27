package Program_30 

package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A[B, C]() extends T_A[B]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Int Boolean (T_A Int))
// This is not matched: (CC_E Wildcard
//      (CC_C Wildcard Wildcard (T_A (T_A Byte Boolean) (Tuple Int Char)))
//      (CC_E Wildcard
//            Wildcard
//            Wildcard
//            (T_B (CC_C Boolean Boolean (T_A Boolean Boolean))))
//      (T_B (CC_C Boolean Boolean Boolean)))