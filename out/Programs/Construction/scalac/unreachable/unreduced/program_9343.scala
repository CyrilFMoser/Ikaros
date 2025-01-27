package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[(Char,Boolean)]], b: T_A[T_A[Boolean]]) extends T_A[T_A[T_A[Char]]]
case class CC_B() extends T_A[T_A[T_A[Char]]]
case class CC_C(a: T_A[(CC_B,Boolean)], b: Int, c: CC_A) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _, _)