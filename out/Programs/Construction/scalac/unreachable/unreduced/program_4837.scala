package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Int], b: T_A[C, C], c: T_A[C, C]) extends T_A[C, Int]
case class CC_B[D](a: (Char,T_A[Int, Int])) extends T_A[D, Int]
case class CC_C(a: CC_A[(Int,(Byte,Char))]) extends T_A[(Int,CC_A[Char]), Int]

val v_a: T_A[CC_C, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, _) => 0 
  case CC_A(CC_A(CC_B(_), _, _), _, _) => 1 
  case CC_A(CC_B((_,_)), _, _) => 2 
  case CC_B((_,CC_A(_, _, _))) => 3 
  case CC_B((_,CC_B(_))) => 4 
}
}