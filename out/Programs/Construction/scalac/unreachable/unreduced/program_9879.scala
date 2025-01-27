package Program_27 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char], b: T_A[Boolean], c: T_A[T_A[Boolean]]) extends T_A[Boolean]
case class CC_B() extends T_A[Boolean]
case class CC_C(a: Int, b: T_A[Boolean], c: CC_B) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(), _) => 1 
  case CC_A(_, CC_C(_, CC_A(_, _, _), _), _) => 2 
  case CC_A(_, CC_C(_, CC_B(), _), _) => 3 
  case CC_A(_, CC_C(_, CC_C(_, _, _), _), _) => 4 
  case CC_B() => 5 
  case CC_C(_, _, CC_B()) => 6 
}
}