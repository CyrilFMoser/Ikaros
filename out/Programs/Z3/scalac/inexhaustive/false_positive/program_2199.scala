package Program_31 

package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Boolean, b: (T_A,Boolean)) extends T_A
case class CC_B[C]() extends T_A
case class CC_C[D, E]() extends T_B[D, (CC_A,T_A)]
case class CC_D[F](a: CC_B[F], b: CC_C[F, F], c: Char) extends T_B[F, (CC_A,T_A)]
case class CC_E[G]() extends T_B[G, (CC_A,T_A)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_B T_A T_A)
// This is not matched: (CC_E Wildcard T_B)