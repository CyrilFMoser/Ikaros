package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[T_A[D]], b: D, c: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: E) extends T_A[E]
case class CC_C[F]() extends T_B[F, T_A[T_B[Byte, Int]]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_A(CC_B(_), _, _)