package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[T_B[T_A[Boolean, Char]], Char]) extends T_A[D, Char]
case class CC_B(a: Int, b: CC_A[T_A[Char, Char]], c: T_A[(Boolean,Byte), T_B[Char]]) extends T_A[T_A[CC_A[Char], Char], Char]
case class CC_C(a: T_A[T_B[CC_B], Char], b: T_A[(CC_B,(Boolean,Byte)), Char], c: Char) extends T_A[T_A[CC_A[Char], Char], Char]
case class CC_D[F]() extends T_B[F]
case class CC_E[G](a: CC_B, b: CC_C, c: T_B[G]) extends T_B[G]

val v_a: T_A[T_A[CC_A[Char], Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_B(12, CC_A(_), _) => 1 
  case CC_B(_, CC_A(_), _) => 2 
  case CC_C(CC_A(_), CC_A(_), _) => 3 
}
}