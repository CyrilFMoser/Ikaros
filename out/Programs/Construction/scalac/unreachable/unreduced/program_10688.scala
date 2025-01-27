package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Char) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: T_A[CC_A], b: T_A[T_A[Boolean]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_C[C](a: T_B[C], b: Int) extends T_B[C]
case class CC_D(a: CC_B) extends T_B[T_A[(CC_B,CC_A)]]
case class CC_E(a: CC_A, b: T_B[(CC_B,CC_B)], c: CC_D) extends T_B[T_A[(CC_B,CC_A)]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}