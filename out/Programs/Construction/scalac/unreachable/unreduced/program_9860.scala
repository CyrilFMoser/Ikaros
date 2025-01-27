package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D]) extends T_A[D]
case class CC_B[E](a: CC_A[T_A[E]], b: Boolean, c: T_A[E]) extends T_A[E]
case class CC_C(a: T_A[CC_A[Boolean]], b: CC_A[T_A[(Char,Byte)]], c: Int) extends T_B[CC_B[T_B[Boolean, Int]], T_A[T_A[Int]]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _, _))) => 1 
  case CC_A(_, CC_B(CC_A(_, _), _, _)) => 2 
  case CC_B(_, _, _) => 3 
}
}