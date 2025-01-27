package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: ((Byte,Byte),T_B[Boolean]), b: T_B[T_B[(Byte,Char)]], c: T_A[(Boolean,Byte)]) extends T_A[Char]
case class CC_B(a: Char, b: T_B[T_A[(Byte,Int)]]) extends T_A[Char]
case class CC_C(a: T_A[Char], b: (CC_B,CC_B)) extends T_A[Char]
case class CC_D(a: CC_A) extends T_B[T_A[Char]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(_, _)