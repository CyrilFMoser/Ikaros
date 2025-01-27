package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Byte, Int], T_B[Byte, Char]]) extends T_A[T_B[Char, T_B[Int, (Int,Char)]]]
case class CC_B(a: T_A[CC_A], b: T_A[T_B[CC_A, CC_A]], c: T_A[CC_A]) extends T_A[T_B[Char, T_B[Int, (Int,Char)]]]
case class CC_C(a: (CC_A,(CC_B,Int)), b: CC_B, c: T_A[CC_A]) extends T_A[T_B[Char, T_B[Int, (Int,Char)]]]

val v_a: T_A[T_B[Char, T_B[Int, (Int,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, CC_B(_, _, _), _) => 2 
}
}