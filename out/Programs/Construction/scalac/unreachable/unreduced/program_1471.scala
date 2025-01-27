package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: C, c: Int) extends T_A[C, Char]
case class CC_B() extends T_B
case class CC_C(a: Int) extends T_B
case class CC_D(a: Char, b: CC_B, c: T_A[(CC_B,T_B), CC_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_D(_, CC_B(), _) => 1 
}
}
// This is not matched: CC_C(_)