package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[Int, D], b: T_A[Int, D]) extends T_A[Int, D]
case class CC_B[E](a: T_B[T_B[E]], b: T_A[E, E], c: T_B[E]) extends T_B[E]
case class CC_C(a: Byte, b: CC_A[T_B[(Char,Byte)]]) extends T_B[Char]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _, _), _, CC_B(_, _, _)), _, CC_B(CC_B(_, _, _), _, CC_B(_, _, _))) => 0 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_B(_, _, _)), _, CC_B(CC_B(_, _, _), _, CC_C(_, _))) => 1 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_B(_, _, _)), _, CC_C(_, _)) => 2 
  case CC_C(_, CC_A(CC_A(_, _), CC_A(_, _))) => 3 
}
}