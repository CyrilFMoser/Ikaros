package Program_31 

package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[C]) extends T_A[B]

val v_a: CC_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Int
//      Byte
//      (CC_A Byte
//            Boolean
//            (CC_A Boolean Boolean Wildcard (T_A Boolean))
//            (T_A Byte))
//      (T_A Int))
// This is not matched: (CC_B (T_A (T_B Char)) (T_B (T_A (T_B Char))))