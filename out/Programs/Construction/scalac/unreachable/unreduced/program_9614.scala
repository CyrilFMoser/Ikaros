package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int, b: T_A, c: T_B[((Int,Byte),T_A), Int]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_B[T_B[Char, (Char,Boolean)], T_B[CC_B, CC_B]]) extends T_A
case class CC_D[C](a: Char, b: Boolean, c: T_B[CC_C, C]) extends T_B[CC_C, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(_, _, _)