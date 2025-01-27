package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_A[D, T_B[Int]], c: T_B[D]) extends T_A[D, T_B[T_A[Char, (Int,Boolean)]]]
case class CC_B[E, F](a: Boolean, b: Boolean) extends T_A[E, T_B[T_A[Char, (Int,Boolean)]]]

val v_a: T_A[Int, T_B[T_A[Char, (Int,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(12, _, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(_, _) => 2 
}
}