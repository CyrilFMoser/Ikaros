package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Boolean) extends T_A
case class CC_B(a: CC_A, b: T_B[Int, T_B[CC_A, T_A]], c: T_A) extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D(a: Char) extends T_B[(CC_B,CC_B), T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, CC_B(CC_A(_), _, _)) => 1 
  case CC_B(_, _, CC_C(_)) => 2 
  case CC_C(CC_B(_, _, _)) => 3 
}
}
// This is not matched: CC_B(_, _, CC_A(_))