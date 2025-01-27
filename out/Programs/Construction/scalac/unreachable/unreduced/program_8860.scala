package Program_16 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: Char) extends T_A[Boolean]
case class CC_B(a: T_A[CC_A], b: Char) extends T_A[Boolean]
case class CC_C(a: Byte, b: (Char,T_A[CC_B]), c: Byte) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_, _), _), _) => 1 
  case CC_A(CC_A(CC_C(_, _, _), _), _) => 2 
  case CC_A(CC_B(_, 'x'), _) => 3 
  case CC_A(CC_B(_, _), _) => 4 
  case CC_A(CC_C(_, (_,_), 0), _) => 5 
  case CC_A(CC_C(_, (_,_), _), _) => 6 
  case CC_B(_, _) => 7 
  case CC_C(_, _, _) => 8 
}
}