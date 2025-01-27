package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[C]
case class CC_B(a: Byte, b: Boolean, c: CC_A[CC_A[Byte]]) extends T_A[T_B[Boolean]]
case class CC_C(a: T_A[T_A[(Boolean,Int)]], b: CC_A[((Byte,Byte),CC_B)]) extends T_A[T_B[Boolean]]

val v_a: T_A[T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(_, CC_A(_))