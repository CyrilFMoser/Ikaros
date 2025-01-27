package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte) extends T_A[C, (T_A[(Int,Char), Int],T_A[Char, Byte])]
case class CC_B[D](a: CC_A[D], b: T_A[D, D]) extends T_A[D, (T_A[(Int,Char), Int],T_A[Char, Byte])]

val v_a: T_A[Char, (T_A[(Int,Char), Int],T_A[Char, Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _) => 1 
}
}