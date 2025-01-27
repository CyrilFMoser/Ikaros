package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[C]
case class CC_B(a: CC_A[T_A[Byte]]) extends T_A[T_A[Boolean]]
case class CC_C(a: Char, b: Boolean) extends T_A[T_A[Boolean]]
case class CC_D(a: CC_B) extends T_B[Byte]
case class CC_E(a: Char, b: T_A[CC_B], c: T_B[T_B[Byte]]) extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(CC_A(_))) => 0 
  case CC_E(_, CC_A(CC_A(_)), _) => 1 
}
}