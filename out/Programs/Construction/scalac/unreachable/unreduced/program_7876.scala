package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_B]
case class CC_B[B](a: T_B) extends T_B
case class CC_C(a: T_A[((Byte,Boolean),CC_A)], b: (T_B,Char)) extends T_B
case class CC_D(a: Int, b: Byte, c: Boolean) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(_, _, _) => 1 
}
}
// This is not matched: CC_B(_)