package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[C]
case class CC_B(a: T_A[T_B[Byte]]) extends T_B[CC_A[Byte]]
case class CC_C(a: T_B[T_B[CC_B]]) extends T_B[CC_A[Byte]]

val v_a: T_B[CC_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_A(_))) => 0 
  case CC_C(_) => 1 
}
}