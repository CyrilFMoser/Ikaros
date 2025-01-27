package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[F, F], b: T_B[E, E], c: T_A[F, F]) extends T_A[F, E]
case class CC_B[H, G]() extends T_A[H, G]
case class CC_C(a: CC_B[T_B[Byte, Int], (Char,Char)], b: T_A[CC_A[Char, Byte], CC_A[Char, Int]], c: T_A[T_B[Char, Byte], T_A[Boolean, (Boolean,Byte)]]) extends T_B[T_B[T_A[Int, Boolean], Char], CC_A[CC_A[Byte, Byte], CC_B[Boolean, Char]]]
case class CC_D(a: T_A[T_A[Char, Byte], CC_A[CC_C, CC_C]], b: T_A[CC_A[CC_C, CC_C], Int]) extends T_B[T_A[T_A[CC_C, Byte], CC_C], (T_A[(Boolean,Boolean), CC_C],Boolean)]

val v_a: T_A[CC_C, CC_D] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_A(_, _, CC_B())