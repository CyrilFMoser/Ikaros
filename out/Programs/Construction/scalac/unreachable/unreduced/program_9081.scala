package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: Char) extends T_A[T_B[D], D]
case class CC_B[E](a: E, b: T_A[E, E], c: T_A[E, E]) extends T_A[T_B[E], E]
case class CC_C[F]() extends T_A[T_B[F], F]
case class CC_D(a: Char) extends T_B[(T_A[Char, Int],CC_B[Int])]
case class CC_E[G](a: Boolean, b: CC_A[G]) extends T_B[G]
case class CC_F() extends T_B[(T_A[Char, Int],CC_B[Int])]

val v_a: T_A[T_B[Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}