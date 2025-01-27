package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: T_A[T_B], c: T_A[Byte]) extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C(a: (CC_B,CC_A)) extends T_A[T_B]

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(), _) => 1 
  case CC_A(_, CC_C((_,_)), _) => 2 
  case CC_B() => 3 
  case CC_C((CC_B(),CC_A(_, _, _))) => 4 
}
}