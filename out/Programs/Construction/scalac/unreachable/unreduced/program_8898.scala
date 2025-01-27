package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: (Byte,T_A[Int, Int])) extends T_A[T_A[Int, T_B[(Char,Char)]], D]
case class CC_B[E](a: CC_A[E], b: (CC_A[Char],CC_A[(Byte,Boolean)]), c: T_B[E]) extends T_A[T_A[Int, T_B[(Char,Char)]], E]
case class CC_C[F](a: Int, b: Int) extends T_A[F, CC_B[F]]

val v_a: T_A[T_A[Int, T_B[(Char,Char)]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(CC_A(_, _), _, _) => 1 
}
}