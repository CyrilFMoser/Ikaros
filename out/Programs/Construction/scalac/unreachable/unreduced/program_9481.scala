package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_A[D], c: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: T_A[E], b: E) extends T_A[E]
case class CC_C(a: T_B[Int, T_A[Char]], b: T_B[CC_A[Byte], T_A[Boolean]]) extends T_B[T_A[T_A[(Boolean,Char)]], (T_B[Char, Byte],T_A[Char])]
case class CC_D(a: Boolean, b: T_A[T_A[CC_C]]) extends T_B[T_A[T_A[(Boolean,Char)]], (T_B[Char, Byte],T_A[Char])]

val v_a: T_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_D(_, _), CC_A(_, _, _), _), _) => 0 
  case CC_B(CC_A(CC_D(_, _), CC_B(_, _), _), _) => 1 
  case CC_B(CC_B(_, CC_D(_, _)), _) => 2 
}
}
// This is not matched: CC_A(_, _, _)