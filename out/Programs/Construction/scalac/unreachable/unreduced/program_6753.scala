package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[C, T_A[C, T_A[C, C]]]
case class CC_B(a: T_A[T_A[Boolean, Char], Boolean]) extends T_A[CC_A[Int], T_A[CC_A[Int], T_A[CC_A[Int], CC_A[Int]]]]
case class CC_C[D](a: CC_A[D], b: D) extends T_A[D, T_A[D, T_A[D, D]]]

val v_a: T_A[Byte, T_A[Byte, T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, _) => 1 
}
}