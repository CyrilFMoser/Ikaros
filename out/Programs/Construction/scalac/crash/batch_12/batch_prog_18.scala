package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Boolean]]) extends T_A[T_A[T_B[Byte]]]
case class CC_B(a: Byte, b: T_B[Byte]) extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
}
}