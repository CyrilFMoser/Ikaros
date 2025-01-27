package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Boolean) extends T_A[T_A[T_A[Boolean, Int], Byte], T_A[(Int,Int), T_A[Boolean, (Byte,Int)]]]
case class CC_B(a: Byte, b: CC_A, c: T_A[Int, T_A[Int, CC_A]]) extends T_A[T_A[T_A[Boolean, Int], Byte], T_A[(Int,Int), T_A[Boolean, (Byte,Int)]]]
case class CC_C() extends T_A[T_A[T_A[Boolean, Int], Byte], T_A[(Int,Int), T_A[Boolean, (Byte,Int)]]]

val v_a: T_A[T_A[T_A[Boolean, Int], Byte], T_A[(Int,Int), T_A[Boolean, (Byte,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C()