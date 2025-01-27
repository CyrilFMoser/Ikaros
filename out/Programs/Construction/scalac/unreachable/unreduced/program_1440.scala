package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[(Int,Int)]], b: T_B[T_A[Int]]) extends T_A[T_B[T_B[Boolean]]]
case class CC_B(a: T_B[T_B[CC_A]]) extends T_A[T_B[T_B[Boolean]]]
case class CC_C(a: ((CC_B,Byte),T_A[CC_B]), b: T_B[Byte], c: CC_B) extends T_A[T_B[T_B[Boolean]]]
case class CC_D[C](a: T_B[C]) extends T_B[C]
case class CC_E[D](a: (Int,T_B[Char]), b: T_A[D]) extends T_B[D]
case class CC_F[E](a: CC_E[E]) extends T_B[E]

val v_a: T_A[T_B[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(_)) => 0 
  case CC_A(_, CC_E(_, _)) => 1 
  case CC_A(_, CC_F(_)) => 2 
  case CC_B(CC_D(_)) => 3 
  case CC_B(CC_E(_, _)) => 4 
  case CC_B(CC_F(_)) => 5 
  case CC_C(_, _, _) => 6 
}
}