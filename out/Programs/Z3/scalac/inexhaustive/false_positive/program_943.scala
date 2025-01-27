package Program_31 

package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (Boolean,Char)) extends T_A[T_A[Int, Boolean], T_A[Boolean, Int]]
case class CC_B[C, D](a: CC_A, b: Char) extends T_A[Byte, C]
case class CC_C(a: T_A[Byte, CC_A]) extends T_A[CC_B[Boolean, CC_A], Byte]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _)) => 0 
}
}
// This is not matched: (CC_C (CC_B (CC_A Wildcard Wildcard)
//            Boolean
//            (CC_A Wildcard (T_A (T_A Int Boolean) (T_A Boolean Int)))
//            Wildcard
//            (T_A Byte (CC_A Wildcard Wildcard)))
//      (T_A (CC_B Boolean (CC_A Boolean Boolean) Boolean Boolean Boolean) Byte))
// This is not matched: (CC_C (CC_B (CC_A Wildcard Wildcard)
//            Boolean
//            (CC_A Wildcard (T_A (T_A Int Boolean) (T_A Boolean Int)))
//            Wildcard
//            (T_A Byte (CC_A Wildcard Wildcard)))
//      (T_A (CC_B Boolean (CC_A Boolean Boolean) Boolean Boolean Boolean) Byte))