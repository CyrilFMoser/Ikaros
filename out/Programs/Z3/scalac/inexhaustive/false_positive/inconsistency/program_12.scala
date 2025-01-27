package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_B[Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_A Int Char Wildcard Wildcard (T_A Int Char))