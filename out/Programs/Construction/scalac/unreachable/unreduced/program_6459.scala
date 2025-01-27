package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Boolean]]) extends T_A[T_A[T_B[Boolean]]]
case class CC_B(a: T_A[Char], b: (Char,T_A[Boolean])) extends T_A[CC_A]
case class CC_C(a: T_A[T_A[CC_A]], b: Byte) extends T_B[CC_A]
case class CC_D() extends T_B[CC_A]
case class CC_E(a: Boolean, b: CC_B) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D() => 1 
  case CC_E(_, _) => 2 
}
}