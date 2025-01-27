package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Boolean, b: T_B[T_A[(Int,Byte)], T_B[Char, Char]], c: T_B[Boolean, T_B[Char, Char]]) extends T_A[T_B[T_A[Char], T_A[Char]]]
case class CC_B[D, E](a: CC_A) extends T_B[D, E]
case class CC_C() extends T_B[Char, T_B[T_A[CC_A], T_B[CC_A, Char]]]
case class CC_D(a: T_A[(CC_C,Int)]) extends T_B[Char, T_B[T_A[CC_A], T_B[CC_A, Char]]]

val v_a: T_B[Char, T_B[T_A[CC_A], T_B[CC_A, Char]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, CC_B(_))) => 0 
  case CC_C() => 1 
  case CC_D(_) => 2 
}
}