package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Boolean, b: T_A[Char], c: T_A[T_B[Char, Char]]) extends T_A[Char]
case class CC_B(a: T_A[T_B[CC_A, CC_A]]) extends T_A[Char]
case class CC_C(a: (CC_A,T_A[CC_A]), b: T_B[CC_A, CC_B]) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}