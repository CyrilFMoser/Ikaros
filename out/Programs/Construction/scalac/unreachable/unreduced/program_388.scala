package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_B) extends T_A[T_B]
case class CC_B(a: (CC_A,T_A[T_B]), b: (T_A[T_B],T_B), c: T_A[T_B]) extends T_A[T_B]
case class CC_C(a: T_A[Int], b: T_A[T_A[CC_A]]) extends T_A[T_B]
case class CC_D(a: T_A[T_B], b: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _), CC_B(_, _, _)) => 0 
  case CC_D(CC_B(_, _, _), CC_B(_, _, _)) => 1 
  case CC_D(CC_C(_, _), CC_B(_, _, _)) => 2 
}
}