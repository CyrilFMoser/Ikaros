package Program_63 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: T_B[CC_B, CC_B], c: CC_A) extends T_A
case class CC_D[C]() extends T_B[C, CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_, _, CC_A(CC_C(_, _, _))) => 2 
}
}
// This is not matched: CC_A(_)