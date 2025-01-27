package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: C, c: (T_A[(Byte,Char), Byte],T_A[Byte, Int])) extends T_A[(Int,Char), C]
case class CC_B(a: Boolean, b: (CC_A[(Boolean,Boolean)],T_A[(Byte,Boolean), Boolean]), c: T_A[(Int,Char), Char]) extends T_A[(Int,Char), Char]
case class CC_C[D](a: D, b: T_A[(Int,Char), D], c: D) extends T_A[D, T_A[CC_B, T_A[CC_B, CC_B]]]

val v_a: T_A[(Int,Char), Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_B(true, _, _) => 1 
  case CC_B(false, _, _) => 2 
}
}