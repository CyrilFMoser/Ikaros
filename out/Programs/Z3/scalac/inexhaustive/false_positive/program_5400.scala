package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_C[C]() extends T_B[C, CC_A]
case class CC_D[D](a: T_B[D, CC_A]) extends T_B[D, CC_A]

val v_a: CC_D[Int] = null
val v_b: Int = v_a match{
  case CC_D(CC_C()) => 0 
}
}
// This is not matched: Pattern match is empty without constants