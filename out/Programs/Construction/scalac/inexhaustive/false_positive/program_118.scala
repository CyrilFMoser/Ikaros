package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Byte]], b: T_A[T_B[Int]], c: T_A[T_B[Char]]) extends T_A[T_B[Char]]
case class CC_B(a: CC_A) extends T_A[T_B[Char]]

val v_a: T_A[T_B[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, CC_A(_, _, _))) => 1 
}
}
// This is not matched: CC_B()