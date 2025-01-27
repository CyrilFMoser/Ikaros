package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, D]) extends T_A[C, T_A[T_A[Boolean, Byte], T_A[Boolean, Int]]]
case class CC_B(a: T_A[(Int,Boolean), T_A[Boolean, Boolean]]) extends T_A[CC_A[(Char,Char), T_A[(Char,Int), Char]], T_A[T_A[Boolean, Byte], T_A[Boolean, Int]]]
case class CC_C[E](a: Int) extends T_A[E, T_A[E, E]]

val v_a: T_A[CC_A[(Char,Char), T_A[(Char,Int), Char]], T_A[T_A[Boolean, Byte], T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}