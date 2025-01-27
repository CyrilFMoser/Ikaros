package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_B, b: Char) extends T_A[C, D]
case class CC_B(a: T_A[T_A[(Int,Int), T_B], (T_B,T_B)], b: Boolean) extends T_B
case class CC_C(a: CC_B) extends T_B
case class CC_D(a: Boolean) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), true) => 0 
  case CC_B(CC_A(_, _), false) => 1 
  case CC_C(CC_B(_, _)) => 2 
  case CC_D(true) => 3 
  case CC_D(false) => 4 
}
}