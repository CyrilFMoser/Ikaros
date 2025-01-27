package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: (T_A,CC_A), b: T_B[CC_A]) extends T_A
case class CC_C(a: T_B[CC_A]) extends T_A
case class CC_D(a: CC_A) extends T_B[Int]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_A(),CC_A()), _) => 1 
  case CC_B((CC_B(_, _),CC_A()), _) => 2 
  case CC_C(_) => 3 
}
}
// This is not matched: CC_B((CC_C(_),CC_A()), _)