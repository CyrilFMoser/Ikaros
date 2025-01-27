package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Boolean,T_A[Byte]), b: T_A[T_A[Char]]) extends T_A[T_A[Char]]
case class CC_B(a: T_A[Int], b: CC_A, c: Byte) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, CC_A(_, _)), _) => 1 
}
}
// This is not matched: CC_B(_, CC_A(_, CC_B(_, _, _)), _)