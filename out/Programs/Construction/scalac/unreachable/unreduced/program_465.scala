package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(T_A,T_A), T_A], b: T_A, c: T_B[T_A, T_B[T_A, T_A]]) extends T_A
case class CC_B(a: ((CC_A,T_A),T_B[CC_A, Byte])) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: (T_B[T_A, CC_B],T_A), b: T_B[C, C]) extends T_B[Byte, C]
case class CC_E[D](a: Int, b: T_B[Byte, T_B[Int, Int]], c: T_B[Byte, D]) extends T_B[Byte, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(_), _) => 1 
  case CC_B(_) => 2 
  case CC_C() => 3 
}
}
// This is not matched: CC_A(_, CC_C(), _)