package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[T_A[T_A[T_B, Char], T_A[T_B, Char]], Char], c: C) extends T_A[C, Char]
case class CC_B[E](a: CC_A[E]) extends T_A[E, Char]
case class CC_C[F](a: T_A[F, Char], b: F, c: CC_A[F]) extends T_A[(T_A[T_B, Char],Byte), Char]

val v_a: T_A[(T_A[T_B, Char],Byte), Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), (CC_A(_, _, _),_)) => 0 
  case CC_A(_, CC_B(_), (CC_A(_, _, _),_)) => 1 
  case CC_A(_, CC_A(_, _, _), (CC_B(_),_)) => 2 
  case CC_A(_, CC_B(_), (CC_B(_),_)) => 3 
  case CC_B(_) => 4 
  case CC_C(_, _, _) => 5 
}
}