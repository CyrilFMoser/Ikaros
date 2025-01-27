package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: Char) extends T_A
case class CC_D[C]() extends T_B[C, Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
}
}
// This is not matched: (CC_A (T_A Char)
//      Wildcard
//      (CC_B Wildcard (T_A (T_A Char)))
//      Wildcard
//      (T_A (T_A Char)))