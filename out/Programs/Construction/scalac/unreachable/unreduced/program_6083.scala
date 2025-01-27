package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte, b: (T_A[Int, Char],T_A[Boolean, Boolean]), c: T_A[C, C]) extends T_A[Int, C]
case class CC_B[D](a: CC_A[D]) extends T_A[Int, D]
case class CC_C[E](a: CC_A[E], b: T_A[Int, E], c: E) extends T_A[Int, E]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _, _),_), _) => 0 
  case CC_A(_, (CC_B(_),_), _) => 1 
  case CC_A(_, (CC_C(_, _, _),_), _) => 2 
  case CC_B(CC_A(_, _, _)) => 3 
  case CC_C(_, _, 'x') => 4 
  case CC_C(_, _, _) => 5 
}
}