package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_B[CC_A, CC_A], T_B[CC_A, Char]]) extends T_A
case class CC_C(a: Int, b: T_B[T_A, T_B[(Boolean,Char), (Int,Boolean)]], c: Int) extends T_A
case class CC_D[C]() extends T_B[C, (Char,CC_A)]
case class CC_E() extends T_B[(CC_B,CC_C), CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _, 12) => 1 
  case CC_C(_, _, _) => 2 
}
}
// This is not matched: CC_B(_)