package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (Boolean,Byte)) extends T_A[T_A[Char, Char], C]

val v_a: T_A[T_A[Char, Char], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,0)) => 0 
}
}
// This is not matched: (CC_C Int Wildcard Wildcard (CC_A Int (T_A Int)) (T_A Int))