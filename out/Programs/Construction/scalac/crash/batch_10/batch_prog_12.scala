package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: B, c: (T_A[Char],Char)) extends T_A[B]
case class CC_B(a: CC_A[T_A[Int]]) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, (_,_)), _, (CC_A(_, _, _),_)) => 0 
}
}