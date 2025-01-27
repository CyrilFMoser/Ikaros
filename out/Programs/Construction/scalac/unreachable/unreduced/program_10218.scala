package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: (Int,(T_A,(Char,Byte))), b: T_B[T_A, T_A]) extends T_A
case class CC_C[C]() extends T_B[T_B[C, C], C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((12,(_,_)), _) => 1 
}
}
// This is not matched: CC_B((_,(_,_)), _)