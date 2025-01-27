package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_B[Int], T_B[Boolean]]) extends T_A[(T_A[Char, Char],Char), T_A[Int, T_A[Char, Byte]]]
case class CC_B() extends T_A[(T_A[Char, Char],Char), T_A[Int, T_A[Char, Byte]]]
case class CC_C[D](a: D) extends T_B[D]
case class CC_D[E](a: T_B[CC_A], b: E) extends T_B[CC_A]
case class CC_E[F](a: F, b: (T_B[Boolean],Byte), c: CC_D[F]) extends T_B[F]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_)) => 0 
  case CC_D(CC_C(CC_A(_)), _) => 1 
  case CC_D(CC_D(_, _), _) => 2 
  case CC_E(_, (CC_C(_),_), CC_D(_, _)) => 3 
  case CC_E(_, (CC_E(_, _, _),_), CC_D(_, _)) => 4 
}
}
// This is not matched: CC_D(CC_E(CC_A(_), (_,_), CC_D(_, _)), _)