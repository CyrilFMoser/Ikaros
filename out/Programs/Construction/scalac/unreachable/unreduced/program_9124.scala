package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Char], T_B[Int, (Char,Char)]], b: T_A[T_B[Int, Char]]) extends T_A[T_B[T_B[Boolean, Int], T_A[Byte]]]
case class CC_B(a: T_B[Byte, T_B[Boolean, CC_A]], b: T_A[Char]) extends T_A[CC_A]
case class CC_C() extends T_A[CC_A]

val v_a: T_A[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
}
}