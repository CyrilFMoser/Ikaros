package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Boolean, b: T_B[Byte], c: C) extends T_A[C]
case class CC_B[D](a: CC_A[D], b: CC_A[D], c: D) extends T_A[D]
case class CC_C[E]() extends T_A[E]
case class CC_D(a: (CC_A[Int],CC_A[Byte])) extends T_B[T_A[T_B[Boolean]]]
case class CC_E(a: CC_B[CC_D]) extends T_B[T_A[T_B[Boolean]]]
case class CC_F() extends T_B[T_A[T_B[Boolean]]]

val v_a: T_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_, _, _)