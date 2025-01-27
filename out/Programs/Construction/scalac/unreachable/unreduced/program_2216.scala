package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[Char], b: T_B[T_B[(Boolean,Char), Boolean], T_A[Int]], c: T_A[Int]) extends T_A[Char]
case class CC_B(a: T_A[CC_A]) extends T_A[Char]
case class CC_C[D, E](a: Byte) extends T_B[E, D]
case class CC_D(a: T_A[CC_B]) extends T_B[CC_B, Char]
case class CC_E[G, F](a: T_B[CC_B, Char], b: Char) extends T_B[F, G]

val v_a: CC_E[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_E(CC_C(_), _) => 0 
  case CC_E(CC_D(_), _) => 1 
  case CC_E(CC_E(CC_C(_), _), _) => 2 
  case CC_E(CC_E(CC_D(_), _), _) => 3 
  case CC_E(CC_E(CC_E(_, _), _), _) => 4 
}
}