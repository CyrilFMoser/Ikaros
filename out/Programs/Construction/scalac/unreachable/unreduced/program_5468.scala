package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[T_A[Int]]
case class CC_B(a: CC_A[Char]) extends T_A[T_A[Int]]
case class CC_C(a: T_A[T_A[Byte]]) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A()