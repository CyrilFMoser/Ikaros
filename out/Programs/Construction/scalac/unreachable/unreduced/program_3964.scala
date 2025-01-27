package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(T_A,T_A), T_A], b: T_A) extends T_A
case class CC_B(a: T_B[CC_A, CC_A], b: T_B[T_B[CC_A, Byte], T_A]) extends T_A
case class CC_C() extends T_A
case class CC_D[C, D](a: Int, b: CC_B, c: (T_A,CC_C)) extends T_B[CC_B, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_, _)) => 1 
  case CC_A(_, CC_C()) => 2 
  case CC_B(_, _) => 3 
  case CC_C() => 4 
}
}