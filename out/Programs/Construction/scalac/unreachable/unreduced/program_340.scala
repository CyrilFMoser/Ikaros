package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, Char]) extends T_A[C, Char]
case class CC_B() extends T_A[Int, Char]
case class CC_C(a: (CC_B,CC_B), b: (CC_A[CC_B],Int)) extends T_A[Int, Char]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B()) => 1 
  case CC_A(_, CC_C(_, _)) => 2 
  case CC_B() => 3 
  case CC_C(_, _) => 4 
}
}