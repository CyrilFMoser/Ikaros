package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Int, Char], Int], b: T_A[T_B[(Char,Byte), Int]]) extends T_A[T_A[T_B[Char, (Char,Byte)]]]
case class CC_B(a: T_B[T_A[CC_A], T_B[Byte, CC_A]]) extends T_A[T_A[T_B[Char, (Char,Byte)]]]
case class CC_C() extends T_A[T_A[T_B[Char, (Char,Byte)]]]

val v_a: T_A[T_A[T_B[Char, (Char,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_)