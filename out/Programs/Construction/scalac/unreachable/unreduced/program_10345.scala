package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_B[Int, T_B[Char, Boolean]], T_B[T_A[Boolean, Int], T_A[Boolean, Byte]]]
case class CC_B[E](a: T_A[E, CC_A], b: T_B[E, E], c: T_A[E, E]) extends T_B[E, T_B[E, E]]
case class CC_C[F]() extends T_B[F, T_B[F, F]]

val v_a: T_B[Byte, T_B[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}