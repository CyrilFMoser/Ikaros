package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, (Boolean,Boolean)], b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_D[C]() extends T_B[Boolean, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, CC_A(_, _)) => 1 
}
}
// This is not matched: (CC_B Wildcard (T_A (Tuple Char Boolean) (T_B Char)))