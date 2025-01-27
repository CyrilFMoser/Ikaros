package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: (Int,T_B[T_A, Boolean]), c: Boolean) extends T_A
case class CC_B(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_C(a: CC_A) extends T_A
case class CC_D() extends T_B[Char, CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, (_,_), true), _, _) => 1 
  case CC_B(CC_A(_, (_,_), false), _, _) => 2 
  case CC_B(CC_B(_, CC_A(_, _, _), _), _, _) => 3 
  case CC_B(CC_B(_, CC_B(_, _, _), _), _, _) => 4 
  case CC_B(CC_B(_, CC_C(_), _), _, _) => 5 
  case CC_B(CC_C(CC_A(_, _, _)), _, _) => 6 
}
}
// This is not matched: CC_C(CC_A(_, (_,_), _))