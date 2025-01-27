package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_A[T_B, T_B],(T_B,T_B))) extends T_A[T_B, C]
case class CC_B(a: T_A[T_B, (Boolean,(Char,Int))]) extends T_A[T_B, CC_A[T_A[(Char,Byte), T_B]]]
case class CC_C(a: T_A[Int, CC_B], b: Char, c: T_A[((Int,Char),Char), T_B]) extends T_A[T_B, CC_A[T_A[(Char,Byte), T_B]]]

val v_a: T_A[T_B, CC_A[T_A[(Char,Byte), T_B]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(CC_A((_,_)))