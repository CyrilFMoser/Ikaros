package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Boolean) extends T_A
case class CC_B(a: Char) extends T_A
case class CC_C(a: T_B[CC_A, Char], b: T_A, c: CC_A) extends T_A
case class CC_D[C](a: T_B[C, C], b: CC_A) extends T_B[((CC_C,CC_C),Int), C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_, CC_A(_), CC_A(_)) => 2 
  case CC_C(_, CC_B(_), CC_A(_)) => 3 
  case CC_C(_, CC_C(_, CC_A(_), _), CC_A(_)) => 4 
  case CC_C(_, CC_C(_, CC_B(_), _), CC_A(_)) => 5 
  case CC_C(_, CC_C(_, CC_C(_, _, _), _), CC_A(_)) => 6 
}
}