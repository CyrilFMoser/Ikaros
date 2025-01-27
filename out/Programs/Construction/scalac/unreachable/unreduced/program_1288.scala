package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: D, c: T_A[D, D]) extends T_A[Char, D]
case class CC_B[E](a: Boolean, b: T_A[Char, E]) extends T_A[Char, E]
case class CC_C(a: T_A[CC_B[Boolean], T_A[Int, (Byte,Int)]], b: T_A[Char, Int]) extends T_B[(T_A[Char, Int],Int)]
case class CC_D[F](a: F) extends T_B[F]

val v_a: T_A[Char, CC_C] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(_, _), _) => 0 
  case CC_B(_, CC_A(_, _, _)) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
}
}