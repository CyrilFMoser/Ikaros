package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte) extends T_A[C, (T_A[Int, Int],T_A[Byte, Int])]
case class CC_B[D](a: CC_A[D], b: T_A[D, D], c: T_A[D, D]) extends T_A[D, (T_A[Int, Int],T_A[Byte, Int])]
case class CC_C(a: Boolean) extends T_A[CC_A[CC_A[Byte]], (T_A[Int, Int],T_A[Byte, Int])]

val v_a: T_A[CC_A[CC_A[Byte]], (T_A[Int, Int],T_A[Byte, Int])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(true) => 2 
  case CC_C(false) => 3 
}
}