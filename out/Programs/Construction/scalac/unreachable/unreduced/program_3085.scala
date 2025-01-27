package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Byte], T_A[(Int,Byte), Char]], b: Int, c: T_A[T_A[Char, Boolean], T_A[Char, (Byte,Int)]]) extends T_A[T_A[(Boolean,Boolean), T_A[Char, Char]], T_A[Byte, T_A[Byte, Int]]]
case class CC_B(a: Byte) extends T_A[T_A[(Boolean,Boolean), T_A[Char, Char]], T_A[Byte, T_A[Byte, Int]]]

val v_a: T_A[T_A[(Boolean,Boolean), T_A[Char, Char]], T_A[Byte, T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(_) => 2 
}
}