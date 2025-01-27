package Program_23 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[Char]
case class CC_B(a: Char, b: T_A[T_A[Int]], c: CC_A[Char]) extends T_A[Char]
case class CC_C() extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A()) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A()