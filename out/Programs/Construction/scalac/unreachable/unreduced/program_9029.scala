package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_B[D, D], c: Byte) extends T_A[D]
case class CC_B[E](a: E) extends T_A[E]
case class CC_C(a: Byte, b: T_A[T_A[Boolean]]) extends T_B[CC_A[T_A[Byte]], T_A[T_A[Byte]]]
case class CC_D(a: T_A[CC_B[CC_C]], b: Byte) extends T_B[CC_A[T_A[Byte]], T_A[T_A[Byte]]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}