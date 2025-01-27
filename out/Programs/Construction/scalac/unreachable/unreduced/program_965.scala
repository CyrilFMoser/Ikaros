package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Byte]]) extends T_A[T_B[T_B[Byte]]]
case class CC_B(a: CC_A) extends T_A[T_B[T_B[Byte]]]
case class CC_C[C](a: Char, b: C, c: T_A[CC_B]) extends T_B[C]

val v_a: T_A[T_B[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _, _)) => 0 
  case CC_B(_) => 1 
}
}