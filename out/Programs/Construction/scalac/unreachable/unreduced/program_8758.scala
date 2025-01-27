package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[(Char,Byte)]], b: T_B[Byte], c: T_B[T_A[Int]]) extends T_A[T_B[T_B[Char]]]
case class CC_B(a: (T_A[CC_A],Byte)) extends T_A[T_B[T_B[Char]]]

val v_a: T_A[T_B[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B((_,_)) => 1 
}
}