package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_B[T_A[Byte, Byte]]]
case class CC_B[E](a: T_A[E, E]) extends T_A[E, T_B[T_A[Byte, Byte]]]
case class CC_C(a: CC_B[CC_A[Boolean]], b: CC_B[CC_A[Byte]]) extends T_A[T_B[(Boolean,Int)], T_B[T_A[Byte, Byte]]]

val v_a: T_A[T_B[(Boolean,Int)], T_B[T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(CC_B(_), CC_B(_)) => 1 
}
}
// This is not matched: CC_B(_)