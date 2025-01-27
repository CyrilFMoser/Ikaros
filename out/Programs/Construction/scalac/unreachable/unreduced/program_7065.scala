package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: Boolean, c: T_B[E, E]) extends T_A[T_A[T_B[Int, Int], T_B[Boolean, Char]], E]
case class CC_B[F]() extends T_A[T_A[T_B[Int, Int], T_B[Boolean, Char]], F]
case class CC_C[G](a: T_A[G, G], b: (Boolean,T_A[Byte, Char]), c: CC_B[G]) extends T_B[T_B[Char, CC_B[Int]], G]

val v_a: T_A[T_A[T_B[Int, Int], T_B[Boolean, Char]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}