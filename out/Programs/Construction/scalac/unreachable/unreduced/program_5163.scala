package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Int], b: T_B, c: Char) extends T_A[Int]
case class CC_B(a: T_B, b: T_B, c: T_B) extends T_A[Int]
case class CC_C(a: (T_A[Int],Boolean)) extends T_A[Int]
case class CC_D(a: T_A[T_A[Int]]) extends T_B

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(_), 'x') => 0 
  case CC_B(_, CC_D(_), _) => 1 
  case CC_C((CC_A(_, _, _),true)) => 2 
  case CC_C((CC_A(_, _, _),false)) => 3 
  case CC_C((CC_B(_, _, _),true)) => 4 
  case CC_C((CC_B(_, _, _),false)) => 5 
  case CC_C((CC_C(_),true)) => 6 
  case CC_C((CC_C(_),false)) => 7 
}
}
// This is not matched: CC_A(_, CC_D(_), _)