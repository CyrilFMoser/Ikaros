package Program_63 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[Byte]]
case class CC_B(a: T_A[T_A[CC_A]], b: T_A[T_A[Byte]]) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
}
}
// This is not matched: CC_C(_, _)