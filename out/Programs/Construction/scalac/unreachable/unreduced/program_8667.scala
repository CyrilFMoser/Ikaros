package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, C]) extends T_A[C, (T_A[Char, Boolean],T_A[(Boolean,Int), Int])]
case class CC_B[D](a: Int) extends T_A[D, (T_A[Char, Boolean],T_A[(Boolean,Int), Int])]

val v_a: T_A[Byte, (T_A[Char, Boolean],T_A[(Boolean,Int), Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}