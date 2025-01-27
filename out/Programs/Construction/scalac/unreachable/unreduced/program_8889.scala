package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (((Boolean,Char),(Boolean,Byte)),T_A[Int, Char])) extends T_A[C, T_A[(Char,Char), (Boolean,Char)]]
case class CC_B[D](a: CC_A[T_A[D, D]], b: CC_A[D]) extends T_A[D, T_A[(Char,Char), (Boolean,Char)]]
case class CC_C[E](a: T_A[E, E]) extends T_A[E, T_A[(Char,Char), (Boolean,Char)]]

val v_a: T_A[Int, T_A[(Char,Char), (Boolean,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, ((_,_),_)) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}