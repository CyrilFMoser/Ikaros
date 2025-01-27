package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Boolean]]) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: T_B[T_A[CC_A]], b: CC_A) extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: CC_B, b: CC_A, c: T_A[T_B[Char]]) extends T_A[T_A[T_A[Byte]]]
case class CC_D[C](a: Byte, b: CC_B) extends T_B[C]
case class CC_E(a: CC_B) extends T_B[T_B[Byte]]

val v_a: T_B[T_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
}
}
// This is not matched: CC_E(CC_B(CC_D(_, _), CC_A(_)))