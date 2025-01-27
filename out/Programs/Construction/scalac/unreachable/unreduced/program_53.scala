package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: C, b: T_A[D, C], c: T_B) extends T_A[Boolean, C]
case class CC_B(a: T_A[Boolean, T_A[T_B, Int]], b: T_A[Boolean, T_A[Boolean, T_B]]) extends T_A[Boolean, CC_A[Byte, T_A[T_B, Byte]]]
case class CC_C[E]() extends T_A[Boolean, CC_A[Byte, T_A[T_B, Byte]]]
case class CC_D() extends T_B

val v_a: T_A[Boolean, CC_A[Byte, T_A[T_B, Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(CC_A(_, _, _), _, CC_D())