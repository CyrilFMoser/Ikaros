package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Int,T_A[Int, Byte]), b: T_A[T_A[Char, C], C], c: T_A[C, C]) extends T_A[C, T_A[T_A[Boolean, (Int,Char)], Char]]
case class CC_B[D, E](a: CC_A[D], b: CC_A[D]) extends T_A[D, T_A[T_A[Boolean, (Int,Char)], Char]]
case class CC_C[F](a: Int) extends T_A[F, T_A[T_A[Boolean, (Int,Char)], Char]]

val v_a: T_A[Int, T_A[T_A[Boolean, (Int,Char)], Char]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B(_, CC_A(_, _, _)) => 1 
  case CC_C(_) => 2 
}
}