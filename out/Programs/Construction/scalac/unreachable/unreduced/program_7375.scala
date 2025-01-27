package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]]) extends T_A[Byte]
case class CC_B(a: CC_A, b: (T_A[Byte],Int)) extends T_A[Byte]
case class CC_C(a: CC_B, b: Byte, c: T_A[T_A[CC_A]]) extends T_A[CC_A]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}