package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_A[T_B]]
case class CC_B(a: T_A[Int], b: T_A[T_A[T_B]]) extends T_B
case class CC_C(a: Int, b: CC_A) extends T_B
case class CC_D(a: T_A[T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, CC_A(CC_B(_, _))) => 1 
  case CC_C(_, CC_A(CC_C(_, _))) => 2 
  case CC_C(_, CC_A(CC_D(_))) => 3 
  case CC_D(_) => 4 
}
}