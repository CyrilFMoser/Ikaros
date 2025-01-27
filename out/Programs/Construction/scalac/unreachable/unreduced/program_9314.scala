package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: (Int,T_A[Boolean, Char]), c: T_A[D, D]) extends T_A[T_B[T_B[(Byte,Byte)]], D]
case class CC_B(a: T_B[CC_A[Char]]) extends T_B[CC_A[T_B[Char]]]
case class CC_C(a: CC_A[T_B[CC_B]]) extends T_B[CC_A[T_B[Char]]]
case class CC_D(a: ((CC_C,(Char,Int)),CC_C)) extends T_B[CC_A[T_B[Char]]]

val v_a: T_B[CC_A[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_C(CC_A(_, _, _))