package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Boolean], b: T_A[Int, C], c: T_A[C, Boolean]) extends T_A[C, Boolean]
case class CC_B() extends T_A[T_A[Char, Int], Boolean]

val v_a: T_A[T_A[Char, Int], Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, _, CC_A(_, _, _)) => 1 
}
}
// This is not matched: (CC_B Byte (CC_A Byte Wildcard (T_A Byte)) Wildcard (T_A Byte))