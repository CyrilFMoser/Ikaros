package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Int, b: T_A, c: T_B[T_B[(Char,Int)]]) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(12, CC_A(_, _, _), _), _) => 0 
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), _) => 1 
  case CC_A(_, CC_A(12, CC_B(), _), _) => 2 
  case CC_A(_, CC_A(_, CC_B(), _), _) => 3 
  case CC_A(_, CC_B(), _) => 4 
  case CC_B() => 5 
}
}