package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_A[Int],Char), b: Boolean) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: T_A[T_A[(Boolean,Byte)]], b: T_B[T_A[Char], T_A[Byte]], c: T_B[Char, T_A[CC_A]]) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}