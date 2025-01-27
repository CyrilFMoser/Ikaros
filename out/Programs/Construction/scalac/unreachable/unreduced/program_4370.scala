package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Boolean, b: ((Char,T_A),T_A)) extends T_A
case class CC_B(a: (T_B[CC_A, CC_A],CC_A)) extends T_A
case class CC_C(a: T_B[Byte, T_A], b: CC_A) extends T_A
case class CC_D[C](a: T_B[C, T_B[C, CC_A]]) extends T_B[C, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((CC_D(_),CC_A(_, _))) => 1 
  case CC_C(_, CC_A(_, _)) => 2 
}
}