package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B]) extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C(a: T_B) extends T_B
case class CC_D(a: CC_B, b: CC_A, c: T_A[T_A[CC_A]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_C(CC_C(_))) => 0 
  case CC_C(CC_C(CC_D(_, _, _))) => 1 
  case CC_C(CC_D(CC_B(), _, _)) => 2 
  case CC_D(_, _, _) => 3 
}
}