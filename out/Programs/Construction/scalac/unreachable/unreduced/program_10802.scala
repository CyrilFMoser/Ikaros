package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D]() extends T_A[D, E]
case class CC_B[G, F](a: T_B[T_A[G, G]], b: T_B[G], c: T_A[G, G]) extends T_A[G, F]
case class CC_C() extends T_B[Int]

val v_a: T_A[CC_C, T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}