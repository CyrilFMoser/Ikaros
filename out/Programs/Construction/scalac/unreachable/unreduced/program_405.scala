package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[CC_A], b: Char, c: (T_A,Boolean)) extends T_B[CC_A]
case class CC_C(a: T_A) extends T_B[CC_A]
case class CC_D(a: T_B[Int], b: T_A, c: CC_C) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, _, _) => 1 
}
}
// This is not matched: CC_B(_, _, _)