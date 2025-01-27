package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Char]
case class CC_B(a: (CC_A,CC_A), b: T_A[T_A[Char]]) extends T_A[Char]
case class CC_C(a: CC_A, b: CC_A) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B((CC_A(),CC_A()), _) => 0 
  case CC_C(CC_A(), CC_A()) => 1 
}
}
// This is not matched: CC_A()