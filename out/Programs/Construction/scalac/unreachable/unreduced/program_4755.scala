package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: Int, b: T_B[Byte, T_B[CC_A, CC_A]], c: T_B[((Char,Int),(Char,Boolean)), T_A]) extends T_A
case class CC_C[C, D](a: Boolean) extends T_B[T_B[C, CC_B], C]
case class CC_D[E](a: Byte, b: E, c: T_B[T_B[E, CC_B], E]) extends T_B[E, CC_C[Char, CC_C[T_A, (Char,Boolean)]]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_, _, _)) => 1 
}
}