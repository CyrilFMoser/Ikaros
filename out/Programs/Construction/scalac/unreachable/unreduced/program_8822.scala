package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: E) extends T_A[E, T_B[T_B[Boolean, (Char,Int)], T_B[Char, Char]]]
case class CC_B[F](a: T_A[F, F]) extends T_A[F, T_B[T_B[Boolean, (Char,Int)], T_B[Char, Char]]]
case class CC_C() extends T_A[CC_B[Int], T_B[T_B[Boolean, (Char,Int)], T_B[Char, Char]]]

val v_a: T_A[CC_B[Int], T_B[T_B[Boolean, (Char,Int)], T_B[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_), CC_B(_)) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}