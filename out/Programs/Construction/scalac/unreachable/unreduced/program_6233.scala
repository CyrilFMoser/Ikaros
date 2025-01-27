package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B(a: T_A[CC_A], b: T_A[T_B]) extends T_A[T_B]
case class CC_C(a: ((CC_A,CC_B),CC_A)) extends T_A[T_B]

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
  case CC_B(_, CC_C((_,_))) => 3 
  case CC_C(((_,_),CC_A())) => 4 
}
}