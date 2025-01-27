package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: (T_A[Boolean],T_A[Char]), c: T_A[Char]) extends T_A[T_A[Boolean]]
case class CC_B(a: Char, b: T_A[T_A[Boolean]], c: Int) extends T_A[T_A[Boolean]]
case class CC_C() extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), (_,_), _), (_,_), _) => 0 
  case CC_A(CC_A(CC_B(_, _, _), (_,_), _), (_,_), _) => 1 
  case CC_A(CC_A(CC_C(), (_,_), _), (_,_), _) => 2 
  case CC_A(CC_B(_, _, _), (_,_), _) => 3 
  case CC_A(CC_C(), (_,_), _) => 4 
  case CC_B(_, CC_A(CC_A(_, _, _), _, _), _) => 5 
  case CC_B(_, CC_A(CC_B(_, _, _), _, _), _) => 6 
  case CC_B(_, CC_A(CC_C(), _, _), _) => 7 
  case CC_B(_, CC_B(_, CC_A(_, _, _), _), _) => 8 
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), _) => 9 
  case CC_B(_, CC_B(_, CC_C(), _), _) => 10 
  case CC_B(_, CC_C(), _) => 11 
  case CC_C() => 12 
}
}