package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, Boolean], b: T_A[C, C], c: T_B) extends T_A[C, Boolean]
case class CC_B(a: CC_A[(Byte,T_B)]) extends T_B
case class CC_C(a: T_A[Byte, Boolean], b: Boolean, c: Char) extends T_B
case class CC_D(a: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_A(_, _, _), _, CC_B(_))) => 0 
  case CC_B(CC_A(CC_A(_, _, _), _, CC_C(_, _, _))) => 1 
  case CC_B(CC_A(CC_A(_, _, _), _, CC_D(_))) => 2 
  case CC_C(CC_A(_, _, CC_B(_)), _, _) => 3 
  case CC_C(CC_A(_, _, CC_C(_, _, _)), _, _) => 4 
  case CC_C(CC_A(_, _, CC_D(_)), _, _) => 5 
  case CC_D(_) => 6 
}
}