package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Char], b: T_A[T_B[Boolean]]) extends T_A[T_B[Boolean]]
case class CC_B(a: Byte) extends T_B[T_A[T_A[CC_A]]]
case class CC_C[C](a: C, b: T_A[T_B[Boolean]]) extends T_B[C]

val v_a: T_B[T_A[T_A[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, CC_A(_, CC_A(_, _))) => 1 
}
}