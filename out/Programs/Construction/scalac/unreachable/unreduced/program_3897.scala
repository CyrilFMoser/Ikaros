package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: CC_A) extends T_B[Boolean, C]
case class CC_D[D](a: T_B[D, D]) extends T_B[Boolean, D]
case class CC_E[E](a: E) extends T_B[Boolean, E]

val v_a: T_B[Boolean, CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_A(_))) => 0 
  case CC_C(CC_A(CC_B())) => 1 
  case CC_D(_) => 2 
  case CC_E(_) => 3 
}
}