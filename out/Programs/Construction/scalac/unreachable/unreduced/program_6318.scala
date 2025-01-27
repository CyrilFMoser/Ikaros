package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_B[C, C], b: C, c: C) extends T_A
case class CC_B(a: Int, b: T_A, c: T_B[Char, T_A]) extends T_A
case class CC_C(a: Char) extends T_A
case class CC_D[D]() extends T_B[D, CC_B]
case class CC_E[E](a: E) extends T_B[E, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(_, _, _)