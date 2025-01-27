package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Boolean, b: T_A[D, C], c: C) extends T_A[(T_A[Byte, (Int,Int)],T_A[Char, Char]), C]
case class CC_B[E](a: E, b: (CC_A[Int, Char],T_A[(Int,Boolean), Byte]), c: CC_A[E, E]) extends T_A[(T_A[Byte, (Int,Int)],T_A[Char, Char]), E]

val v_a: T_A[(T_A[Byte, (Int,Int)],T_A[Char, Char]), Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, (CC_A(_, _, _),_), _) => 1 
}
}