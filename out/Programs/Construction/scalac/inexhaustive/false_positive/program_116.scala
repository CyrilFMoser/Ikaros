package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: T_B[T_A, T_B[(Boolean,Boolean), CC_A]]) extends T_A
case class CC_D[C]() extends T_B[C, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
}
}
// This is not matched: CC_D(_, _, CC_A())