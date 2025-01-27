package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[C, Char], C]]
case class CC_B[D](a: (T_A[(Boolean,Char), Int],Int), b: Int, c: ((Int,Char),T_A[Byte, Int])) extends T_A[D, T_A[T_A[D, Char], D]]
case class CC_C[E](a: CC_A[E], b: (CC_B[Char],CC_A[(Byte,Int)])) extends T_A[E, T_A[T_A[E, Char], E]]

val v_a: T_A[Char, T_A[T_A[Char, Char], Char]] = null
val v_b: Int = v_a match{
  case CC_B((_,_), _, ((_,_),_)) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A()