package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: ((Char,Char),T_A[Int]), c: T_A[T_A[Int]]) extends T_A[T_A[T_A[Int]]]
case class CC_B() extends T_A[T_A[T_A[Int]]]
case class CC_C(a: T_A[(Int,Char)], b: T_A[CC_B], c: T_A[(CC_B,Byte)]) extends T_A[CC_B]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, ((_,_),_), _) => 0 
  case CC_B() => 1 
}
}