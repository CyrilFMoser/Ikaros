package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: Boolean) extends T_A[C, (T_A[Boolean, Char],(Char,Byte))]
case class CC_B[D](a: Boolean, b: T_A[D, D]) extends T_A[D, (T_A[Boolean, Char],(Char,Byte))]
case class CC_C[E](a: Boolean, b: CC_A[E], c: CC_B[(Boolean,Char)]) extends T_A[E, (T_A[Boolean, Char],(Char,Byte))]

val v_a: T_A[Byte, (T_A[Boolean, Char],(Char,Byte))] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, CC_A(_, _), CC_B(_, _)) => 1 
}
}
// This is not matched: CC_B(_, _)