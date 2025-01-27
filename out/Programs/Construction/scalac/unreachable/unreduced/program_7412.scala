package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: ((Boolean,(Byte,Boolean)),T_A[Char]), c: T_A[(Byte,Int)]) extends T_A[C]
case class CC_B(a: T_A[T_A[Int]]) extends T_A[T_A[T_B[(Boolean,Boolean)]]]
case class CC_C() extends T_B[CC_A[T_A[CC_B]]]
case class CC_D(a: CC_A[CC_B], b: CC_B, c: T_A[T_A[CC_C]]) extends T_B[CC_A[T_A[CC_B]]]
case class CC_E(a: T_B[T_B[CC_D]], b: T_B[Boolean]) extends T_B[CC_A[T_A[CC_B]]]

val v_a: T_B[CC_A[T_A[CC_B]]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_E(_, _) => 1 
}
}
// This is not matched: CC_D(_, _, _)