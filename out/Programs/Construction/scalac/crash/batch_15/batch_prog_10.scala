package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Char) extends T_A
case class CC_B(a: Char, b: CC_A) extends T_A
case class CC_C(a: T_A, b: CC_B) extends T_A
case class CC_D(a: T_B[CC_C, Char], b: T_A, c: Int) extends T_B[CC_C, Char]
case class CC_E() extends T_B[CC_C, Char]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_D(CC_D(_, _, _), CC_A(_), _), _, _) => 0 
  case CC_D(CC_D(CC_D(_, _, _), CC_B(_, _), _), _, _) => 1 
  case CC_D(CC_D(CC_D(_, _, _), CC_C(_, _), _), _, _) => 2 
  case CC_D(CC_D(CC_E(), CC_B(_, _), _), _, _) => 3 
  case CC_D(CC_D(CC_E(), CC_C(_, _), _), _, _) => 4 
  case CC_D(CC_E(), _, _) => 5 
}
}
// This is not matched: CC_D(CC_D(CC_E(), CC_A(_), _), _, _)