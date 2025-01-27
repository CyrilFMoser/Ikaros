package Program_12 

package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[E, C], b: T_A[E, D]) extends T_A[C, D]
case class CC_B[F](a: T_A[Boolean, Int]) extends T_A[Boolean, F]
case class CC_C() extends T_A[Boolean, CC_A[Char, Boolean, (Int,Byte)]]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_B Byte
//      (CC_B Int
//            (CC_A Boolean Int Boolean Wildcard Wildcard (T_A Boolean Int))
//            (T_A Boolean Int))
//      (T_A Boolean Byte))
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)