package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte) extends T_A[C, (T_A[Int, Boolean],T_A[Byte, Char])]
case class CC_B[D](a: CC_A[D], b: T_A[D, D], c: D) extends T_A[D, (T_A[Int, Boolean],T_A[Byte, Char])]

val v_a: T_A[Byte, (T_A[Int, Boolean],T_A[Byte, Char])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _, _) => 1 
}
}