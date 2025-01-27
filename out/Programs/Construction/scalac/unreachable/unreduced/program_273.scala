package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(T_A,T_A), T_A]) extends T_A
case class CC_B(a: T_A, b: T_A) extends T_A
case class CC_C(a: Char) extends T_B[((T_A,CC_B),CC_A), CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _) => 1 
  case CC_B(CC_B(_, _), _) => 2 
}
}