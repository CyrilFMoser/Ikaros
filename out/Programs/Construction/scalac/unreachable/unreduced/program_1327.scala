package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_A, c: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: (CC_A,T_B[(Char,Char)])) extends T_A
case class CC_C(a: CC_A) extends T_A
case class CC_D(a: T_B[CC_C], b: CC_C) extends T_B[CC_C]
case class CC_E(a: Char, b: T_A) extends T_B[CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(_), _) => 1 
  case CC_A(_, CC_C(_), _) => 2 
  case CC_B(_) => 3 
}
}
// This is not matched: CC_C(CC_A(_, _, _))