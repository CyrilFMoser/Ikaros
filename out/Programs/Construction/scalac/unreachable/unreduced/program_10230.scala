package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_A], b: T_B[T_B[T_A, (Byte,Boolean)], T_B[T_A, T_A]], c: T_B[T_B[T_A, Boolean], T_B[T_A, T_A]]) extends T_A
case class CC_B(a: Boolean) extends T_A
case class CC_C() extends T_B[T_A, T_B[T_B[CC_B, (Char,Boolean)], CC_B]]
case class CC_D(a: Char, b: CC_B) extends T_B[T_A, T_B[T_B[CC_B, (Char,Boolean)], CC_B]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}