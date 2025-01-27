package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Boolean], T_A[(Int,Byte)]], b: T_A[T_B[(Boolean,Boolean), Int]], c: T_A[Int]) extends T_A[((Byte,Char),T_B[Int, Char])]
case class CC_B[D](a: D, b: T_B[D, D], c: D) extends T_A[D]
case class CC_C(a: T_A[T_B[CC_A, CC_A]], b: T_A[T_B[(Char,Char), CC_A]]) extends T_A[((Byte,Char),T_B[Int, Char])]
case class CC_D[E](a: T_B[E, Boolean]) extends T_B[E, Boolean]
case class CC_E(a: T_B[T_A[Int], CC_B[CC_C]]) extends T_B[T_A[T_A[CC_C]], Boolean]
case class CC_F[F](a: Byte) extends T_B[F, Boolean]

val v_a: T_A[((Byte,Char),T_B[Int, Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B(_, _, _), CC_B(_, _, _)) => 0 
  case CC_B(((_,_),_), _, ((_,_),_)) => 1 
  case CC_C(_, _) => 2 
}
}