package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[B], b: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: Int, b: T_A[T_A[T_B]], c: (CC_A[Char],Int)) extends T_A[T_B]
case class CC_C(a: T_A[CC_B]) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_, _, _)) => 1 
  case CC_B(12, _, (_,_)) => 2 
  case CC_B(_, _, (_,_)) => 3 
}
}