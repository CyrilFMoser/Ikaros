package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: C) extends T_A[C, T_A[Char, Boolean]]
case class CC_B() extends T_A[Char, T_A[Char, Boolean]]

val v_a: CC_A[T_A[Char, T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: Pattern match is empty without constants