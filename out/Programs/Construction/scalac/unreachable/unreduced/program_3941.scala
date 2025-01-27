package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[C]
case class CC_B(a: T_B[T_A[Byte]]) extends T_A[T_B[T_A[Char]]]
case class CC_C(a: CC_A[T_A[CC_B]], b: CC_A[T_B[CC_B]]) extends T_A[T_B[T_A[Char]]]
case class CC_D(a: CC_B, b: T_A[T_B[Char]]) extends T_B[Char]
case class CC_E(a: CC_D) extends T_B[Char]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_), CC_A(CC_A(_))) => 0 
  case CC_E(_) => 1 
}
}