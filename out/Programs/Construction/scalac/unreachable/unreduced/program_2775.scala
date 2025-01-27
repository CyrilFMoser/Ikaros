package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[Boolean]) extends T_A[Boolean]
case class CC_B(a: T_B[(CC_A,CC_A), T_B[CC_A, CC_A]], b: Byte) extends T_A[Boolean]
case class CC_C(a: Boolean, b: CC_A) extends T_A[Boolean]
case class CC_D[D](a: T_B[D, Char]) extends T_B[D, Char]
case class CC_E(a: CC_D[T_B[CC_B, CC_A]]) extends T_B[CC_A, Char]
case class CC_F(a: T_B[T_B[Boolean, Char], Char], b: CC_A, c: (T_A[CC_B],CC_E)) extends T_B[Boolean, Char]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _))) => 1 
  case CC_A(CC_A(CC_C(_, _))) => 2 
  case CC_A(CC_B(_, _)) => 3 
  case CC_A(CC_C(_, CC_A(_))) => 4 
  case CC_C(_, CC_A(CC_A(_))) => 5 
  case CC_C(_, CC_A(CC_B(_, _))) => 6 
  case CC_C(_, CC_A(CC_C(_, _))) => 7 
}
}
// This is not matched: CC_B(_, _)