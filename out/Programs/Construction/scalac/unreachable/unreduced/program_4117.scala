package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Byte, Byte], T_A[Int, Int]]]
case class CC_B(a: T_A[T_A[(Byte,Char), Int], Boolean]) extends T_A[CC_A[CC_A[(Int,Int)]], T_A[T_A[Byte, Byte], T_A[Int, Int]]]
case class CC_C[D]() extends T_A[D, T_A[T_A[Byte, Byte], T_A[Int, Int]]]

val v_a: T_A[CC_A[CC_A[(Int,Int)]], T_A[T_A[Byte, Byte], T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}