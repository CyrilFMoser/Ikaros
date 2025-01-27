package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_A[D, D], D]
case class CC_B[E, F](a: T_A[T_A[E, E], E]) extends T_A[T_A[E, E], E]
case class CC_C[G](a: G, b: G, c: T_B[G]) extends T_A[T_A[G, G], G]
case class CC_D() extends T_B[Byte]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}