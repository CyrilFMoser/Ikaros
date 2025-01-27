package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Boolean], b: T_B) extends T_A[Char]
case class CC_B(a: T_B, b: T_A[T_A[Char]], c: T_A[Char]) extends T_A[Char]
case class CC_C[B]() extends T_A[Char]
case class CC_D(a: T_B, b: T_B) extends T_B

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(_, CC_D(_, _))) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}