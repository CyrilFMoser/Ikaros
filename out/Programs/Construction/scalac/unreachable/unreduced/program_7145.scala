package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Int, b: T_B[D, D], c: D) extends T_A[D]
case class CC_B(a: CC_A[T_A[Char]], b: T_A[T_B[Char, Boolean]], c: CC_A[CC_A[Int]]) extends T_A[T_A[T_B[(Boolean,Int), Boolean]]]
case class CC_C[E, F](a: F, b: T_A[E]) extends T_A[E]
case class CC_D() extends T_B[CC_C[T_A[(Int,Char)], T_A[CC_B]], CC_C[CC_B, T_A[CC_B]]]
case class CC_E(a: CC_A[(CC_B,CC_B)], b: CC_D) extends T_B[CC_C[T_A[(Int,Char)], T_A[CC_B]], CC_C[CC_B, T_A[CC_B]]]
case class CC_F() extends T_B[CC_C[T_A[(Int,Char)], T_A[CC_B]], CC_C[CC_B, T_A[CC_B]]]

val v_a: T_B[CC_C[T_A[(Int,Char)], T_A[CC_B]], CC_C[CC_B, T_A[CC_B]]] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_A(_, _, _), CC_D()) => 1 
  case CC_F() => 2 
}
}