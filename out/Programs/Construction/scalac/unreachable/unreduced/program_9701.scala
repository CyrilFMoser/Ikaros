package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[Byte], b: Char) extends T_A[D, T_A[D, (Byte,Char)]]
case class CC_B(a: T_B[Byte]) extends T_A[CC_A[T_B[(Int,Byte)]], T_A[CC_A[T_B[(Int,Byte)]], (Byte,Char)]]
case class CC_C[E](a: T_A[E, CC_A[E]], b: T_B[E], c: CC_B) extends T_B[E]
case class CC_D(a: Boolean, b: T_B[T_B[CC_B]]) extends T_B[(CC_B,CC_A[CC_B])]

val v_a: T_A[CC_A[T_B[(Int,Byte)]], T_A[CC_A[T_B[(Int,Byte)]], (Byte,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, CC_C(_, _, _), CC_B(_)), _) => 0 
  case CC_B(_) => 1 
}
}