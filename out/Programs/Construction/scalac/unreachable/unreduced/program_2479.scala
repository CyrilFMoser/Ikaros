package Program_20 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: T_A) extends T_A
case class CC_C(a: T_B[Boolean, Char], b: Boolean) extends T_A
case class CC_D[C](a: T_B[C, C], b: T_B[CC_B, C]) extends T_B[CC_B, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
  case CC_B(_, CC_C(_, _)) => 3 
  case CC_C(_, _) => 4 
}
}