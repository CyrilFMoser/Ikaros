package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_B[D], D]
case class CC_B() extends T_B[Int]
case class CC_C[E](a: CC_B, b: T_A[E, E], c: T_B[E]) extends T_B[E]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, CC_B()) => 1 
  case CC_C(_, _, CC_C(_, _, _)) => 2 
}
}