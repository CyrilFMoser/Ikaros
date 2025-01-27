package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Byte, Char], Char], b: T_A[T_A[Int]]) extends T_A[T_B[T_B[Byte, Int], T_A[Byte]]]
case class CC_B(a: Byte) extends T_A[T_B[T_B[Byte, Int], T_A[Byte]]]
case class CC_C[D]() extends T_B[T_A[CC_B], D]
case class CC_D[E]() extends T_B[T_A[CC_B], E]
case class CC_E[F](a: CC_A, b: T_B[T_A[CC_B], F], c: CC_C[F]) extends T_B[T_A[CC_B], F]

val v_a: T_B[T_A[CC_B], CC_B] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D() => 1 
  case CC_E(CC_A(_, _), CC_C(), CC_C()) => 2 
  case CC_E(CC_A(_, _), CC_E(CC_A(_, _), CC_C(), CC_C()), CC_C()) => 3 
  case CC_E(CC_A(_, _), CC_E(CC_A(_, _), CC_D(), CC_C()), CC_C()) => 4 
  case CC_E(CC_A(_, _), CC_E(CC_A(_, _), CC_E(_, _, _), CC_C()), CC_C()) => 5 
}
}
// This is not matched: CC_E(CC_A(_, _), CC_D(), CC_C())