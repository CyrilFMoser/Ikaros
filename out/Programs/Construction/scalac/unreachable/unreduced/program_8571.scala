package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Int], b: T_A[T_A[C, C], C], c: T_A[C, C]) extends T_A[C, T_A[T_A[Int, Int], (Boolean,Boolean)]]
case class CC_B[D, E](a: (Boolean,Char), b: CC_A[D]) extends T_A[D, T_A[T_A[Int, Int], (Boolean,Boolean)]]
case class CC_C[F](a: CC_A[F], b: Boolean) extends T_A[F, T_A[T_A[Int, Int], (Boolean,Boolean)]]

val v_a: T_A[Char, T_A[T_A[Int, Int], (Boolean,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, _, _)) => 1 
  case CC_C(_, _) => 2 
}
}