package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_A[(Boolean,Boolean)],T_A[T_B]), b: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: Byte) extends T_A[T_B]
case class CC_C() extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A((_,CC_A(_, _)), CC_A((_,_), _)) => 0 
  case CC_A((_,CC_A(_, _)), CC_B(_)) => 1 
  case CC_A((_,CC_B(_)), CC_A((_,_), _)) => 2 
  case CC_A((_,CC_B(_)), CC_B(_)) => 3 
  case CC_B(_) => 4 
}
}