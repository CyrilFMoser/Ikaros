package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[T_A[Byte, Int], T_A[Char, Char]], E]
case class CC_B[F](a: CC_A[F], b: T_B[F, F], c: F) extends T_A[T_B[T_A[Byte, Int], T_A[Char, Char]], F]
case class CC_C[G](a: CC_B[G], b: CC_B[G]) extends T_A[T_B[T_A[Byte, Int], T_A[Char, Char]], G]
case class CC_D[H](a: H, b: H) extends T_B[H, CC_C[Boolean]]
case class CC_E(a: (CC_D[Int],Byte), b: T_B[CC_C[Byte], CC_C[Boolean]]) extends T_B[CC_D[T_A[Byte, Int]], CC_C[Boolean]]

val v_a: T_A[T_B[T_A[Byte, Int], T_A[Char, Char]], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(CC_B(CC_A(), _, _), CC_B(_, _, _)) => 1 
}
}
// This is not matched: CC_B(_, _, _)