package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[T_B, (Char,Char)], c: T_B) extends T_A[(T_A[T_B, Char],T_B), Byte]
case class CC_B(a: T_B, b: CC_A, c: T_A[T_A[Byte, CC_A], T_A[CC_A, CC_A]]) extends T_A[(T_A[T_B, Char],T_B), Byte]
case class CC_C(a: CC_A, b: Byte, c: T_B) extends T_A[(T_A[T_B, Char],T_B), Byte]

val v_a: T_A[(T_A[T_B, Char],T_B), Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, _, _), _) => 1 
  case CC_C(_, _, _) => 2 
}
}