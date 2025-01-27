package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[((Int,Char),Boolean), T_B[Boolean]], b: T_B[T_A[Int, Byte]], c: T_A[T_B[Boolean], T_A[Char, (Int,Byte)]]) extends T_A[T_B[T_B[Int]], T_A[T_A[Boolean, Boolean], Char]]
case class CC_B[D](a: CC_A) extends T_B[D]
case class CC_C[E](a: E, b: T_B[T_A[E, E]]) extends T_B[E]
case class CC_D(a: CC_A, b: CC_C[(Char,CC_A)], c: Int) extends T_B[T_B[T_B[CC_A]]]

val v_a: T_B[T_B[T_B[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, CC_B(_), _)) => 0 
  case CC_B(CC_A(_, CC_C(_, _), _)) => 1 
  case CC_C(_, _) => 2 
  case CC_D(CC_A(_, _, _), CC_C((_,_), CC_C(_, _)), _) => 3 
}
}
// This is not matched: CC_D(CC_A(_, _, _), CC_C((_,_), CC_B(_)), _)