package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: T_A[Char]) extends T_A[Char]
case class CC_B() extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B())) => 1 
  case CC_A(_, CC_B()) => 2 
  case CC_B() => 3 
}
}