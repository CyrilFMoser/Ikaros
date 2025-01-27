package Program_13 

package Program_5 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: T_A, c: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_A (CC_A T_A T_A T_A T_A T_A) Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_A (CC_B T_B T_B)
//      (Tuple (CC_D T_B
//                   (CC_A T_B Wildcard (T_A T_B))
//                   Wildcard
//                   (CC_A (CC_B T_B T_B) Wildcard (T_A (CC_B T_B T_B)))
//                   T_B)
//             (CC_C Boolean T_B))
//      (T_A (CC_B T_B T_B)))