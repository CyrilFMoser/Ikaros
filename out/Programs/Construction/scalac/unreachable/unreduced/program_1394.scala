package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_A], b: CC_A, c: T_B[CC_A]) extends T_B[CC_A]
case class CC_C(a: (CC_B,Int), b: T_B[CC_A], c: Char) extends T_B[CC_A]
case class CC_D() extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_B(_, _, _)) => 0 
  case CC_B(_, _, CC_C(_, _, _)) => 1 
  case CC_B(_, _, CC_D()) => 2 
  case CC_C((_,_), _, _) => 3 
}
}
// This is not matched: CC_D()