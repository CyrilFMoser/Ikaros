package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_B[T_A]], c: T_B[Boolean]) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: Char, b: T_A, c: Char) extends T_A
case class CC_D() extends T_B[CC_C]
case class CC_E(a: Char, b: T_B[(CC_A,Char)], c: T_B[T_B[Int]]) extends T_B[CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(_), _, _) => 1 
  case CC_A(CC_C(_, CC_A(_, _, _), _), _, _) => 2 
  case CC_A(CC_C(_, CC_B(_), _), _, _) => 3 
  case CC_A(CC_C(_, CC_C(_, _, _), _), _, _) => 4 
  case CC_B(CC_A(_, _, _)) => 5 
  case CC_C(_, CC_A(_, _, _), 'x') => 6 
  case CC_C(_, CC_A(_, _, _), _) => 7 
  case CC_C(_, CC_B(CC_A(_, _, _)), 'x') => 8 
  case CC_C(_, CC_B(CC_A(_, _, _)), _) => 9 
  case CC_C(_, CC_C(_, CC_A(_, _, _), _), 'x') => 10 
  case CC_C(_, CC_C(_, CC_A(_, _, _), _), _) => 11 
  case CC_C(_, CC_C(_, CC_B(_), _), 'x') => 12 
  case CC_C(_, CC_C(_, CC_B(_), _), _) => 13 
  case CC_C(_, CC_C(_, CC_C(_, _, _), _), 'x') => 14 
  case CC_C(_, CC_C(_, CC_C(_, _, _), _), _) => 15 
}
}