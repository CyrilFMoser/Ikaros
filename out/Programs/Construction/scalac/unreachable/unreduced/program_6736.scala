package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: ((Int,Char),T_B[Char])) extends T_A[D, T_B[D]]
case class CC_B[E](a: Char, b: T_A[E, E]) extends T_A[E, T_B[E]]
case class CC_C[F](a: T_B[F], b: CC_B[F], c: F) extends T_B[F]
case class CC_D(a: Char) extends T_B[CC_B[CC_A[Int]]]

val v_a: T_B[CC_B[CC_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, CC_B(_, _), _), CC_B(_, _), CC_B(_, _)) => 0 
  case CC_C(CC_D(_), CC_B(_, _), CC_B(_, _)) => 1 
  case CC_D(_) => 2 
}
}