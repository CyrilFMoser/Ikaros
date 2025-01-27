package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_B[D, D]) extends T_A[D]
case class CC_B[E, F](a: T_A[E], b: F, c: T_A[F]) extends T_A[E]
case class CC_C[G]() extends T_A[G]
case class CC_D[H](a: Byte) extends T_B[T_A[CC_B[Char, Char]], H]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_, _, _), _), _) => 1 
  case CC_A(CC_A(CC_C(), _), _) => 2 
  case CC_A(CC_B(_, _, _), _) => 3 
  case CC_A(CC_C(), _) => 4 
  case CC_B(_, _, _) => 5 
  case CC_C() => 6 
}
}