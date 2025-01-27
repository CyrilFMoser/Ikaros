package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]]) extends T_A[T_A[T_B]]
case class CC_B(a: T_A[CC_A], b: T_B, c: Boolean) extends T_B
case class CC_C(a: ((CC_B,CC_B),T_B), b: (CC_A,T_A[T_B]), c: ((T_B,CC_A),CC_A)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), _) => 0 
  case CC_B(_, CC_B(_, CC_C(_, _, _), _), _) => 1 
  case CC_B(_, CC_C(_, _, (_,_)), _) => 2 
  case CC_C(_, _, _) => 3 
}
}