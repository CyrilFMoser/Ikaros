package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Boolean) extends T_A
case class CC_B(a: T_B[T_A, ((Boolean,Char),T_A)], b: Byte, c: CC_A) extends T_A
case class CC_C(a: T_B[T_A, CC_B]) extends T_A
case class CC_D[C](a: Int, b: T_B[C, C]) extends T_B[C, CC_B]
case class CC_E() extends T_B[CC_C, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(CC_D(_, _))