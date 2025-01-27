package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[T_A[(Boolean,Char), (Char,Byte)], T_A[Int, (Char,Char)]]]
case class CC_B[D](a: Char, b: CC_A[D], c: CC_A[D]) extends T_A[D, T_A[T_A[(Boolean,Char), (Char,Byte)], T_A[Int, (Char,Char)]]]
case class CC_C[E](a: CC_A[E], b: CC_A[CC_B[E]], c: T_A[E, E]) extends T_A[E, T_A[T_A[(Boolean,Char), (Char,Byte)], T_A[Int, (Char,Char)]]]

val v_a: T_A[Char, T_A[T_A[(Boolean,Char), (Char,Byte)], T_A[Int, (Char,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A('x'), _) => 1 
  case CC_B(_, CC_A(_), _) => 2 
  case CC_C(CC_A(_), CC_A(CC_B(_, _, _)), _) => 3 
}
}