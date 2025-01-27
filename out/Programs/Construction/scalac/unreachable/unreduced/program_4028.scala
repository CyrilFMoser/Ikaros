package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, Char], b: T_B[Char, T_B[T_A, T_A]], c: T_A) extends T_A
case class CC_B(a: Int) extends T_A
case class CC_C(a: CC_B, b: (T_B[CC_B, T_A],Boolean), c: T_B[CC_B, T_B[(Boolean,Char), CC_A]]) extends T_A
case class CC_D() extends T_B[CC_C, CC_A]
case class CC_E() extends T_B[CC_C, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B(_)) => 1 
  case CC_A(_, _, CC_C(_, _, _)) => 2 
  case CC_B(_) => 3 
  case CC_C(CC_B(12), _, _) => 4 
  case CC_C(CC_B(_), _, _) => 5 
}
}