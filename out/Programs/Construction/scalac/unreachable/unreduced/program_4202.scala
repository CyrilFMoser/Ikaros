package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Byte, b: T_A[T_B[E, E], E], c: T_B[E, E]) extends T_A[T_B[E, E], E]
case class CC_B[F]() extends T_A[T_B[F, F], F]
case class CC_C(a: T_A[T_B[(Int,Boolean), (Int,Boolean)], (Int,Boolean)], b: T_B[T_A[Byte, Boolean], CC_B[Boolean]], c: CC_A[T_B[Byte, Boolean]]) extends T_B[CC_A[T_B[(Boolean,Byte), Int]], (Int,T_A[Char, Boolean])]
case class CC_D() extends T_B[CC_A[T_B[(Boolean,Byte), Int]], (Int,T_A[Char, Boolean])]

val v_a: T_A[T_B[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(), _) => 1 
  case CC_B() => 2 
}
}