package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[Byte, T_A[Char, Byte]], C]
case class CC_B[D](a: D, b: Int) extends T_A[D, CC_A[CC_A[Boolean]]]

val v_a: T_A[Int, CC_A[CC_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
}
}