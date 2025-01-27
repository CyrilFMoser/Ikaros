package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Char, b: T_B[D], c: T_A[D, D]) extends T_A[T_B[T_A[Int, Boolean]], D]
case class CC_B[E]() extends T_A[T_B[T_A[Int, Boolean]], E]
case class CC_C[F](a: ((Char,Boolean),Byte), b: CC_A[F], c: F) extends T_A[T_B[T_A[Int, Boolean]], F]
case class CC_D(a: CC_A[CC_A[Byte]], b: (CC_C[Boolean],CC_A[Int])) extends T_B[Boolean]
case class CC_E(a: (T_A[CC_D, CC_D],Char), b: Boolean) extends T_B[Boolean]
case class CC_F(a: (CC_A[CC_E],CC_D), b: Byte) extends T_B[Boolean]

val v_a: T_A[T_B[T_A[Int, Boolean]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(((_,_),_), CC_A(_, _, _), _)