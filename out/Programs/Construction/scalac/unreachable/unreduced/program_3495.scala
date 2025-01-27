package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_A, T_B[Int, T_A]]) extends T_A
case class CC_B[C](a: CC_A, b: T_B[C, C], c: T_B[C, C]) extends T_A
case class CC_C() extends T_A
case class CC_D[D](a: CC_A, b: D, c: Boolean) extends T_B[D, CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}