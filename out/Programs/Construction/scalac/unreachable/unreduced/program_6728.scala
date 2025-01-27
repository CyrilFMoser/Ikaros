package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: T_A[(Boolean,Boolean)], c: T_A[T_A[Boolean]]) extends T_A[T_A[(Int,Char)]]
case class CC_B(a: Char, b: CC_A, c: CC_A) extends T_A[T_A[(Int,Char)]]
case class CC_C(a: Int) extends T_A[T_A[(Int,Char)]]

val v_a: T_A[T_A[(Int,Char)]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(_, _, _)