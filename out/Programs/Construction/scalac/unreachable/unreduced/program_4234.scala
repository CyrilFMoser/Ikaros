package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: C, c: C) extends T_A[C, Int]
case class CC_B[D]() extends T_A[Boolean, D]
case class CC_C[E](a: CC_A[E], b: Int) extends T_A[E, Int]
case class CC_D(a: CC_B[Boolean]) extends T_B

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, _) => 1 
}
}