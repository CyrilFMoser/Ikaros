package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_A[D]) extends T_A[T_A[T_B[Boolean, Boolean]]]
case class CC_B(a: T_B[CC_A[Int], Byte]) extends T_A[T_A[T_B[Boolean, Boolean]]]
case class CC_C(a: CC_A[CC_A[CC_B]]) extends T_B[CC_B, T_B[T_A[(Char,Byte)], CC_A[CC_B]]]
case class CC_D[E](a: (T_B[CC_C, CC_B],Int), b: Char, c: T_A[E]) extends T_B[CC_A[T_B[CC_C, CC_B]], E]

val v_a: T_A[T_A[T_B[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}