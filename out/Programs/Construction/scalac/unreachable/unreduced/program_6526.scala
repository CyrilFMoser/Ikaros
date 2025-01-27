package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: ((Boolean,Int),(Byte,Int))) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: (CC_A[(Int,Char)],Int), b: Int, c: T_A[D, D]) extends T_A[D, T_A[D, D]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(((_,_),(_,_))) => 0 
  case CC_B(_, 12, _) => 1 
  case CC_B(_, _, _) => 2 
}
}