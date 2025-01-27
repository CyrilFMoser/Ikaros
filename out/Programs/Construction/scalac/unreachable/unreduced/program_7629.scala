package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Int, c: Byte) extends T_A[C, T_A[C, C]]
case class CC_B[D]() extends T_A[D, T_A[D, D]]
case class CC_C[E](a: CC_A[E]) extends T_A[E, T_A[E, E]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, 0) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B() => 2 
  case CC_C(CC_A(_, _, 0)) => 3 
  case CC_C(CC_A(_, _, _)) => 4 
}
}