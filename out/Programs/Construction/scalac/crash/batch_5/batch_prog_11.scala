package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: D, b: C, c: T_A[C, D]) extends T_A[D, C]
case class CC_B[F, E](a: CC_A[E, F], b: (Char,T_A[Byte, Boolean]), c: CC_A[E, F]) extends T_A[E, F]
case class CC_C(a: T_A[T_A[Byte, Boolean], T_A[Int, Boolean]]) extends T_A[T_A[CC_A[Byte, Boolean], CC_B[Boolean, Boolean]], (T_A[Char, Int],Char)]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B(CC_A(_, _, _), (_,_), CC_A(_, _, _))) => 1 
  case CC_B(_, _, _) => 2 
}
}