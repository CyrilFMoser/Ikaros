package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B, T_B], T_A[T_B, Int]]) extends T_A[Boolean, T_A[T_B, Char]]
case class CC_B() extends T_A[Boolean, T_A[T_B, Char]]
case class CC_C(a: Boolean, b: CC_B) extends T_A[Boolean, T_A[T_B, Char]]
case class CC_D(a: CC_A, b: T_A[Boolean, T_A[T_B, Char]], c: T_A[CC_B, CC_B]) extends T_B
case class CC_E(a: Int, b: T_A[Boolean, T_A[T_B, Char]]) extends T_B

val v_a: T_A[Boolean, T_A[T_B, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}