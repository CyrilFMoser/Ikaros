package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: Byte) extends T_A
case class CC_C(a: T_B[CC_B], b: T_B[CC_A], c: CC_B) extends T_A
case class CC_D(a: (CC_C,T_B[CC_C]), b: CC_A, c: T_B[CC_C]) extends T_B[CC_C]
case class CC_E() extends T_B[T_B[(CC_A,(Byte,Char))]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, CC_A(_, _)), _) => 0 
  case CC_A(CC_A(_, CC_B(_)), _) => 1 
  case CC_A(CC_A(_, CC_C(_, _, _)), _) => 2 
  case CC_A(CC_B(_), _) => 3 
  case CC_A(CC_C(_, _, _), _) => 4 
  case CC_B(_) => 5 
  case CC_C(_, _, CC_B(_)) => 6 
}
}