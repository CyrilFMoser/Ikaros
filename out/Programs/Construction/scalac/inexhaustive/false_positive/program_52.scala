package Program_62 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_B) extends T_A[C, T_B]
case class CC_D() extends T_B
case class CC_E(a: CC_A[Boolean], b: CC_A[Boolean], c: CC_A[T_A[CC_D, (Int,Char)]]) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(_, _, CC_A(_, CC_E(_, _, _))) => 0 
}
}
// This is not matched: CC_D(_, CC_B(CC_B(_, _, _), _, CC_A()), CC_B(CC_B(_, _, _), _, _))