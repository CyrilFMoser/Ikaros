package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (Byte,T_B[Byte, Boolean]), b: T_A[T_A[E, E], E], c: T_A[E, E]) extends T_A[T_A[E, E], E]
case class CC_B(a: T_B[T_A[Int, Int], T_A[Int, Boolean]], b: CC_A[(Byte,Byte)], c: T_A[CC_A[Boolean], T_B[Byte, Byte]]) extends T_A[T_A[CC_A[T_B[Byte, (Char,Boolean)]], CC_A[T_B[Byte, (Char,Boolean)]]], CC_A[T_B[Byte, (Char,Boolean)]]]
case class CC_C(a: T_B[T_B[CC_B, Boolean], Char]) extends T_A[T_A[CC_A[T_B[Byte, (Char,Boolean)]], CC_A[T_B[Byte, (Char,Boolean)]]], CC_A[T_B[Byte, (Char,Boolean)]]]

val v_a: T_A[T_A[CC_A[T_B[Byte, (Char,Boolean)]], CC_A[T_B[Byte, (Char,Boolean)]]], CC_A[T_B[Byte, (Char,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), CC_B(_, _, _), _) => 0 
  case CC_A((_,_), CC_C(_), _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C(_) => 3 
}
}
// This is not matched: CC_A((_,_), CC_A(_, _, _), _)