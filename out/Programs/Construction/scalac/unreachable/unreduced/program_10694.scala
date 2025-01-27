package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_B) extends T_A[T_B, Byte]
case class CC_B() extends T_A[T_B, Byte]
case class CC_C(a: T_A[(Int,(Byte,Int)), (Char,Char)]) extends T_A[T_B, Byte]
case class CC_D(a: Char, b: CC_A[T_A[CC_C, CC_B]]) extends T_B
case class CC_E() extends T_B
case class CC_F() extends T_B

val v_a: T_A[T_B, Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(_, _)