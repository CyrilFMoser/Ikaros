package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: CC_A) extends T_A
case class CC_C(a: T_A, b: (CC_A,T_A), c: T_A) extends T_A
case class CC_D[C](a: CC_A) extends T_B[CC_A, C]
case class CC_E[D]() extends T_B[CC_A, D]
case class CC_F[E]() extends T_B[CC_A, E]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
}
}