package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_A, T_A], b: Boolean) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D[C](a: CC_C, b: T_B[CC_A, C]) extends T_B[CC_A, C]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}