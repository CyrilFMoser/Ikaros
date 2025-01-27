package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[E], b: E) extends T_A[E, D]
case class CC_B[G, F](a: T_A[G, G]) extends T_A[G, F]
case class CC_C(a: T_B[T_A[Char, Boolean]], b: T_A[T_B[Boolean], T_A[Char, (Byte,Char)]]) extends T_B[T_A[(Boolean,Byte), T_A[Byte, Byte]]]
case class CC_D(a: T_A[Boolean, Boolean], b: Int) extends T_B[T_A[(Boolean,Byte), T_A[Byte, Byte]]]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_B(_)) => 1 
}
}
// This is not matched: CC_B(CC_A(_, _))