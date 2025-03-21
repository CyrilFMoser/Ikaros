package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b: C, c: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: (T_A[Boolean, Boolean],Int), b: D, c: D) extends T_A[T_A[D, D], D]
case class CC_C[E]() extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B((_,_), _, _) => 1 
  case CC_C() => 2 
}
}