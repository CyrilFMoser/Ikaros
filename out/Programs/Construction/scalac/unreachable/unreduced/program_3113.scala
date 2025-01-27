package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[(Char,Int), T_A[Int, C]]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: Char, b: T_A[T_A[D, D], D], c: (Char,Char)) extends T_A[T_A[D, D], D]
case class CC_C(a: T_A[T_A[CC_A[Byte], CC_A[Byte]], CC_A[Byte]]) extends T_A[T_A[T_A[T_A[T_A[Boolean, Boolean], T_A[Boolean, Boolean]], T_A[Boolean, Boolean]], T_A[T_A[T_A[Boolean, Boolean], T_A[Boolean, Boolean]], T_A[Boolean, Boolean]]], T_A[T_A[T_A[Boolean, Boolean], T_A[Boolean, Boolean]], T_A[Boolean, Boolean]]]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), (_,_)) => 1 
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), (_,_)) => 2 
}
}
// This is not matched: CC_B(_, CC_B(_, CC_A(_), _), (_,_))