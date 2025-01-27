package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Byte, (Byte,Byte)],Char)) extends T_A[Int, C]
case class CC_B[D](a: Boolean, b: D, c: T_A[Int, D]) extends T_A[Int, D]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_, _, CC_A((_,_))) => 1 
  case CC_B(_, _, CC_B(_, _, _)) => 2 
}
}