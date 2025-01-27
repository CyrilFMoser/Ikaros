package Program_21 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Char],Int)) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: (CC_A,CC_A), b: CC_A, c: T_A[T_A[CC_A]]) extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: CC_A) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}