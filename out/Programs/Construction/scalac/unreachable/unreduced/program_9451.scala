package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_B[D], c: T_B[D]) extends T_A[T_A[((Char,Char),Byte), T_A[Boolean, Int]], D]
case class CC_B[E](a: T_B[E], b: (T_B[Char],Boolean)) extends T_A[T_A[((Char,Char),Byte), T_A[Boolean, Int]], E]
case class CC_C[F](a: T_B[F]) extends T_B[F]

val v_a: T_A[T_A[((Char,Char),Byte), T_A[Boolean, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(CC_C(_)), CC_C(CC_C(_))) => 0 
  case CC_B(_, (CC_C(_),_)) => 1 
}
}