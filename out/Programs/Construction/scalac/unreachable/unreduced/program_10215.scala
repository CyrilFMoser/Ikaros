package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Boolean, b: T_B[T_A, T_B[T_A, T_A]], c: Char) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: T_B[CC_B, CC_A]) extends T_A
case class CC_D[C](a: CC_B, b: Char) extends T_B[T_B[C, C], C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}