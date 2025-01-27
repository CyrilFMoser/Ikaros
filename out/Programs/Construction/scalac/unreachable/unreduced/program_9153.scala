package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_B]]
case class CC_B(a: CC_A, b: T_A[T_B], c: CC_A) extends T_A[T_A[T_B]]
case class CC_C() extends T_A[T_A[T_B]]
case class CC_D(a: CC_C, b: T_A[CC_C]) extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _, CC_A()) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A()