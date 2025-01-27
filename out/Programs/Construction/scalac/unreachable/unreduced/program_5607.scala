package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Boolean, b: T_A[T_B[Char, Char]], c: (Char,T_B[Byte, Byte])) extends T_A[T_A[(Char,Int)]]
case class CC_B(a: T_B[CC_A, (CC_A,CC_A)], b: T_B[CC_A, T_A[CC_A]]) extends T_A[T_A[(Char,Int)]]
case class CC_C(a: CC_A, b: CC_A, c: T_B[T_B[CC_B, CC_A], (Char,(Byte,Boolean))]) extends T_A[T_A[(Char,Int)]]

val v_a: T_A[T_A[(Char,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(_, _, _), CC_A(_, _, (_,_)), _) => 2 
}
}