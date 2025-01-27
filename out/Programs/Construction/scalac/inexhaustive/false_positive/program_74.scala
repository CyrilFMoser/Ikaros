package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Boolean]
case class CC_B(a: T_A[Boolean], b: T_A[T_A[CC_A]]) extends T_A[Boolean]
case class CC_C() extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_C(), _) => 1 
  case CC_C() => 2 
}
}
// This is not matched: CC_B(((_,_),_), CC_B((_,_), CC_A(_, _, _)))