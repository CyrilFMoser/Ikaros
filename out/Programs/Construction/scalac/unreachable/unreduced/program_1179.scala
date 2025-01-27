package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[E, F], b: T_A[E, F], c: E) extends T_A[E, F]
case class CC_B[G]() extends T_A[(T_A[Char, Boolean],T_B[Int, Boolean]), G]
case class CC_C[H](a: T_A[H, H], b: T_B[H, H]) extends T_B[H, CC_B[Int]]
case class CC_D[I]() extends T_B[I, CC_B[Int]]

val v_a: T_B[Byte, CC_B[Int]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _), _) => 0 
  case CC_D() => 1 
}
}