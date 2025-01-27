package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Byte, b: T_A, c: T_B[T_B[T_A]]) extends T_A
case class CC_B[B](a: T_B[B], b: T_A) extends T_A
case class CC_C(a: CC_A, b: CC_B[CC_B[T_A]]) extends T_A
case class CC_D(a: CC_B[CC_A], b: CC_B[CC_B[(Byte,Char)]], c: CC_B[CC_C]) extends T_B[CC_C]
case class CC_E(a: CC_B[T_B[CC_C]], b: Char) extends T_B[CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(_, _), _) => 1 
  case CC_A(_, CC_C(_, _), _) => 2 
  case CC_B(_, CC_A(_, _, _)) => 3 
  case CC_B(_, CC_B(_, _)) => 4 
  case CC_B(_, CC_C(_, _)) => 5 
  case CC_C(_, _) => 6 
}
}