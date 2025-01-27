package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_A, T_B[T_A, T_A]], c: T_A) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: (CC_A,CC_A), b: T_B[C, T_A]) extends T_B[C, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(_), _, _) => 1 
  case CC_A(CC_C(), _, _) => 2 
  case CC_C() => 3 
}
}
// This is not matched: CC_B(CC_A(_, _, _))