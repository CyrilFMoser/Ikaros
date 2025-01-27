package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte) extends T_A[T_A[C, C], C]
case class CC_B[D](a: (CC_A[Char],CC_A[Char]), b: T_A[Int, D]) extends T_A[T_A[D, D], D]
case class CC_C[E]() extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((CC_A(_),CC_A(_)), _) => 1 
  case CC_C() => 2 
}
}