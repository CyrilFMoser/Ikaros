package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[Char, C]
case class CC_B[D, E](a: T_A[T_A[Char, E], D], b: Byte) extends T_A[Char, D]
case class CC_C[F](a: T_A[Char, T_A[Char, CC_B[T_B, T_B]]], b: F) extends T_A[Char, F]
case class CC_D(a: CC_B[T_A[Char, T_B], T_A[T_B, T_B]], b: Char, c: CC_A[CC_B[T_B, T_B]]) extends T_B

val v_a: T_A[Char, CC_D] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, CC_D(CC_B(_, _), _, _)) => 2 
}
}