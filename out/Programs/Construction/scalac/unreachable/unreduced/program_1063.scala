package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_B, c: T_A[T_A[T_B]]) extends T_A[T_A[T_A[T_B]]]
case class CC_B() extends T_A[T_A[T_A[T_B]]]
case class CC_C[B]() extends T_B
case class CC_D(a: ((T_B,CC_A),CC_B)) extends T_B

val v_a: T_A[T_A[T_A[T_B]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(), _) => 0 
  case CC_A(_, CC_D(_), _) => 1 
  case CC_B() => 2 
}
}