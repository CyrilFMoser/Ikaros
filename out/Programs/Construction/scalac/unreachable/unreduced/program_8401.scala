package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: Char) extends T_A
case class CC_B(a: CC_A, b: T_B[CC_A, T_B[CC_A, Int]]) extends T_B[CC_A, T_B[CC_A, T_B[(Byte,Char), CC_A]]]
case class CC_C(a: T_A) extends T_B[CC_A, T_B[CC_A, T_B[(Byte,Char), CC_A]]]
case class CC_D(a: Int, b: CC_B) extends T_B[CC_A, T_B[CC_A, T_B[(Byte,Char), CC_A]]]

val v_a: T_B[CC_A, T_B[CC_A, T_B[(Byte,Char), CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_A(_, _), _), _) => 0 
  case CC_C(CC_A(_, _)) => 1 
  case CC_D(12, CC_B(_, _)) => 2 
}
}
// This is not matched: CC_D(_, CC_B(_, _))