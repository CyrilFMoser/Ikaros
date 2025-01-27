package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: (T_A,(CC_A,(Boolean,Char))), b: T_B[T_A, T_B[CC_A, Char]], c: Char) extends T_A
case class CC_C[C](a: CC_A, b: C) extends T_B[CC_A, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_A(),(_,_)), _, _) => 1 
}
}
// This is not matched: CC_B((CC_B(_, _, _),(_,_)), _, _)