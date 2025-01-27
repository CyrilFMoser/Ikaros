package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[T_B[D], D], b: T_A[D, D]) extends T_A[T_A[D, (Char,Int)], D]
case class CC_B[E](a: T_B[E], b: Char) extends T_A[T_A[E, (Char,Int)], E]
case class CC_C[F]() extends T_A[T_A[F, (Char,Int)], F]

val v_a: T_A[T_A[Boolean, (Char,Int)], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}