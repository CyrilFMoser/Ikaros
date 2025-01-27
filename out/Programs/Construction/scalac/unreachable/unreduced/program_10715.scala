package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: Char) extends T_A
case class CC_B(a: Char, b: T_B[T_A, CC_A]) extends T_A
case class CC_C[C](a: CC_B) extends T_B[CC_B, C]
case class CC_D[D, E](a: E) extends T_B[CC_B, D]

val v_a: T_B[CC_B, Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _)) => 0 
  case CC_D(_) => 1 
}
}