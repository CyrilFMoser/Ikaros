package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D[E, D](a: T_A) extends T_B[E, D]

val v_a: CC_D[Char, CC_C] = null
val v_b: Int = v_a match{
  case CC_D(CC_B()) => 0 
}
}
// This is not matched: (CC_A (CC_B Boolean Boolean Boolean Boolean)
//      (T_A Boolean (CC_B Boolean Boolean Boolean Boolean)))