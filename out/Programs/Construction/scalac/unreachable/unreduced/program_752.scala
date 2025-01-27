package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[T_B, T_B]
case class CC_B(a: T_A[Char, T_A[CC_A, T_B]], b: T_A[T_B, T_B]) extends T_A[T_B, T_B]
case class CC_C[C](a: Char, b: CC_B, c: T_A[C, C]) extends T_A[T_B, T_B]
case class CC_D() extends T_B

val v_a: T_A[T_B, T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
  case CC_B(_, CC_C(_, _, _)) => 3 
  case CC_C(_, _, _) => 4 
}
}