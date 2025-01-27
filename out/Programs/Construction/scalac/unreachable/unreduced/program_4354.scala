package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: T_A[Boolean]) extends T_A[Boolean]
case class CC_B(a: T_A[Boolean]) extends T_A[Boolean]
case class CC_C(a: CC_B) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(CC_A(_, _))) => 1 
  case CC_A(_, CC_B(CC_B(_))) => 2 
  case CC_A(_, CC_B(CC_C(_))) => 3 
  case CC_A(_, CC_C(CC_B(_))) => 4 
  case CC_B(CC_B(CC_A(_, _))) => 5 
  case CC_B(CC_B(CC_B(_))) => 6 
  case CC_B(CC_B(CC_C(_))) => 7 
  case CC_B(CC_C(CC_B(_))) => 8 
  case CC_C(CC_B(CC_A(_, _))) => 9 
  case CC_C(CC_B(CC_B(_))) => 10 
  case CC_C(CC_B(CC_C(_))) => 11 
}
}
// This is not matched: CC_B(CC_A(_, _))