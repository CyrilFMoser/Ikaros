package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: C, c: ((Char,Boolean),T_A[Boolean, Byte])) extends T_A[T_A[C, C], C]
case class CC_B[D]() extends T_A[T_A[D, D], D]
case class CC_C[E](a: T_A[CC_B[E], E]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, ((_,_),_)) => 0 
  case CC_A(CC_B(), _, ((_,_),_)) => 1 
  case CC_A(CC_C(_), _, ((_,_),_)) => 2 
  case CC_B() => 3 
  case CC_C(_) => 4 
}
}