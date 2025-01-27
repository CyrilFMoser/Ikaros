package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: ((Int,(Char,Int)),T_A[CC_A])) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: CC_A, b: (CC_B,CC_B), c: CC_B) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(((_,_),_)) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A(_)