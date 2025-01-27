package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Boolean]]) extends T_A[Char]
case class CC_B(a: CC_A, b: T_B[T_A[Char], (Int,CC_A)], c: T_A[Char]) extends T_A[Char]
case class CC_C(a: Char) extends T_A[Char]
case class CC_D[E, D]() extends T_B[E, D]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_D(), _) => 1 
  case CC_C(_) => 2 
}
}