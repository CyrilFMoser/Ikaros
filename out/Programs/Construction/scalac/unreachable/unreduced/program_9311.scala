package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Byte, b: T_B[T_B[Char, Char], T_B[Boolean, Char]]) extends T_A[T_B[T_A[Int], T_B[Byte, Boolean]]]
case class CC_B(a: (T_B[CC_A, CC_A],T_A[CC_A]), b: T_A[T_B[CC_A, (Byte,Byte)]]) extends T_A[T_B[T_A[Int], T_B[Byte, Boolean]]]

val v_a: T_A[T_B[T_A[Int], T_B[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((_,_), _) => 1 
}
}