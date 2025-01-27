package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Byte, b: T_A[T_B[Byte]]) extends T_A[T_B[T_A[Boolean]]]
case class CC_B(a: T_A[CC_A]) extends T_A[T_B[T_A[Boolean]]]
case class CC_C[C](a: CC_B, b: Int, c: CC_A) extends T_B[C]
case class CC_D[D]() extends T_B[D]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_A(0, _)) => 0 
  case CC_C(_, _, CC_A(_, _)) => 1 
  case CC_D() => 2 
}
}