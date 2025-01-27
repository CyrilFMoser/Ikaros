package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_A[Char, T_A[T_A[T_B, (Boolean,Boolean)], D]], b: T_A[C, D], c: C) extends T_A[Char, C]
case class CC_B[F](a: CC_A[Byte, F], b: T_A[Char, F], c: T_A[F, F]) extends T_A[Char, F]
case class CC_C[G]() extends T_A[Char, G]

val v_a: T_A[Char, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}