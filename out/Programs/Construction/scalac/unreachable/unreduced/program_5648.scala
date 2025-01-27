package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, (Char,T_A[Int, Char])]
case class CC_B[D](a: T_A[CC_A[D], D], b: CC_A[D]) extends T_A[D, (Char,T_A[Int, Char])]
case class CC_C[E, F](a: CC_A[F]) extends T_A[E, (Char,T_A[Int, Char])]

val v_a: T_A[Boolean, (Char,T_A[Int, Char])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_C(_) => 2 
}
}