package Program_31 

object Test {
sealed trait T_B[C]
case class CC_B() extends T_B[Char]
case class CC_D(a: T_B[CC_B], b: T_B[Char]) extends T_B[Char]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_D(_, CC_D(_, _)) => 1 
}
}
// This is not matched: (CC_A T_A)