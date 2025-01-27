package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[(T_B,T_B), C], b: (T_A[T_B, (Boolean,Char)],Byte), c: T_A[(T_B,T_B), C]) extends T_A[(T_B,T_B), C]
case class CC_B(a: T_A[T_B, CC_A[T_B]], b: T_A[(T_B,T_B), CC_A[T_B]], c: T_A[T_B, (Int,T_B)]) extends T_B
case class CC_C[D](a: CC_A[D]) extends T_B
case class CC_D(a: CC_B, b: CC_B, c: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(CC_B(_, _, _), CC_B(_, _, _), CC_B(_, _, _)) => 1 
}
}
// This is not matched: CC_B(_, CC_A(_, _, CC_A(_, _, _)), _)