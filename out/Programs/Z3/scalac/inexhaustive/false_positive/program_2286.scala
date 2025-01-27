package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (Boolean,Int)) extends T_A[T_A[C, C], C]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,12)) => 0 
}
}
// This is not matched: (CC_A Char Wildcard (T_A Char))