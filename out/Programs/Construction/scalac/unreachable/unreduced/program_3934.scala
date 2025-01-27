package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B], c: T_A[B]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: ((Int,Int),Boolean), b: Char, c: T_A[CC_A[Char]]) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(((_,_),_), _, _) => 1 
}
}