package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, C], b: D, c: Byte) extends T_A[C, T_A[T_A[C, C], C]]
case class CC_B(a: CC_A[Boolean, T_A[Boolean, Boolean]], b: T_A[T_A[Char, Int], T_A[Boolean, Int]], c: CC_A[T_A[Char, Byte], (Byte,Int)]) extends T_A[CC_A[T_A[Byte, (Char,Boolean)], CC_A[Int, Boolean]], T_A[T_A[CC_A[T_A[Byte, (Char,Boolean)], CC_A[Int, Boolean]], CC_A[T_A[Byte, (Char,Boolean)], CC_A[Int, Boolean]]], CC_A[T_A[Byte, (Char,Boolean)], CC_A[Int, Boolean]]]]

val v_a: CC_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}