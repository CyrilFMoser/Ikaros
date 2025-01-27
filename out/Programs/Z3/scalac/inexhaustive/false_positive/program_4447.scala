package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[Int]]
case class CC_C[D]() extends T_B[D]
case class CC_D[E](a: (CC_A,CC_A), b: Int, c: T_B[E]) extends T_B[E]

val v_a: CC_D[Byte] = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_C()) => 0 
}
}
// This is not matched: (CC_A Byte Wildcard Wildcard (T_A Byte))