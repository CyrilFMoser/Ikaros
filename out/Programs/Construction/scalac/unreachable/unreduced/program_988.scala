package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Char]], b: T_A[T_B[Int]], c: T_A[T_A[Int]]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: CC_A, b: T_A[T_B[CC_A]]) extends T_A[T_A[T_A[Char]]]
case class CC_C[C](a: Byte) extends T_B[C]
case class CC_D[D](a: CC_B) extends T_B[D]
case class CC_E[E](a: T_A[E]) extends T_B[E]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(CC_B(_, _)) => 1 
  case CC_E(_) => 2 
}
}