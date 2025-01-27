package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A(a: Boolean, b: Boolean, c: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_B(a: (CC_A,T_A[CC_A]), b: Boolean) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B((_,_), _)) => 1 
  case CC_B((CC_A(_, _, _),_), _) => 2 
}
}