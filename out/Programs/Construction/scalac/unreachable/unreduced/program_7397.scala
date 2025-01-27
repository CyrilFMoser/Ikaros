package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: T_A[Boolean]) extends T_A[Boolean]
case class CC_B[B](a: T_A[Boolean]) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, CC_A(_, _))) => 1 
  case CC_B(CC_A(_, CC_B(_))) => 2 
  case CC_B(CC_B(CC_A(_, _))) => 3 
  case CC_B(CC_B(CC_B(_))) => 4 
}
}