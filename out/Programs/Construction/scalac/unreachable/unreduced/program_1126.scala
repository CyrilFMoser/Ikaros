package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Int, b: T_B[T_B[Byte]]) extends T_A[T_A[Int]]
case class CC_B[C](a: T_A[C], b: C) extends T_B[C]
case class CC_C[D]() extends T_B[D]
case class CC_D[E](a: E, b: CC_C[E], c: CC_B[E]) extends T_B[E]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(0, _, CC_B(_, _)) => 1 
  case CC_D(_, _, CC_B(_, _)) => 2 
}
}
// This is not matched: CC_B(_, _)