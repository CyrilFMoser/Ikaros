package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Char) extends T_A[T_A[C, C], C]
case class CC_B(a: T_A[Int, Char], b: (T_B,CC_A[T_B])) extends T_B
case class CC_C() extends T_B
case class CC_D(a: CC_A[T_B], b: CC_B, c: Boolean) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
  case CC_D(_, _, _) => 2 
}
}