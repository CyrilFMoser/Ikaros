package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b: C) extends T_A[C, T_A[T_A[C, C], C]]
case class CC_B(a: CC_A[T_A[Char, Int]]) extends T_A[T_A[(Int,Char), T_A[Byte, Char]], T_A[T_A[T_A[(Int,Char), T_A[Byte, Char]], T_A[(Int,Char), T_A[Byte, Char]]], T_A[(Int,Char), T_A[Byte, Char]]]]
case class CC_C(a: CC_B, b: (CC_B,CC_B), c: T_A[T_A[CC_B, CC_B], CC_B]) extends T_A[T_A[(Int,Char), T_A[Byte, Char]], T_A[T_A[T_A[(Int,Char), T_A[Byte, Char]], T_A[(Int,Char), T_A[Byte, Char]]], T_A[(Int,Char), T_A[Byte, Char]]]]

val v_a: T_A[T_A[(Int,Char), T_A[Byte, Char]], T_A[T_A[T_A[(Int,Char), T_A[Byte, Char]], T_A[(Int,Char), T_A[Byte, Char]]], T_A[(Int,Char), T_A[Byte, Char]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}