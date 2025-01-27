package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, Int]) extends T_A[C, Int]
case class CC_B(a: CC_A[T_A[Char, Int]]) extends T_A[T_A[Boolean, Int], Int]
case class CC_C() extends T_A[T_A[Boolean, Int], Int]

val v_a: T_A[T_A[Boolean, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B(_))) => 1 
  case CC_A(_, CC_A(_, CC_C())) => 2 
  case CC_A(_, CC_B(CC_A(_, _))) => 3 
  case CC_A(_, CC_C()) => 4 
  case CC_B(CC_A(_, _)) => 5 
  case CC_C() => 6 
}
}