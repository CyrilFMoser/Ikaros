package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Char,Byte)], b: T_A[T_A[Byte]], c: T_A[(Char,Byte)]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: CC_A, b: T_A[(Int,Int)]) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: (T_A[CC_B],T_A[Char]), b: CC_A, c: (CC_A,Int)) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}