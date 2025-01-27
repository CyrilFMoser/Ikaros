package Program_30 

package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C[C, D, E](a: (T_A,CC_B)) extends T_B[C, D]
case class CC_D[F](a: F, b: F) extends T_B[(CC_B,CC_A), F]
case class CC_E[G]() extends T_B[(CC_B,CC_A), G]

val v_a: T_B[Boolean, CC_A] = null
val v_b: Int = v_a match{
  case CC_C((CC_B(_),CC_B(_))) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: (CC_C Boolean
//      (CC_A (CC_A T_A T_A) (CC_A T_A T_A))
//      (CC_B T_A (T_B T_A T_A))
//      Wildcard
//      (T_B Boolean (CC_A (CC_A T_A T_A) (CC_A T_A T_A))))
// This is not matched: (CC_A T_A)