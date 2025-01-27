package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[D, D], b: E) extends T_A[T_A[T_B[Boolean], (Int,Int)], D]
case class CC_B[F, G]() extends T_A[T_A[T_B[Boolean], (Int,Int)], F]
case class CC_C(a: T_A[Boolean, T_B[Int]]) extends T_A[T_A[T_B[Boolean], (Int,Int)], T_B[T_B[Boolean]]]

val v_a: T_A[T_A[T_B[Boolean], (Int,Int)], T_B[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}