package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_B[C, T_B[C, C]], b: (T_B[T_A, Boolean],Char), c: T_A) extends T_A
case class CC_B[D](a: CC_A[D]) extends T_B[Char, D]
case class CC_C[E](a: (T_A,T_B[Char, T_A]), b: Boolean, c: T_B[Char, E]) extends T_B[Char, E]
case class CC_D[F](a: F, b: T_A) extends T_B[Char, F]

val v_a: T_B[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, (_,_), CC_A(_, _, _))) => 0 
  case CC_C((CC_A(_, _, _),CC_B(_)), _, _) => 1 
  case CC_C((CC_A(_, _, _),CC_C(_, _, _)), _, _) => 2 
  case CC_C((CC_A(_, _, _),CC_D(_, _)), _, _) => 3 
  case CC_D(_, CC_A(_, (_,_), CC_A(_, _, _))) => 4 
}
}