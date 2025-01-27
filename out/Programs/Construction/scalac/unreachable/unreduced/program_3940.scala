package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Int, b: Byte) extends T_A[C, T_A[(Int,Boolean), T_A[Byte, Int]]]
case class CC_B(a: CC_A[T_A[Int, Char], Byte], b: CC_A[CC_A[Char, Byte], CC_A[Boolean, Boolean]], c: T_A[CC_A[Boolean, Char], T_A[(Int,Char), Char]]) extends T_A[Byte, T_A[(Int,Boolean), T_A[Byte, Int]]]
case class CC_C() extends T_A[Byte, T_A[(Int,Boolean), T_A[Byte, Int]]]

val v_a: T_A[Byte, T_A[(Int,Boolean), T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}