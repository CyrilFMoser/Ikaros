package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: Byte, c: E) extends T_A[Byte, E]
case class CC_B[F](a: CC_A[F]) extends T_A[Byte, F]
case class CC_C[G](a: CC_B[T_B[G, G]], b: T_A[Byte, T_A[Byte, G]], c: Int) extends T_B[CC_B[T_B[Byte, Int]], G]
case class CC_D[H](a: (CC_A[Boolean],Boolean), b: CC_B[H]) extends T_B[CC_B[T_B[Byte, Int]], H]

val v_a: T_B[CC_B[T_B[Byte, Int]], Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(CC_A(_, _, _)), CC_A(_, _, _), _) => 0 
  case CC_C(CC_B(CC_A(_, _, _)), CC_B(CC_A(_, _, _)), _) => 1 
  case CC_D(_, _) => 2 
}
}