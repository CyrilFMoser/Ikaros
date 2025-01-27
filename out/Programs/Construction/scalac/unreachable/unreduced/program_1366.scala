package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[T_A[Char]]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: CC_A, b: (T_A[CC_A],(CC_A,CC_A)), c: (T_A[CC_A],Int)) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}