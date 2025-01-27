package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[(Int,Boolean)]], b: T_B[T_A[Int]]) extends T_A[T_B[((Byte,Boolean),(Char,Char))]]
case class CC_B(a: (T_A[CC_A],CC_A), b: T_A[T_B[CC_A]]) extends T_A[T_B[((Byte,Boolean),(Char,Char))]]

val v_a: T_A[T_B[((Byte,Boolean),(Char,Char))]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((_,CC_A(_, _)), _) => 1 
}
}