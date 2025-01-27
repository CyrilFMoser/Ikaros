package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, (Int,Boolean)],T_A[Char, Int]), b: Boolean, c: Int) extends T_A[C, T_A[T_A[Byte, Boolean], T_A[Boolean, (Char,Int)]]]
case class CC_B[D](a: T_A[D, D]) extends T_A[D, T_A[T_A[Byte, Boolean], T_A[Boolean, (Char,Int)]]]
case class CC_C[E](a: T_A[E, E], b: CC_A[E], c: CC_A[E]) extends T_A[E, T_A[T_A[Byte, Boolean], T_A[Boolean, (Char,Int)]]]

val v_a: T_A[Int, T_A[T_A[Byte, Boolean], T_A[Boolean, (Char,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, CC_A(_, _, _), _) => 1 
}
}
// This is not matched: CC_B(_)