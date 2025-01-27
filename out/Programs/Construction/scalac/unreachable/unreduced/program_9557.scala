package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[T_A[(Boolean,Int), (Boolean,Int)], T_A[T_A[(Boolean,Int), (Boolean,Int)], T_A[(Boolean,Int), (Boolean,Int)]]], c: T_A[Char, C]) extends T_A[C, T_A[C, C]]
case class CC_B[E](a: E) extends T_A[E, T_A[E, E]]
case class CC_C[F](a: Int) extends T_A[F, T_A[Int, T_A[Boolean, Int]]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_A(_, CC_A(_, CC_B(_), _), _) => 1 
  case CC_A(_, CC_B(_), _) => 2 
  case CC_B(_) => 3 
}
}