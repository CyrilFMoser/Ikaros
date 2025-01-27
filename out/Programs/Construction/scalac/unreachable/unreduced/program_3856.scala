package Program_25 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]]) extends T_A[T_A[(Char,Int)]]
case class CC_B(a: Char) extends T_A[T_A[(Char,Int)]]
case class CC_C(a: (CC_A,T_A[CC_B])) extends T_A[T_A[(Char,Int)]]

val v_a: T_A[T_A[(Char,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B('x') => 1 
  case CC_B(_) => 2 
  case CC_C((CC_A(_),_)) => 3 
}
}