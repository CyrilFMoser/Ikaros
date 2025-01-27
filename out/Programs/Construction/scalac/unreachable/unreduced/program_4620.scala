package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[Byte]]
case class CC_B(a: CC_A, b: CC_A, c: CC_A) extends T_A[T_B[Byte]]
case class CC_C(a: T_A[T_B[Byte]], b: Char, c: T_B[((Boolean,Int),CC_A)]) extends T_B[T_A[((Int,Byte),CC_A)]]
case class CC_D(a: Byte, b: CC_B, c: CC_B) extends T_B[T_A[((Int,Byte),CC_A)]]
case class CC_E(a: CC_B, b: T_B[CC_A], c: CC_D) extends T_B[T_A[((Int,Byte),CC_A)]]

val v_a: T_B[T_A[((Int,Byte),CC_A)]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(_, CC_B(CC_A(), _, CC_A()), _) => 1 
}
}
// This is not matched: CC_E(_, _, _)