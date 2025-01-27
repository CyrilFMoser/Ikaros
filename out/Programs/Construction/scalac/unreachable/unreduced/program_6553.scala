package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: E, b: T_B[E, E], c: E) extends T_A[E]
case class CC_C[F](a: Char, b: T_A[F], c: F) extends T_A[F]
case class CC_D(a: CC_C[T_A[Int]]) extends T_B[T_A[T_A[(Boolean,Int)]], CC_C[CC_C[Char]]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A()