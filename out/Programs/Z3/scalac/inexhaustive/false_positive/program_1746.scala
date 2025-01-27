package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (Char,Int)) extends T_A[T_A[Int, Boolean], C]

val v_a: T_A[T_A[Int, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, ('x',_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants