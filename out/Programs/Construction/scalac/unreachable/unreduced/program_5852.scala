package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[T_A[T_A[Int]]]
case class CC_B(a: Byte, b: T_A[CC_A[Byte]], c: CC_A[T_A[Byte]]) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: CC_A[CC_A[CC_B]]) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(0, _, CC_A()) => 1 
  case CC_B(_, _, CC_A()) => 2 
}
}
// This is not matched: CC_C(_)