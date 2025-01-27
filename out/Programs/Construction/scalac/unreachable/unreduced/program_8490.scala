package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: (T_B[CC_A, CC_A],CC_A), b: T_A) extends T_A
case class CC_C[C](a: T_B[C, C]) extends T_B[Char, C]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B((_,_), _)) => 1 
}
}