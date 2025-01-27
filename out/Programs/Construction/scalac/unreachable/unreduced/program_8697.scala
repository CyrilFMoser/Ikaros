package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Char, T_B[Int, Int]]) extends T_A[T_B[T_B[Boolean, Boolean], T_B[Int, Int]]]
case class CC_B(a: T_B[T_A[Byte], T_A[(Int,Int)]], b: T_A[T_A[CC_A]], c: Char) extends T_A[T_B[T_B[Boolean, Boolean], T_B[Int, Int]]]
case class CC_C(a: (CC_B,Int), b: (T_B[CC_B, CC_B],(CC_B,CC_A)), c: Byte) extends T_A[T_B[T_B[Boolean, Boolean], T_B[Int, Int]]]

val v_a: T_A[T_B[T_B[Boolean, Boolean], T_B[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(_, _, _)