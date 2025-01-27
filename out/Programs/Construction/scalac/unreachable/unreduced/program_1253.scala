package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_B[T_A],Byte), b: T_B[T_B[Char]]) extends T_A
case class CC_B(a: CC_A, b: CC_A, c: CC_A) extends T_A
case class CC_C(a: Boolean, b: T_A, c: CC_B) extends T_A
case class CC_D() extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, _), _) => 1 
  case CC_C(_, CC_B(_, _, _), CC_B(_, _, _)) => 2 
  case CC_C(_, CC_C(_, _, _), CC_B(_, _, _)) => 3 
}
}
// This is not matched: CC_C(_, CC_A(_, _), CC_B(_, _, _))