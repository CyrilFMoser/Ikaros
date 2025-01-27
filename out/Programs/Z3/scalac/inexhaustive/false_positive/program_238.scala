package Program_31 

package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: Boolean, b: Char, c: T_B[Char, Boolean]) extends T_A[Boolean, T_A[Byte, (Int,Char)]]
case class CC_B() extends T_A[Boolean, T_A[Byte, (Int,Char)]]
case class CC_C(a: T_B[Char, (Int,Char)], b: T_B[CC_A, CC_B], c: T_A[CC_B, CC_A]) extends T_A[Boolean, T_A[Byte, (Int,Char)]]
case class CC_D[E, F](a: E) extends T_B[CC_A, E]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, CC_D(_), _) => 0 
}
}
// This is not matched: (CC_C Wildcard
//      (CC_D (CC_B Boolean)
//            Boolean
//            Wildcard
//            (T_B (CC_A Boolean Boolean Boolean Boolean) (CC_B Boolean)))
//      Wildcard
//      (T_A Boolean (T_A Byte (Tuple Int Char))))
// This is not matched: (CC_B Boolean (T_A Boolean))