package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[(Char,Int), Char], C]
case class CC_B[D](a: Char, b: Byte, c: T_A[D, CC_A[D]]) extends T_A[D, T_A[(Boolean,Int), CC_A[(Int,Int)]]]
case class CC_C(a: (CC_B[Boolean],T_A[Int, Char]), b: CC_B[T_A[Char, Char]]) extends T_A[CC_B[Boolean], T_A[(Boolean,Int), CC_A[(Int,Int)]]]

val v_a: T_A[CC_B[Boolean], T_A[(Boolean,Int), CC_A[(Int,Int)]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _) => 1 
}
}