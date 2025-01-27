package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[Byte, T_B[Char, (Int,Int)]], c: T_B[T_B[Byte, T_A], T_A]) extends T_A
case class CC_B(a: T_A, b: T_B[T_A, T_B[CC_A, CC_A]], c: Int) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: Char) extends T_B[T_A, C]
case class CC_E[D](a: D, b: Boolean) extends T_B[T_A, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_D(_), _) => 1 
  case CC_B(_, CC_E(_, _), _) => 2 
}
}
// This is not matched: CC_C()