package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: T_A[C, C]) extends T_A[C, (T_A[(Int,Char), (Int,Boolean)],T_A[Byte, Byte])]
case class CC_B[D](a: Char) extends T_A[D, (T_A[(Int,Char), (Int,Boolean)],T_A[Byte, Byte])]

val v_a: T_A[Int, (T_A[(Int,Char), (Int,Boolean)],T_A[Byte, Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B('x') => 1 
  case CC_B(_) => 2 
}
}