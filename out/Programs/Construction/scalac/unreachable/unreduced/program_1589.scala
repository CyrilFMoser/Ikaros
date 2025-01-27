package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[T_B[D]], b: D, c: Boolean) extends T_A[D, T_A[D, D]]
case class CC_B(a: Byte, b: T_A[T_B[Byte], T_B[Char]], c: T_B[Int]) extends T_B[T_B[CC_A[Char]]]
case class CC_C(a: Boolean, b: CC_A[(CC_B,CC_B)], c: CC_B) extends T_B[T_B[CC_A[Char]]]
case class CC_D() extends T_B[T_B[CC_A[Char]]]

val v_a: T_B[T_B[CC_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _, CC_B(_, _, _)) => 1 
  case CC_D() => 2 
}
}