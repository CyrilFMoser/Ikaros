package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[Boolean, C]) extends T_A[Boolean, C]
case class CC_B[D, E](a: Byte, b: T_A[D, E], c: CC_A[CC_A[Byte]]) extends T_A[Boolean, D]
case class CC_C[F]() extends T_A[Boolean, F]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(12, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(12, CC_B(_, _, _))) => 1 
  case CC_A(_, CC_A(12, CC_C())) => 2 
  case CC_A(_, CC_A(_, CC_A(_, _))) => 3 
  case CC_A(_, CC_A(_, CC_B(_, _, _))) => 4 
  case CC_A(_, CC_A(_, CC_C())) => 5 
  case CC_A(_, CC_B(_, _, _)) => 6 
  case CC_A(_, CC_C()) => 7 
  case CC_B(_, _, _) => 8 
  case CC_C() => 9 
}
}