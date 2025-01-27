package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, C]) extends T_A[T_A[T_A[Char, Byte], T_A[Boolean, (Boolean,Char)]], C]
case class CC_B[E](a: E, b: CC_A[E, E], c: CC_A[CC_A[E, (Byte,Char)], E]) extends T_A[T_A[T_A[Char, Byte], T_A[Boolean, (Boolean,Char)]], E]
case class CC_C[F](a: CC_B[CC_A[Int, F]], b: CC_B[F]) extends T_A[T_A[T_A[Char, Byte], T_A[Boolean, (Boolean,Char)]], F]

val v_a: T_A[T_A[T_A[Char, Byte], T_A[Boolean, (Boolean,Char)]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), CC_A(_)) => 1 
}
}
// This is not matched: CC_C(CC_B(_, CC_A(_), _), _)