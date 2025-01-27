package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_B[Int], T_A[Int, Int]]) extends T_A[(T_B[Char],T_A[Byte, Int]), T_A[Int, T_A[Byte, Byte]]]
case class CC_B[D](a: Char) extends T_A[CC_A, D]
case class CC_C[E](a: T_A[E, E]) extends T_B[E]
case class CC_D(a: CC_B[CC_C[Boolean]]) extends T_B[T_A[CC_A, (Int,CC_A)]]

val v_a: T_B[T_A[CC_A, (Int,CC_A)]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_) => 1 
}
}