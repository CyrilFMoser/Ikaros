package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_B,Boolean)) extends T_A[Char, C]
case class CC_B() extends T_B
case class CC_C(a: Int) extends T_B
case class CC_D(a: CC_B, b: T_A[CC_B, T_A[Char, CC_C]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_) => 1 
  case CC_D(CC_B(), _) => 2 
}
}