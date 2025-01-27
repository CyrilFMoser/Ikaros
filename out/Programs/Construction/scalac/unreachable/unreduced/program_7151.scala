package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Char, b: T_A[T_A[(Byte,Boolean)]]) extends T_A[T_A[Char]]
case class CC_B() extends T_A[T_A[Char]]
case class CC_C(a: T_A[CC_B], b: T_A[T_A[Char]]) extends T_A[T_A[Char]]
case class CC_D() extends T_B

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
  case CC_A(_, _) => 1 
  case CC_B() => 2 
  case CC_C(_, CC_A(_, _)) => 3 
  case CC_C(_, CC_B()) => 4 
  case CC_C(_, CC_C(_, CC_B())) => 5 
  case CC_C(_, CC_C(_, CC_C(_, _))) => 6 
}
}
// This is not matched: CC_C(_, CC_C(_, CC_A(_, _)))