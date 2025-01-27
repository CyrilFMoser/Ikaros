package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[Char]]
case class CC_B[C](a: T_A[T_B[Char]], b: T_B[C], c: C) extends T_B[C]
case class CC_C[D](a: T_B[D], b: T_A[D]) extends T_B[D]
case class CC_D[E]() extends T_B[E]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_D()