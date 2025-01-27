package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[B], b: T_B, c: T_B) extends T_A[T_A[Byte]]
case class CC_B() extends T_A[T_A[Byte]]
case class CC_C(a: CC_A[Boolean]) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, CC_D(), _)) => 0 
  case CC_D() => 1 
}
}
// This is not matched: CC_C(CC_A(_, CC_C(_), _))