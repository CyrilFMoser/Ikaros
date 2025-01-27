package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_A, CC_A], b: CC_A, c: T_A) extends T_A
case class CC_C[C](a: T_A, b: Char) extends T_B[C, Char]
case class CC_D(a: CC_B, b: CC_A, c: (T_B[T_A, Char],T_B[CC_B, Char])) extends T_B[CC_A, Char]

val v_a: T_B[CC_D, Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), _) => 0 
  case CC_C(CC_B(_, CC_A(), CC_A()), _) => 1 
}
}
// This is not matched: CC_C(CC_B(_, CC_A(), CC_B(_, _, _)), _)