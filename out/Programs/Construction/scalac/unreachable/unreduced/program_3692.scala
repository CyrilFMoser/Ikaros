package Program_20 

object Test {
sealed trait T_A[A]
case class CC_A(a: ((Char,Char),Int), b: Int, c: T_A[(Int,Int)]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: T_A[CC_A], b: (CC_A,Boolean)) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: CC_B, b: CC_A) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, (CC_A(_, _, _),_)) => 1 
  case CC_C(_, _) => 2 
}
}