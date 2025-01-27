package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte, b: (T_A[Boolean],T_A[Boolean])) extends T_A[T_A[T_A[Boolean]]]
case class CC_B[B](a: B, b: Int, c: T_A[B]) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(0, (_,_)) => 0 
  case CC_A(_, (_,_)) => 1 
  case CC_B(_, _, _) => 2 
}
}