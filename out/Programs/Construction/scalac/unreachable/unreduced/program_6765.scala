package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: (T_A[(Int,Int)],T_A[Char]), c: Char) extends T_A[T_A[T_A[Boolean]]]
case class CC_B[B]() extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: (CC_A,CC_A), b: T_A[CC_B[CC_A]]) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}