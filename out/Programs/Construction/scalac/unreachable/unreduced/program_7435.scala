package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int, b: Byte) extends T_A
case class CC_B[C](a: ((Char,CC_A),Char), b: CC_A) extends T_B[T_B[CC_A, ((Byte,Char),CC_A)], C]
case class CC_C[D](a: Boolean, b: D) extends T_B[T_B[CC_A, ((Byte,Char),CC_A)], D]
case class CC_D(a: T_B[T_A, CC_B[CC_A]], b: CC_C[T_A], c: CC_C[T_B[T_A, T_A]]) extends T_B[T_B[CC_A, ((Byte,Char),CC_A)], T_A]

val v_a: T_B[T_B[CC_A, ((Byte,Char),CC_A)], T_A] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_D(_, CC_C(_, _), CC_C(_, _)) => 1 
}
}
// This is not matched: CC_C(_, _)