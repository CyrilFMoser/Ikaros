package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[C, C], c: Byte) extends T_A[C, T_A[Boolean, T_A[T_B, T_B]]]
case class CC_B[D]() extends T_A[D, T_A[Boolean, T_A[T_B, T_B]]]
case class CC_C(a: T_B, b: CC_B[Byte], c: CC_A[CC_A[T_B]]) extends T_B

val v_a: T_A[Char, T_A[Boolean, T_A[T_B, T_B]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _, _), _, _) => 0 
  case CC_B() => 1 
}
}