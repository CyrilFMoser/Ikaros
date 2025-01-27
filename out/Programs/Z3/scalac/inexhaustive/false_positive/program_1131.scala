package Program_30 

package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (Boolean,T_A), b: T_A) extends T_A
case class CC_B(a: T_A, b: CC_A) extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D(a: CC_A, b: CC_B, c: CC_B) extends T_B[T_B[CC_A, CC_B], T_A]
case class CC_E[C, D](a: CC_B, b: C, c: T_B[C, C]) extends T_B[CC_D, C]
case class CC_F[E, F](a: Int, b: Boolean, c: Byte) extends T_B[CC_D, E]

val v_a: T_B[CC_D, CC_A] = null
val v_b: Int = v_a match{
  case CC_F(_, _, 0) => 0 
  case CC_F(12, _, 0) => 1 
  case CC_F(_, _, _) => 2 
  case CC_E(_, _, _) => 3 
}
}
// This is not matched: (CC_F (CC_A (T_B T_A T_A) (T_B T_A T_A) (T_B T_A T_A))
//      T_A
//      Wildcard
//      Boolean
//      Wildcard
//      (T_B (CC_D (T_B T_A T_A) (T_B T_A T_A) (T_B T_A T_A) (T_B T_A T_A))
//           (CC_A (T_B T_A T_A) (T_B T_A T_A) (T_B T_A T_A))))
// This is not matched: (CC_A (Tuple (CC_B Wildcard T_A) (CC_B Wildcard T_A)) (CC_B Wildcard T_A) T_A)