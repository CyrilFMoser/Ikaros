package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Boolean]]) extends T_A[T_A[T_B[Byte]]]
case class CC_B(a: T_A[Char], b: T_A[Int]) extends T_A[T_A[T_B[Byte]]]
case class CC_C[C](a: (T_B[(Char,Byte)],T_B[CC_B]), b: (T_B[Byte],T_B[CC_B]), c: CC_A) extends T_B[C]
case class CC_D[D](a: CC_B) extends T_B[D]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_C((CC_C(_, _, _),CC_C(_, _, _)), _, CC_A(_)) => 0 
  case CC_C((CC_C(_, _, _),CC_D(_)), _, CC_A(_)) => 1 
  case CC_C((CC_D(_),CC_C(_, _, _)), _, CC_A(_)) => 2 
  case CC_C((CC_D(_),CC_D(_)), _, CC_A(_)) => 3 
  case CC_D(CC_B(_, _)) => 4 
}
}