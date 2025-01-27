package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte, b: (Char,T_A[(Int,Boolean), (Int,Byte)])) extends T_A[C, T_A[C, C]]
case class CC_B[D]() extends T_A[D, T_A[D, D]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(0, (_,_)) => 0 
  case CC_A(_, (_,_)) => 1 
  case CC_B() => 2 
}
}