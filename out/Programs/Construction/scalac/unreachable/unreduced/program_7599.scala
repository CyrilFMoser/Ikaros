package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Boolean]], b: T_A[Char], c: T_A[Char]) extends T_A[Char]
case class CC_B[C](a: CC_A) extends T_B[C]
case class CC_C[D](a: T_A[D], b: T_B[CC_B[CC_A]]) extends T_B[D]
case class CC_D[E](a: T_B[E], b: T_A[Char]) extends T_B[E]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 0 
  case CC_C(CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), _) => 1 
  case CC_D(_, _) => 2 
}
}