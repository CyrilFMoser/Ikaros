package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (Int,Int), b: D) extends T_A[T_A[T_A[D, D], D], D]
case class CC_B[E](a: T_A[E, E]) extends T_A[T_A[T_A[E, E], E], E]
case class CC_C[F](a: T_B[F]) extends T_B[F]

val v_a: T_A[T_A[T_A[Int, Int], Int], Int] = null
val v_b: Int = v_a match{
  case CC_A((_,_), 12) => 0 
  case CC_A((_,_), _) => 1 
  case CC_B(_) => 2 
}
}