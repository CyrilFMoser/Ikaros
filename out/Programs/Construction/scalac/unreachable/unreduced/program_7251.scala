package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_B[D], c: T_B[D]) extends T_A[T_B[T_B[Byte]], D]
case class CC_B(a: (Char,Byte)) extends T_A[(T_B[Int],Char), T_B[Int]]
case class CC_C[F, E](a: (CC_B,Int), b: T_A[E, E], c: F) extends T_A[F, E]
case class CC_D(a: T_A[T_B[CC_B], Char], b: T_B[(Byte,CC_B)]) extends T_B[(Char,CC_C[CC_B, (Char,Byte)])]

val v_a: T_A[(T_B[Int],Char), T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_B((_,_)) => 0 
  case CC_C((CC_B(_),_), CC_C((_,_), CC_C(_, _, _), _), (_,_)) => 1 
}
}