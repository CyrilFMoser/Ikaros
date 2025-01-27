package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_A[Byte, T_B],T_A[T_B, T_B]), b: (T_B,T_B)) extends T_A[C, T_A[T_B, T_A[T_B, T_B]]]
case class CC_B[D](a: CC_A[D]) extends T_A[D, T_A[T_B, T_A[T_B, T_B]]]
case class CC_C() extends T_A[T_B, T_A[T_B, T_A[T_B, T_B]]]

val v_a: T_A[T_B, T_A[T_B, T_A[T_B, T_B]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B(CC_A((_,_), _)) => 1 
  case CC_C() => 2 
}
}