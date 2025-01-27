package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[Boolean, T_A], T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: C) extends T_B[CC_B, C]
case class CC_E[D](a: D, b: T_B[CC_B, D]) extends T_B[CC_A, D]
case class CC_F[E](a: E, b: Char) extends T_B[CC_A, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C()